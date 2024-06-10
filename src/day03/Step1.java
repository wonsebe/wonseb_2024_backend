package day03;//현재 클래스 파일의 위치한 패키지

import java.util.Scanner;

public class Step1 {//class s

    //main : 코드를 읽어/실행 해주는 역할(스레드)
    public static void main(String[] args) {//main s

        //System.out :시스템출력, console 출력창
        //System.in : 시스템 입력, 키보드

        //[1] 입력함수 , JS :prompt()

        //입력 객체 만들기
            //1. new Scanner             Scanner 클래스 : 입력에 관련된 객체를 생성
            //2. new Scanner(System.in); System.in : 입력 장치는 키보드
            //3. 저장 - Scanner 타입으로 변수에 생성된 입력객체를 저장한다.
            //4. 입력객체의 메소드를 이용한 입력값 가져오기

        /*

            1. .next()                        :키보드 입력받은 바이트/자료 을 문자열(String) 타입으로 반환
            2. .nextLine()                    : next()동일하되
               .next() : 띄어쓰기 포함된 문자열도 입력받기 불가능
               .nextLine()  : 띄어쓰기 포함된 문자열도 입력받기 가능
                    -단, nextLine()위에 입력관련 메소드가 존재하면 하나로 취급
                    -개행[엔터] 기준으로 마침 처리, next() +nextLine() : 하나로 취급 당함
                    -해결방안
                        의미없는 nextLine() 두 메소드 사이에 추가한다
            3. .nextBoolean()
            4. .nextByte()
            5  .nextInt()
            6. .nextShort()
            7. .nextLong()
            8. .nextFloat()
            9. nextDouble()
            -chat c1=scan.next().charAt(0);
         */
        Scanner scan= new Scanner(System.in);

        //1.
        System.out.println(" .next() 문자열:");
        //scan.next(); //1.입력
        String str1= scan.next();              //2. 저장
        System.out.println("str1 = " + str1); //3.출력
        
        //2.
        scan. nextLine();//의미없는 메소드 입력
        System.out.println(" .nextLine() (띄어쓰기)문자열:");
        String str2= scan.nextLine();
        System.out.println("str2 = " + str2);
        
        //3. 논리 입력: 허용범위내 입력, 허용범위 외 입력시 오류
        System.out.println(" .nextBoolean ture, flase 문자열:");
       boolean b1= scan.nextBoolean();
        System.out.println("b1 = " + b1);
        
        //4. 바이트 : 허용범위내 입력, 허용범위 외 입력시 오류
        System.out.println(" .nextbyte() 문자열:");
        byte by1 =scan.nextByte();
        System.out.println("by1 = " + by1);

        // 5. short
        System.out.println(" .nextshort() 문자열:");
        short sh1 =scan.nextShort();
        System.out.println("sh1 = " + sh1);

        //6.int
        System.out.println(" .nextint() 문자열:");
        int int1=scan.nextInt();
        System.out.println("int1 = " + int1);
        
        //7. long
        System.out.println(" .nextlong() 문자열:");
        long long1= scan.nextLong();
        System.out.println("long1 = " + long1);
        
        //8. float
        System.out.println(" .nextfloat() 문자열:");
        float float1= scan.nextFloat();
        System.out.println("float1 = " + float1);
        
        //9. double
        System.out.println(" .nextDouble() 문자열:");
        double double1= scan.nextDouble();
        System.out.println("double1 = " + double1);

    }//main e




}//class e
