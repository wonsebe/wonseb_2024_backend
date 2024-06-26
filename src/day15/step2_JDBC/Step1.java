package day15.step2_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Step1 {

    public static void main(String[] args) {


        //1.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //자바에 DB연동하는 방법
            // 여기서 오류 발생시 : 현재 프로젝트에 라이브러리가 제대로 등록 안됨.
            System.out.println("<<JDBC 드라이버 호출 성공>>");

            //2
            Connection conn; //인터페이스 타입의 변수 선언
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/day05","root","1234");
            System.out.println("<<DB 연동 성공>>");


        }catch (Exception e){
            System.out.println("JDBC 연동 실패"+e);
        }



    }

}


/*

    JDBC : JAVA DATABASE CONNECT :자바 데이터베이스 연동
        -JDBC 관련 클래스/인터페이스 라이브러리 설치

    2. 연동
    DriverManager.getConnection("DB SERVER URL","계정명","비밀번호")
        //DB SERVER URL : jdbc:mysql:ip주소:port번호/DB명
            -로컬pc기준:  jdbc:mysql:localhost:3306/DB명
          -계정명 : 로컬사용시 기본값: root
          -비밀번호: (임의) 1234
          *연동 성공시 연동성공한 정보를 가진 객체를 반환, 해당 연동객체를 가지고 DML(DB)조작



    Connection 인터페이스 : DB와 연동 성공한 객체정보를 가지고 조작/기능/메소드 제공하는 인터페이스
        -추상메소드












 */