package day03;

import java.util.Scanner;

public class Step4 {

    public static void main(String[] args) {
        //문제1 : 점수를 정수형으로 입력받아 점수가 90점 이상이면 '합격' 아니면 '불합격' 출력 하시오.
        Scanner scanner = new Scanner(System.in);
//        System.out.print(" >> 점수 입력 : ");
//        int score = scanner.nextInt();
//        if(score >=90){
//            System.out.println( "합격");
//        }else{
//            System.out.println( "불합격");
//        }


        // 문제4 : 각 3개의 정수형으로 수를 입력받아 오름차순 순서대로 출력하시오. [ 전제조건 : 각 정수는 서로 다른 정수값 ]
        System.out.println("숫자 3개를 입력하세요.:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // A = 7 , B = 5 , c = 10
        if (a > b) {                    // 2. 만약에 a가 b보다 크면 a와 b의 값 교환      7 > 5      true
            int temp = a;                 // 임시변수에 a값 넣고                        temp = 7
            a = b;                     // b값 을 a에 넣고                           a = 5
            b = temp;                   // 임시변수 값을 b에 넣는다.                  b = 7
        }
        // A = 5 , B = 7 , c = 10
        if (a > c) {                    // 2. 만약에 a가 c보다 크면 a와 c의 값 교환       5 > 10    false
            int temp = a;
            a = c;
            c = temp;
        }
        // A = 5 , B = 7 , c = 10
        if (b > c) {                  // 2. 만약에 b가 c보다 크면 b와 c의 값 교환       7 > 10    false
            int temp = b;
            b = c;
            c = temp;

        }
        System.out.println("오름차순 : a->b->c");
    }// 5 7 10




//       /문제7 : 주차 사용요금 계산하기
//                [ 선언 변수 조건 ] 입차시간이 9시30분 입니다.
//        - int 시 = 9;  int 분 = 30; 이와 같이 변수를 먼저 선언해주세요.
//   [ 출차시간 입력 조건 ] 출차시간의 시 와 분을 각 입력받아 각 변수에 저장하시오.
//   [ 처리출력 조건 ] 1분당 1000원으로 계산하여 사용요금' 0000원' 을 출력하시오,
//        - 단 입차 시간 이전 으로 입력 할 경우에는 '출차시간 오류' 출력하시오.



    }
