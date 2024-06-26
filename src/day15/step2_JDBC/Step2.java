package day15.step2_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Step2 {
    public static void main(String[] args) {
        //1.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //자바에 DB연동하는 방법
            // 여기서 오류 발생시 : 현재 프로젝트에 라이브러리가 제대로 등록 안됨.
            //2
            Connection conn; //인터페이스 타입의 변수 선언
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/day05","root","1234");

            String sql="insert into table1 values('유재석')";
            // (SQL) Statement 기재 Prepare 준비하다 conn.prepareStatement(): sql 을 문자열로 매개변수로 전달, 해당sql을 조작할 수있는 구현체 반환
            PreparedStatement ps= conn.prepareStatement(sql);
            //execute 실행하다 pdate
            ps.executeUpdate();

            sql="insert into table1 values('강호동')";
            ps= conn.prepareStatement(sql);
            ps.executeUpdate();

        }catch (Exception e){
            System.out.println("JDBC연동실패"+e);

        }
    }
}
