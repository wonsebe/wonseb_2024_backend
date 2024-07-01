package day16.model.dao;
//day16 패키지 안에 model서브 패키지안에 dao 패키지를 선언
import day16.model.dto.MemberDto;
//day16패키지안에 model서브패키지안에 dto패키지안에 MemberDto클래스를 현재 파일에서 쓰겠다는 말

import java.sql.Connection;
//현재 파일에서 Connection 인터페이스를 사용하여 데이터베이스 연결을 설정하고 관리

import java.sql.DriverManager;
// 현재 파일에서 DriverManager 클래스를 사용하여 데이터베이스에 연결
import java.sql.PreparedStatement;
//현재 파일에서  SQL 쿼리를 데이터베이스에 보내기 전에 미리 컴파일하고, SQL 쿼리에 매개변수를 전달하여 실행 속도를 향상시키는 기능을 제공
import java.sql.ResultSet;
//현재 파일에서 데이터베이스로부터 SQL 쿼리를 실행한 결과를 받아올 때 사용
public class MemberDao {//공개형 클래스 MemberDao 선언

    //0.
    public static MemberDao mdao =new MemberDao(); //공개 static MemberDao클래스 안에 mdao를 선언하여 객체생성

    //0.DB연동
        //-JDBC 인터페이스 3개
    Connection conn;
    // 데이터베이스 연결을 설정하고 관리하는 Connection 인터페이스의 변수 conn을 선언
    PreparedStatement ps;
    // SQL 쿼리에 매개변수를 전달하여 실행 기능을 제공하는 PreparedStatement의 변수 ps 선언
    ResultSet rs;
    //데이터베이스로부터 SQL 쿼리를 실행한 결과를 받아올 때 사용하는 ResultSet의 변수 rs 선언
        //생성자에 연동 코드
    MemberDao(){ //DB에 연동

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//Java 프로그래밍에서 JDBC를 사용하여
            // MySQL 데이터베이스와 연결할 때 필요한 JDBC 드라이버를 로드하는 코드
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/day06","root",
                    "1234"); //MySQL 데이터베이스에 root 사용자로 접속하고,
            // 비밀번호는 "1234"로 설정하여 day06이라는 데이터베이스와의 연결을 설정하는 코드
        }//try e
        catch (Exception e){ //예외(Exception)를 처리하기 위한 코드 블록을 정의
            System.out.println("연동실패 "+e); //try 에서 연동을 실패하면 연동실패와 동시에 왜 오류가 났는지 설명해주는 e 의 값을 출력해준다
        } //c e

    }

    //1. 회원가입 화면 함수
    public boolean signup(MemberDto memberDto){//MemberDto클래스의 memberDto객체 값을 매개변수로 한 함수 signup 공개(public)로 하여
        // boolean 값을 반환한다는 메소드 정의

    try {
        //SQL 작성
        String sql="insert into member(mid,mpwd,mname,mphone) values(?, ?, ?, ?);";
        //DB에서 테이블의 속성값을 추가하는 insert 를 사용하여 아이디,비밀번호, 이름, 연락처를 추가하는 식이다
        //ps변수에 conn변수안에 prepareStatement SQL 기재
        ps=conn.prepareStatement(sql);
        ps.setString(1,memberDto.getMid()); //setString(?순서번호 ,값또는변수명)
        //ps 변수가 memberDto멤버변수가 아이디를 가져온 것을 참조하여 저장한다
        ps.setString(2,memberDto.getPmwd());
        //ps 변수가 memberDto멤버변수가 비밀번호를 가져온 것을 참조하여 저장한다
        ps.setString(3,memberDto.getMname());
        //ps 변수가 memberDto멤버변수가 이름을 가져온 것을 참조하여 저장한다
        ps.setString(4,memberDto.getMphone());
        //ps 변수가 memberDto멤버변수가 연락처를 가져온 것을 참조하여 저장한다
        int count= ps.executeUpdate();
        //정수형 count를 선언하여 변수 ps 를  executeUpdate 를 사용해 실행하고 나서 최신화하여 count에 대입
        if(count==1){ //count가 1이면 회원가입이 성공하여 반환값을 가지고 다시 초기화면으로 이동
            return true;
        }
    }//try e
    catch (Exception e){ //예외(Exception)를 처리하기 위한 코드 블록을 정의
        System.out.println(e);//try 에서 연동을 실패하면 연동실패와 동시에 왜 오류가 났는지 설명해주는 e 의 값을 출력해준다
    }//c e
    return  false; //회원가입을 실패하면 다시 초기화면으로 돌아감
    }//회원가입함수 끝

    //2. 로그인 화면 함수 : 로그인 성공한 회원번호 반환
    public  int login(MemberDto memberDto){  //MemberDto클래스의 memberDto객체 값을 매개변수로 한 함수 login 공개(public)로 하여
        // int로 값을 반환한다는 메소드 정의
    //1.SQL 작성
        try {
            String sql="select *from member where mid=? and mpwd=?;";
            //DB에서 테이블을 모두 출력하는 식을 문자열 변수 sql 에 대입
            ps=conn.prepareStatement(sql);
            //ps 변수에 데이터베이스 연결 변수 매개변수 sql를 호출한 conn의 준비혹은실행함수prepareStatement 를 호출한다.
            ps.setString(1, memberDto.getMid());
            //ps 변수가 memberDto멤버변수가 아이디를 가져온 것을 참조하여 저장한다
            ps.setString(2,memberDto.getPmwd());
            //ps 변수가 memberDto멤버변수가 비밀번호를 가져온 것을 참조하여 저장한다
            //실행
            // ps.executeQuery(); //ps에서 가져온 값을 실행하여 실행시키는 함수executeQuery 를 참조해 호출
            rs=ps.executeQuery();
            // ps가 기재된 sql 실행(select/조회)후 결과를 반환하는 함수를 참조하여 결과 조작 변수 rs 에 대입한다
                // ps : 내가 작성한 sql 이 기재된 sql조작 인터페이스
                    // ps.execute() : 기재된 sql 실행한다.
                        //ps.executeQuery() : 기재된 sql 실행(select/조회)후 결과를 반환
                            //rs = ps.executeQuery() : 기재된 sql 조회후 결과를 rs 인터페이스 대입
                // rs : select 결과를 조작할수 있는 인터페이스

            //다음레코드:로그인성공시 레코드1개, 로그인실패시 레코드 0개
            if(rs.next()){ //다음 레코드가 1개라도 존재하면 로그인 성공
                return rs.getInt("mno");
                //다음 레코드가 1개라도 존재하면 회원번호 반환
            }
        }//try e
        catch (Exception e){//예외(Exception)를 처리하기 위한 코드 블록을 정의
            System.out.println(e);//try 에서 연동을 실패하면 연동실패와 동시에 왜 오류가 났는지 설명해주는 e 의 값을 출력해준다
        }//c e
        return 0; //로그인 실패 0으로 간주, 초기화면으로 이동
    }//로그인 함수 끝

    //3.아이디 찾기 화면 함수
    public  String findId(MemberDto memberDto){ //MemberDto클래스의 memberDto객체 값을 매개변수로 한 함수 findId 공개(public)로 하여
        // String로 값을 반환한다는 메소드 정의
        try {
            String sql="select *from member where mname=? and mphone= ? ;";
            //DB에서 아이디를 찾기위한 select를 사용하여 sql 변수에 대입한다
            ps=conn.prepareStatement(sql);
            //ps 변수에 데이터베이스 연결 변수 매개변수 sql를 호출한 conn의 준비혹은실행함수 prepareStatement 를 호출한다.
            ps.setString(1,memberDto.getMname());
            //ps 변수가 memberDto멤버변수가 이름 가져온 것을 참조하여 저장한다
            ps.setString(2,memberDto.getMphone());
            //ps 변수가 memberDto멤버변수가 연락처를 가져온 것을 참조하여 저장한다
            rs=ps.executeQuery();
            // ps가 기재된 sql 실행(select/조회)후 결과를 반환하는 함수를 참조하여 결과 조작 변수 rs 에 대입한다
            if(rs.next()){ //다음 레코드가 1개라도 존재하면 로그인 성공
                String  findId =rs.getString("mid");
                //결과 조작변수 rs가 문자열형으로 가져오는 함수(getString)를 참조하여 문자열 형인 findId에 mid값을 대입한다
                //rs.getString(*필드명):현재 레코드의 필드명에 해당하는 필드값 반환
                return  findId; //
            }
        }catch (Exception e){//예외(Exception)를 처리하기 위한 코드 블록을 정의
            System.out.println(e);//try 에서 연동을 실패하면 연동실패와 동시에 왜 오류가 났는지 설명해주는 e 의 값을 출력해준다
        }return null;//반환값이 아무것도 없을때 아무것도 반환하지 않고 초기화면으로 돌아가는 식을 세움
    }//아이디찾기 함수 끝

    //4. 비밀번호 찾기 화면 함수
    public String findPwd(MemberDto memberDto){//MemberDto클래스의 memberDto객체 값을 매개변수로 한 함수 findPwd 공개(public)로 하여
        // String로 값을 반환한다는 메소드 정의
        try {
            String sql="select * from member where mid=? and mphone= ?;";
            //DB에서 테이블을 추가할 때 만드는 식을 사용하여 아이디와 연락가 일치한 사람을 찾아 문자열 변수 sql 에 값을 대입한다

            ps=conn.prepareStatement(sql);//ps변수에 데이터베이스 연결 변수 매개변수 sql를 호출한 conn의 준비혹은실행함수 prepareStatement 를 참조한다.
            ps.setString(1,memberDto.getMid()); //ps 변수가 memberDto멤버변수가 아이디를 가져온 것을 참조하여 저장한다
            ps.setString(2,memberDto.getMphone()); //ps 변수가 memberDto멤버변수가 연락처를 가져온 것을 참조하여 저장한다
            rs= ps.executeQuery();//ps가 기재된 sql 실행(select/조회)후 결과를 반환하는 함수를 참조하여 결과 조작 변수 rs 에 대입한다
            if(rs.next()){ //다음 레코드가 1개라도 존재하면 비밀번호 보여주기
                String  findPwd =rs.getString("mpwd");
                //다음 레코드가 1개라도 존재하면 비밀번호를 존재하는 필드를 반환하여 문자열 변수 findPwd에 대입
                //rs.getString(*필드명):현재 레코드의 필드명에 해당하는 필드값 반환
                return  findPwd;//대입된 findPwd 값을 반환함
            }

        }catch (Exception e){//예외(Exception)를 처리하기 위한 코드 블록을 정의
            System.out.println(e);//try 에서 연동을 실패하면 연동실패와 동시에 왜 오류가 났는지 설명해주는 e 의 값을 출력해준다
        }return null;//반환값이 아무것도 없을때 아무것도 반환하지 않고 초기화면으로 돌아가는 식을 세움



    }//findPwd e
    public boolean mDelete(String confirmPwd, int loginMno){//문자열 변수 confirmPwd 과 로그인한 사람의 번호 loginMno를 매개변수로 받는 함수 mDelete 공개(public)로 하여
        // boolean로 값을 반환한다는 메소드 정의
    try {
        String sql= "delete from member where mno =? and mpwd=?;";
        //DB 테이블을 지우는 식을 세워 회원번호와 비밀번호가 일치한 사람을 삭제하는 식을 세운다

        ps=conn.prepareStatement(sql);
        //ps변수에 데이터베이스 연결 변수 매개변수 sql를 호출한 conn의 준비혹은실행함수 prepareStatement 를 참조한다.
        ps.setInt(1,loginMno); //ps 변수가 loginMno변수( 아이디한 사람의 번호를 가져온 것)를 참조하여 정수값으로 저장한다
        ps.setString(2,confirmPwd); //ps 변수가 confirmPwd 변수 ( 아이디한 사람의 번호를 가져온 것)를 참조하여 문자열로 저장한다
        int count=ps.executeUpdate();//

        if(count ==1) {
            return true;
        }
    }catch (Exception e){
        System.out.println(e);
    }
        return false;
    }//mDelete e
    //2. 회원수정 함수
    public boolean mUpdate(MemberDto memberDto){

        try {
            String sql="update member set mname = ? , mphone=? where mno=?;";
            ps=conn.prepareStatement(sql);
            ps.setString(1,memberDto.getMname());
            ps.setString(2,memberDto.getMphone());
            ps.setInt(3,memberDto.getMno());
            int count= ps.executeUpdate(); //update :insert ,delete, update

            if(count ==1) {
                return true;
            }

        }catch (Exception e) {
            System.out.println(e);
        }

        return false;
    }//mUpdate e


}//클래스 MemberDao e
