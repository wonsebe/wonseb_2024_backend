package day16.model.dao;

import day16.model.dto.BoardDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BoardDao {

    //---싱글톤---//
    private static  BoardDao bDao=new BoardDao();
    private BoardDao(){
        try {//DB 연동
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/day06","root",
                    "1234");
        }catch (Exception e){
            System.out.println(e);
        }

    }
    public static BoardDao getInstance(){return bDao;}
    //----싱글톤 e----//

    //JDBC 인터페이스
    Connection conn;// 데이터베이스 연결을 설정하고 관리하는 Connection 인터페이스의 변수 conn을 선언
    PreparedStatement ps;  // SQL 쿼리에 매개변수를 전달하여 실행 기능을 제공하는 PreparedStatement의 변수 ps 선언
    ResultSet rs; //데이터베이스로부터 SQL 쿼리를 실행한 결과를 받아올 때 사용하는 ResultSet의 변수 rs 선언


    //4. 게시판(게시물 전체출력) 함수 : 매개변수 x, 리턴값 : 여러개 게시물 -> 여러개 레코드 -> 여러개 레코드 -> 여러개 DTO
    public ArrayList<BoardDto> bPrint(){ //BoardDto을 매개변수로 한 배열값을 반환받는 함수 선언
        //여러개 DTO 담을 리스트 선언
        ArrayList<BoardDto> list= new ArrayList<>(); //배열 객체  list 선언
        try {//예외처리
            String sql= "select * from board";
            //2.SQL 기재
            ps= conn.prepareStatement(sql); //ps 변수에 데이터베이스 연결 변수 매개변수 sql를 호출한 conn의 준비혹은실행함수prepareStatement 를 호출한다.
            rs=ps.executeQuery();// 실행함수를 받은 ps가 결과를 출력ㅎ는 함수 executeQuery를  결과 변수 rs에 대입
            while(rs.next()){//4.결과 레코드 전체를 하나씩
                //rs.getString("필드명") : 현재 레코드의 현재 필드명 값 호출
                String btitle=rs.getString("btitle");
                String bcontent=rs.getString(("bcontent"));
                String bdate=rs.getString(("bdate"));
                int bview=rs.getInt(("bview"));
                int mno=rs.getInt(("mno"));
                int bno=rs.getInt(("bno"));

                //DTO 1개 만들기
                BoardDto boardDto=new BoardDto(btitle,bcontent,bdate,bview,mno,bno);

                //리스트에 dto 담기
                list.add(boardDto); //리스트에 dto 담기
                // return list; // 여기에다 리턴을 하면 while이 전체를 하나씩 출력하고 있는데 하나만 출력시키고 순회를 하지 못하는 상태에서 함수를 나가
                //버리기 때문에 절대 여기에다 리턴을 하면 안된다.
            }
        }catch (Exception e){ System.out.println(e);}
        return list; //--여러개 담긴 Dto 의 리스트를 반환
    }

    public  BoardDto bView(int bno){ //레코드 1개를 BoardDto 1개로 할 수 있다 -개별 출력이기 때문에
        System.out.println("bno = " + bno);
        try {//SQL 작성
            String sql="select*from board where bno=?";
            System.out.println("sql = " + sql);
            ps= conn.prepareStatement(sql); //ps 변수에 데이터베이스 연결 변수 매개변수 sql를 호출한 conn의 준비혹은실행함수prepareStatement 를 호출한다.
            ps.setInt(1,bno); //SQL 기재 후 매개변수 대입
            rs=ps.executeQuery(); //결과 반환
            //결과에 따른 처리
           if(rs.next()){
               System.out.println("-->레코드존재");
               //DTO 1개 만들기
               BoardDto boardDto=new BoardDto(
                       rs.getString("btitle"),rs.getString("bcontent"),
                       rs.getString("bdate"),rs.getInt("bview"),
                       rs.getInt("mno"),rs.getInt("bno"));
               System.out.println("boardDto = " + boardDto);
               return boardDto; //생성된 boardDto 반환


           }
        }
        catch (Exception e){ System.out.println(e);}
        return null;

    }

    public boolean bWrite(BoardDto boardDto){
        System.out.println("boardDto = " + boardDto);
        try {
            String sql="INSERT INTO board( btitle , bcontent , mno ) VALUES( ? , ? , ? );";
            System.out.println("sql = " + sql);
            ps= conn.prepareStatement(sql); //ps 변수에 데이터베이스 연결 변수 매개변수 sql를 호출한 conn의
            // 준비혹은실행함수prepareStatement 를 호출한다.
             //SQL 기재 후 매개변수 대입
            ps.setString(1,boardDto.getBtitle());//SQL 기재 후 매개변수 대입
            ps.setString(2,boardDto.getBcontent());//SQL 기재 후 매개변수 대입
            ps.setInt(3,boardDto.getMno());////SQL 기재 후 매개변수 대입
            int count= ps.executeUpdate(); //결과에 따른 처리 (int타입)
            // 레코드가 1개를 저장하는지 2개3개를 저장하는지 세기 위해 count변수를 대입함
            if(count==1){
                return true;

            }
        }catch (Exception e){
            System.out.println(e);
        }return false;




    }
    public boolean bDelete(int bno, int mno){

        try {
            String sql="delete from board where bno=? and mno=? ";

            ps= conn.prepareStatement(sql); //ps 변수에 데이터베이스 연결 변수 매개변수 sql를 호출한 conn의 준비혹은실행함수prepareStatement 를 호출한다.
            ps.setInt(1,bno); //SQL 기재 후 매개변수 대입
            ps.setInt(2,mno);
            int count= ps.executeUpdate(); //결과 반환
            if(count==1) return true;

        }catch (Exception e){
            System.out.println(e);
        }
        return false;
    }



    public boolean bUpdate(BoardDto boardDto) {

        try {
            String sql="update board set btitle =?, bcontent= ? where bno=? and mno= ?";
            ps= conn.prepareStatement(sql);
            ps.setString(1,boardDto.getBtitle());
            ps.setString(2,boardDto.getBcontent());
            ps.setInt(3,boardDto.getBno());
            ps.setInt(4,boardDto.getMno());

            int count=ps.executeUpdate();
            if(count ==1) {
                return true;
            }

        }catch (Exception e){
            System.out.println(e);
        }return false;
    }
}
