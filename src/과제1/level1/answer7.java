package 과제1.level1;

import java.util.Scanner;

public class answer7 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("회원명 String: "); String s=scan.next();
        System.out.print("상태 boolean: "); boolean bo=scan.nextBoolean();
        System.out.print("회원번호 byte: "); byte by=scan.nextByte();
        System.out.print("성별 char: "); char c=scan.next().charAt(0);
        System.out.print("나이 short: "); short sh=scan.nextShort();
        System.out.print("포인트 int: "); int i=scan.nextInt();
        System.out.print("예금액 long: "); long l=scan.nextLong();
        System.out.print("키 float: "); float f=scan.nextFloat();
        System.out.print("몸무게 double: "); double d=scan.nextDouble();


        System.out.println("==========회원 개인정보========");
        System.out.println("|         회원명:" +s+    "\t\t\t|");
        System.out.println("|         상태: "+bo+"\t\t\t|");
        System.out.println("|         회원번호: "+by+"\t\t|");
        System.out.println("|         성별: "+c+"\t\t\t|");
        System.out.println("|         나이: "+sh+"\t\t\t|");
        System.out.println("|         포인트: "+i+"\t\t|");
        System.out.println("|         예금액: "+l+"\t\t\t|");
        System.out.println("|         키: "+f+"\t\t\t|");
        System.out.println("|         몸무게: "+d+"\t\t|");
        System.out.println("=============================");


    }
}
