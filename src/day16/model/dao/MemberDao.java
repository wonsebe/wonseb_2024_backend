package day16.model.dao;

import day16.model.dto.MemberDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao {

    //0.
    public static MemberDao mdao =new MemberDao();
    //0.DB연동
        //-JDBC 인터페이스 3개
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
        //생성자에 연동 코드
    MemberDao(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/day06","root",
                    "1234");
        }catch (Exception e){
            System.out.println("연동실패 "+e);
        }

    }//생성자 e

    //1. 회원가입 화면 함수
    public boolean signup(MemberDto memberDto){
    try {
        //SQL 작성
        String sql="insert into member(mid,pmwd,mname,mphone) values(?, ?, ?, ?);";
        //SQL 기재
        ps=conn.prepareStatement(sql);
        //SQL 문법의 ?(와일드카드)매개변수 기재한다.
        ps.setString(1,memberDto.getMid()); //setString(?순서번호 ,값또는변수명)
        ps.setString(2,memberDto.getPmwd());
        ps.setString(3,memberDto.getMname());
        ps.setString(4,memberDto.getMphone());
        int count= ps.executeUpdate(); //실행
        if(count==1){
            return true;
        }
    }catch (Exception e){
        System.out.println(e);
    }return  false;
    }
    //2. 로그인 화면 함수
    public  boolean login(MemberDto memberDto){
    //1.SQL 작성
        try {
            String sql="select *from member where mid=? and pmwd=?;";
            ps=conn.prepareStatement(sql);
            ps.setString(1, memberDto.getMid());//mid가 private로 되어있어 get을 써야됨
            ps.setString(2,memberDto.getPmwd());
            //실행
            ps.executeQuery();
            rs=ps.executeQuery();

            //다음레코드:로그인성공시 레코드1개, 로그인실패시 레코드 0개
            if(rs.next()){ //다음 레코드가 1개라도 존재하면 로그인 성공
                return true;
            }
        }catch (Exception e){
            System.out.println(e);
        }return false;
    }

    //3.아이디 찾기 화면 함수
    public  String findId(MemberDto memberDto){
        try {
            String sql="select *from member where mname=? and mphone= ? ;";
            ps=conn.prepareStatement(sql);
            ps.setString(1,memberDto.getMname());
            ps.setString(2,memberDto.getMphone());
            rs=ps.executeQuery();
            if(rs.next()){ //다음 레코드가 1개라도 존재하면 로그인 성공
                String  findId =rs.getString("mid");
                //rs.getString(*필드명):현재 레코드의 필드명에 해당하는 필드값 반환
                return  findId;
            }
        }catch (Exception e){
            System.out.println(e);
        }return null;
    }
    //4. 비밀번호 찾기 화면 함수

    public String findPwd(MemberDto memberDto){
        try {
            String sql="select * from member where mid=? and mphone= ?;";
            ps=conn.prepareStatement(sql);
            ps.setString(1,memberDto.getMid());
            ps.setString(2,memberDto.getMphone());
            rs= ps.executeQuery();
            if(rs.next()){ //다음 레코드가 1개라도 존재하면 비밀번호 보여주기
                String  findPwd =rs.getString("pmwd");
                //rs.getString(*필드명):현재 레코드의 필드명에 해당하는 필드값 반환
                return  findPwd;
            }

        }catch (Exception e){
            System.out.println(e);
        }return null;

    }





}
