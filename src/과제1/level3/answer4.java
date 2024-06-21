package 과제1.level3;

import java.util.Scanner;

public class answer4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //네모를 출력할 문자열 변수 선언
        String str = "";
        //더하기 변수 선언후 초기화
        int sum = 0;
        //무한반복문 실행
        while (true) {
            System.out.print("input: ");
            //인풋에 입력할 변수 선언
            sum += scan.nextInt();
          if(sum>0) {
              for (int i = 0; i < sum; i++) {
                  System.out.print("■");
              }
          }
                else{
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                System.out.println();



        }
    }
}
