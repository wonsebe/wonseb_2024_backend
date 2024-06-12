package day05;

import java.util.Scanner;

public class Step2 {//class s


    public static void main(String[] args) {


        //조건문 왜? 판단의 흐름 제어


        //반복문 왜? 동일한 실행을 특정 조건에 밎게 반복적으로 실행


        //1.
//            int num=1;
//            num=num+2;
//            num=num+3;
//            num=num+4;
//            num=num+5;
//            num=num+6;
//            num=num+7;
//            num=num+8;
//            num=num+9;
//            num=num+10;
//            System.out.println(num);
//
//
//            int num2=1;
//            for(int i=2; i<=10; i++){
//                num2=num2+i ;
//            }
//            System.out.println(num2);
//
//
//            //2.
//            int num3=1;
//            int i=2;
//            while (i <= 10){
//                num3+= num3+i;
//                i++;
//            }
//            System.out.println(num3);
//
//
//            // *연산하거나 그값을 가져다 사용하려면 변수에 반드시 어떤 값을 가지고있어야한다.
//            // int sum;
////            int sum=0;
////            sum=sum+3;
//
//
//            //무한반복: 24시간 서비스를 제공할때 끊임없이 돌아야하는 경우
////            while(true) {
////                System.out.println(">>loop<<");
////            }
////            for(; ;){
////                System.out.println(">>loop<<");
////            }
//
//        //do while
//        int num4=1;
//        int sum2=0; //0을 대입하는 이유 : sum2에 연산하기 위해 초기값 대입
//
//        do {
//            sum2 += num4;
//            num4 ++;
//
//        }while(num4 <10);
//        System.out.println(sum2); //55
//
//        //vs
//        for(int num5=1; sum2<10; num5++){
//            sum2+=num5;
//        }
//        System.out.println(sum2); //55
//
//        //관례
//            // while : 무한루프 구현할때 while(true){}
//            // do while : 반드시 한 번 이상 수행해야할때
//            // for :일반적이다.
//
//        //for 문 중첩
//            /*
//            외부
//            dan=2
//               내부
//            dan=3
//               내부
//            dan=4
//               내부
//            dan=5
//               내부
//            dan=6
//               내부
//            dan=7
//               내부
//            dan=8
//               내부
//            dan=9
//              내부
//
//             */
//        //외부
////        for(int dan=2; dan <=9; dan++){
////            //System.out.println("dan="+dan);
////
////            //내부 for문
////            for (int times =1; times<=9; times++){
////                //%d 정수형식 ,%2d : 2칸 차지 정수
////                System.out.printf("%2d * %2d=%2d",dan , times , dan * times);
////            }//for end
////            System.out.println("=============================================");
////        }//for end
//
//        //continue : 반복문 안에서 continue 문을 만나면 이후의 문장은 수행하지않고 for 문의 증감식으로 이동
//            //특정 조건에서는 수행하지 않고 건너뛰어야 할때
//         int total= 0;
//        for( int num5=1; num5<=100; num5++){
//
//            //만약에 짝수이면
//            if(num5 % 2 ==0){continue; }//코드의 흐름이 continue; 만나면 for 문의 증감식으로 이동
//
//            total += num5;
//        }
//
//        //break
//        //예제 : 1부터 1씩 증가 하면서 누적합계가 100이면 중지
//
//        int sum3=0;
//        for(int num5=0; sum3 <100; num5++){
//            sum3 += num5;
//        }
//        System.out.println(sum3);
//
//        sum3=0;
//        for(int num5=0; ; num5++){
//            sum3 += num5;
//            if(sum3 >=100) break;
//        }
//        System.out.println(sum3);


        //문1
        int num10 = 10;
        int num20 = 2;
        char operator = '+';
        int result = 0;

        if (operator == '+') {
            System.out.println(num10 + num20);
        } else if (operator == '-') {
            System.out.println(num10 - num20);
        } else if (operator == '*') {
            System.out.println(num10 * num20);
        } else if (operator == '/') {
            System.out.println(num10 / num20);
        }


        switch (operator) {
            case '+':
                System.out.println(num10 + num20);
                break;
            case '-':
                System.out.println(num10 - num20);
                break;
            case '*':
                System.out.println(num10 * num20);
                break;
            case '/':
                System.out.println(num10 / num20);
                break;
        }


        //문2
        for (int 단 = 2; 단 <= 9; 단++) {
            //만약에 단이 홀수이면
            if (단 % 2 == 1) {
                continue;
            }
            for (int 곱 = 1; 곱 <= 9; 곱++) {
                System.out.printf("%2d x %2d=%2d", 단, 곱, 단 * 곱);
            }
            System.out.println();
        }


        //문3
        for (int 단 = 2; 단 <= 9; 단++) {
            for (int 곱 = 1; 곱 <= 9; 곱++) {
                if (단 <= 곱) {
                    break;
                } //가장 가까운 반복문 탈출
                System.out.printf("%2d x %2d=%2d", 단, 곱, 단 * 곱);
            }
            System.out.println();
        }


        //문4
        //행 , 열
//        for(int 행=1; 행 <5; 행 ++) {
//            for(int 열=4; 열 >행 ; 열 --) {
//                System.out.print("");
//            }
//            for (int 열 = 1; 열 <= 행 * 2 - 1; 열++) {
//                System.out.print("*");
//            }
//        }


        for (int 행 = 1; 행 < 5; 행++) {
            for (int 열 = 4; 열 > 행; 열--) {             //위쪽 삼각형
                System.out.print(" ");
            }
            for (int 열 = 1; 열 <= 행 * 2 - 1; 열++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //문 5

       Scanner sc= new Scanner(System.in);
       System.out.print("값 입력 :");
//        int S=sc.nextInt();
//
//        if (S % 2 == 0) {
//            S = S - 1;
//        }
//        int R = (S + 1) / 2;
//        for (int i = 0; i < R; i++) {
//            for (int j = 1; j < R - i; j++) {
//                System.out.print("");
//            }
//            for (int k = 0; k < i * 2 + 1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = R - 1; i > 0; i--) {
//            for (int j = R - i; j > 0; j--) {
//                System.out.print("");
//            }
//            for (int k = i * 2 - 1; k > 0; k--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }











    }//main e
}//class e
