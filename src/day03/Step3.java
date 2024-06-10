package day03;

import java.util.Scanner;

public class Step3 {//class s
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
//        //문1
//        System.out.print(" >> 정수 입력 : ");
//        int int1 = scanner.nextInt();
//        System.out.println(int1 % 7 == 0 ? " O " : " X ");

//        //문2
//        System.out.print("정수 : ");
//        int 정수 = scanner.nextInt();
//        System.out.println(정수 % 2 == 1 ? "홀수" : "짝수");

//        // 문제3 : 하나의 정수형으로 입력받아 7의 배수 이면서 짝수 이면 'O' 아니면 'X' 출력 하시오.
//        System.out.print("정수를 입력하세요 : ");
//        int num3 = scanner.nextInt();
//        System.out.println((num3 % 7 == 0 && num3 % 2 == 0) ? "O" : "X");

        // 문제4 : 하나의 정수형으로  입력받아 11의 배수 이거나 짝수 이면 'O' 아니면 'X' 출력 하시오.
//                Scanner scanner= new Scanner(System.in);
//                System.out.print("정수 입력 : ");
//                int num = scanner.nextInt();
//                 System.out.println(num % 11==0 ||num % 2==0? "o":"x");
        //문제5
//        System.out.println(">> 정수 1: "); int i1 = scanner.nextInt();
//        System.out.println(">> 정수 2: "); int i2 = scanner.nextInt();
//        System.out.println(i1 == i2 ? ">> 두 정수가 서로 같음" : i2 > i1 ? ">> 정수 2가 더 큼 : " + i2 : ">> 정수 1이 더 큼 : " + i1);

//        //문6
//        System.out.print("반지름: "); int 반지름=scanner.nextInt();
//        float 넓이=반지름*반지름*3.14F;
//        System.out.printf("원 넓이: %.2f\n",넓이);

        // 문제7 : 실수형으로 두번 입력받아 앞 실수의 값이
        // 뒤의 값의 몇% 인지 소수점 첫째 자리까지 출력하시오.
        // 예) 54.5   84.3 실수 2개 입력시 결과는 64.285714%
//        System.out.println("실수1을 입력하세요.");
//        double value1 = scanner.nextDouble(); // 실수1 저장
//        System.out.println("실수2를 입력하세요.");
//        double value2 = scanner.nextDouble(); // 실수2 저장
//        double result = value1 / value2 * 100; // 결과 저장
//        System.out.printf("%.1f\n", result); // 소수점 첫째 자리까지 출력

        //문제8 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 , 소수점 첫째 자리까지 출력하시오.
        //        계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2
        /*
        System.out.print("윗변 : " ); int 윗변 = scanner.nextInt();
        System.out.print("밑변 : " ); int 밑변 = scanner.nextInt();
        System.out.print("높이 : " ); int 높이 = scanner.nextInt();

        //문제9
        float 넓이 = (윗변 + 밑변) * 높이 / 2f;

        System.out.printf("넓이: %.1f\n",넓이);

        System.out.print(" >> 키 입력 : ");
        int height = scanner.nextInt();
        int weight = (height - 100) * 9 / 10 ;
        System.out.println(" >> 표준 체중 : " + weight + "kg");
        System.out.println(" >> 계산식 : (" + height + " - 100) * 0.9 = " + weight + "kg");

         */
//        //문제10
//        System.out.print("몸무게 : "); double 몸무게 = scanner.nextDouble();
//        System.out.print("키 : "); double 키 = scanner.nextDouble();
//
//        double BMI = 몸무게 / ((키 / 100) * (키 /100));
//
//        System.out.printf("%.2f", BMI);

//        // 문제 11
//        System.out.print("cm로 변환할 inch를 입력 : ");
//        double inch = scanner.nextDouble();
//        double cm = inch * 2.54;
//        System.out.printf("%.2f", cm);

//        //문제12:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 점수 출력하시오
//                // 계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 %
//                System.out.print("중간고사 :"); int 중간고사= scanner.nextInt();
//                System.out.print("기말고사 :"); int 기말고사= scanner.nextInt();
//                System.out.print("수행평가 :"); int 수행평가= scanner.nextInt();
//
//                double  중간점수출력 =중간고사*0.3;
//                System.out.println("중간점수출력 = " + 중간점수출력);
//                double 기말점수출력 = 기말고사*0.3;
//                System.out.println("기말점수출력 = " + 기말점수출력);
//                double 수행점수출력 = 수행평가*0.4;
//                 System.out.println("수행점수출력 = " + 수행점수출력);
//                double 총점= 중간점수출력+기말점수출력+수행점수출력;
//                System.out.printf("총점 = %.2f\n",  총점);

        //문제13 : 연산순서 나열하고 printf() 에 출력되는 x와 y값을 구하시오.

//        int x = 10;
//        int y= x-- +5 + --x;
//        System.out.printf(" x의 값 : %d , y의값 :  %d ", x, y);
//
//        // 1. x-- + 5 -> x=10 +5 =>15 [x는 연산후 1차감]
//        // 2. 15 + --x -> x= 8+15 => 23 [x는 연산전 1차감]
//        int z=10;
//        //System.out.println(z-- +5); // 15, z 출력후 , z--, z=9
//        System.out.println(z-- +5 + --z); //-z, z = 8;
        //문14
        //삼항연산자의 중첩
//        System.out.print("나이: "); short 나이=scanner.nextShort();
//        System.out.println(나이>=40?"중년":나이>=20?"성인":나이>=10?"학생":"");

        //문15
        //국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고
        // 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력
//        System.out.println("국어 점수를 입력하세요.");
//        int kScore = scanner.nextInt();
//        System.out.println("영어 점수를 입력하세요.");
//        int eScore = scanner.nextInt();
//        System.out.println("수학 점수를 입력하세요.");
//        int mScore = scanner.nextInt();
//
//        double totScore = (double) (kScore + eScore + mScore);
//        System.out.printf("총점: %.0f\n", totScore); // 총점(소수점 0자리)
//        double avrScore = totScore / 3;
//        System.out.printf("평균: %.2f\n", avrScore); // 평균(소수점 2자리)

        //문16
//        System.out.print("1번째 정수 : " ); int 정수1 = scanner.nextInt();
//        System.out.print("2번째 정수 : " ); int 정수2 = scanner.nextInt();
//        System.out.print("3번째 정수 : " ); int 정수3 = scanner.nextInt();
//
//        int 큰정수 = 정수1>정수2 && 정수1>정수3 ? 정수1 : 정수2>정수3 ? 정수2 : 정수3;
//        System.out.println("큰정수 = " + 큰정수);
        //정수1 : 7
        //정수2 : 6
        //정수3 : 3

        //문제17 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아
        // 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 '로그인성공' 아니면 '로그인실패' 출력 하시오
        //문자열(String)은 비교연산자 사용 불가능 [객체]
        //객체 비교 메소드 : 객체.equals()
        //문자열 비교: "문자열".equals("비교문자열");
        System.out.println(">> ID :");String id= scanner.next();
        System.out.println(">> PW :"); String pw= scanner.next();
        //id =="admin" && pw == "1234" [ 불가능 ]
        System.out.println(id.equals("admin") && pw.equals("1234") ?
                "로그인 성공": "로그인 실패");

    }//main e

}//class e
