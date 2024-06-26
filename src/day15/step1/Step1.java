package day15.step1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {

        //[1] 일반예외 : 발생 할 수도 있고 안 할 수도 있고, 컴파일러 무조건 예외처리 검사

        try {
            //=======예외 발생할 것같은==================//
            Class.forName("java.lang.String");  //.forName(클래스명) :해당 클래스명이 존재하는 검사해주는 함수
            Class.forName("java.lang.String2"); //없음
            //java.lang.NullPointerException ;
        }catch (ClassNotFoundException e){
            //======예외 발생 했을 때===================//
            System.out.println(e); //로그를 남기고 추후에 개발자가 코드 수정
        }


        //[2] 실행예외 : 발생 할 수도 있고 , 안 할 수도 있고 (방지)
        try {
            //=======예외 발생할 것같은==================//
            String str1="ThisIsJava";
            System.out.println(str1.length()); //10 , 문자열.length(): 문자열 길이

            String str2=null;
            System.out.println(str2.length()); //.(도트/접근) 연산자 ,객체내 멤버변수,메소드 접근
            //java.lang.NullPointerException : Cannot invoke "String.length()" because "str2" is null
            //=====================================//
        }catch (NullPointerException e){
            System.out.println(e);
        }

        String str3= "100";
        String  str4="1aa";
       int result1= Integer.parseInt(str3); //Integer 클래스: int 형 관련 클래스 , parseInt() 문자열 --> 정수형 타입 변환
                            //.parseInt()는 stack 이 맞나? 맞다. 객체없이 사용가능
        System.out.println(result1);
        try {
            int result2= Integer.parseInt(str4);
            System.out.println(result2);
        }catch (NumberFormatException e){
            System.out.println(e);
        }

        //
        try {
            int[] intArray= {1,2,3};
            System.out.println(intArray[2]);
            System.out.println(intArray[3]);//인덱스 벗어나서 오류
            //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println(e); //확인용 (개발자가 보기 편하게)
        }

        //
        try {
            Scanner scanner =new Scanner(System.in);
            int ch=scanner.nextInt(); //만약에 문자 입력시 :java.util.InputMismatchException
        }catch (InputMismatchException e){
            System.out.println(e);
        }

        // try 다중  catch
       try {
           String  str5="1aa";
           int result2= Integer.parseInt(str5);
           System.out.println(result2);

           int[] intArray= {1,2,3};
           System.out.println(intArray[3]);

           Scanner scanner =new Scanner(System.in);
           int ch=scanner.nextInt();
       }catch (NumberFormatException e){
           System.out.println("숫자형으로 반환 할 수 없어");
       }
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println(" 없는 인덱스야");
       }
       catch (InputMismatchException e){
           System.out.println("잘못된 입력이야");
       }catch (Exception e){
           System.out.println("알 수 없는 예외가 발생했습니다. 추후에 보수 예정" +e );

       }
       finally {
           System.out.println("여기는 예외가 있던 말던 무조건 실행되는 구역");
       }
    }
}
