package day10.step1;

import java.util.ArrayList;
import java.util.Scanner;

public class step4 {

        public static void main(String[] args) {

            //*입력객체
            Scanner scan= new Scanner(System.in);

            //1. 배열구성

            ArrayList <Product> prodoctList=new ArrayList<>();

            //2. 무한 루프
            while(true){//
                System.out.println("리스트상태확인: "+ prodoctList);

                System.out.println("1. 등록 2. 출력 3. 수정 4. 삭제 5. 종료 선택]");//무한 출력

                int ch= scan.nextInt();//무한 입력 , 입력받은 데이터로 기능을 구분짓기 위해
                //-입력값에 따라 논리/경우의 수 판단
                if (ch == 1) {
                    System.out.println(">>제품코드:");  String code= scan.next();
                    System.out.println(">>제품명:");    String name= scan.next();
                    System.out.println(">>제품가격");    int price= scan.nextInt();
                    //2. 가공 (유효성검사 혹은 객체화)
                    Product p= new Product(code, name, price);


                    //3.배열에 저장, JS 처럼 PUSH함수가 없다. 그러므로 직접 찾아서 대입하자.
                    //1.제품 총 개수 증가
                    prodoctList.add(p);



                }//if e
                else if (ch==2) {}
                else if (ch==3) {}
                else if (ch==4) {

                    //1. 입력받기
                    System.out.println(">>삭제할 제품코드: "); String deleteCode=scan.next();
                    for(int i=0; i<prodoctList.size(); i++){
                        if(prodoctList.get(i).getCode().equals(deleteCode)){
                            prodoctList.remove(i);
                            break;
                        }
                    }
                }
                else if (ch==5) {}

            }//while end



        }//m



    }//c

/*
            [메모리 설계]
            1.객체의 추상적인 구성(특성,행위)하기
            2.구성한 개념을 클래스로 구현하기
            3.해당 클래스 타입의 객체를 여러개 저장하기 위해 배열 선정/만들기
                -배열 선언방법: 타입[] 변수명 = new 타입[길이]
            [화면 구현 설계]
                1. 콘솔에 출력할 내용들을 구성
                2.
 */
