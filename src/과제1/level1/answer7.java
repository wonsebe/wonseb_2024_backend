package 과제1.level1;

import java.util.Scanner;

public class answer7 {
//고치기
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String a="유재석";
        boolean b=true;
        byte c= 20;
        char d='M';
        short e=45;
        int f=25000;
        long l=5000000;
        float i=78.2F;
        double k=88.59;

        System.out.print("회원명 String : "); scanner.nextLine();
        System.out.print("상태 boolean : "); scanner.nextLine();
        System.out.print("회원번호 byte : "); scanner.nextLine();
        System.out.print("성별 char : "); scanner.nextLine();
        System.out.print("나이 short : "); scanner.nextLine();
        System.out.print("포인트 int : "); scanner.nextLine();
        System.out.print("예금액 long : "); scanner.nextLine();
        System.out.print("키 float : "); scanner.nextLine();
        System.out.print("몸무게 double : "); scanner.nextLine();

        System.out.print("===========회원개인정보============"); scanner.nextLine();
        System.out.print("|       회원명 :              "+a+        "|"); scanner.nextLine();
        System.out.print("|       상태 :                 "+b+             "|"); scanner.nextLine();
        System.out.print("|       회원번호 :               "+c+         "|"); scanner.nextLine();
        System.out.print("|       성별 :                   "+d+      "|"); scanner.nextLine();
        System.out.print("|       나이 :                  "+e+      "|"); scanner.nextLine();
        System.out.print("|       포인트 :             "+f+      "|"); scanner.nextLine();
        System.out.print("|       예금액 :            "+l+      "|"); scanner.nextLine();
        System.out.print("|       키 :                  "+i+      "|"); scanner.nextLine();
        System.out.print("|       몸무게 :              "+k+      "|"); scanner.nextLine();
        System.out.print("================================="); scanner.nextLine();



    }
}
