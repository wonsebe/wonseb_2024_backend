package day05;

import java.util.Scanner;

public class Step3 {//class s

    public static void main(String[] args) {//main s
        //[입력] : 입력객체
        Scanner scanner =new Scanner(System.in);
        
//
//        //[1] 입력받은 수 만큼 별 출력
//            //1.키보드로부터 정수형으로 입력받아 정수형 변수에 저장d
//        System.out.print("[1] 별 개수 : ");
//        int star1= scanner.nextInt();
//        System.out.println("star1 = " + star1);
//
//            //2. 입력받은 수 만큼 '*' 출력
//        for(int i=1; i<=star1; i++){
//            System.out.print("*");
//        }
//        System.out.println("\n=============================================");
//        //[2] 입력받은 수 만큼 별 출력하는데 3의 배수마다 줄바꿈 처리 하시오.
//        System.out.println("[2] 별 개수 : ");
//        int star2= scanner.nextInt(); //scanner객체 생성은 {} 마다 1번 선언
//        System.out.println("star2 = " + star2);
//            //입력받은 수 만큼 '*' 출력 만약에 3의 배수이면 줄바꿈 처리
//        for(int i=1; i<=star2; i++){
//            System.out.print("*");
//            if(i %3 ==0){
//                System.out.println();
//            }
//        }
//        System.out.println("\n=============================================");
//        //[3] 입력받은 수 만큼 별을 하나의 변수에 하나씩 추가후 해당 변수 출력
//        System.out.print("[3] 별 배수 : ");
//        int star3 = scanner.nextInt();
//        String starTotal="";
//        for(int i=1; i <= star3; i++){
//            starTotal += "*";
//
//        }
//        System.out.println("starTotal = " + starTotal);

        //[4] 입력받은 줄만큼 아래와 같이 출력하시오.
        //만일 5를 입력 했으면 5줄 모양의 별 출력
//        System.out.print("[4] 값 입력 : ");
//        int star4= scanner.nextInt();
//        String starTotal1="";
//
//        for(int i=0; i<=star4; i++){
//            for(int j=0; j< i; j++){
//                System.out.print("*");
//            }
//           System.out.println(starTotal1); //줄띄기
//        }

//        System.out.print("[4] 줄 수 : ");
//        int inputLine= scanner.nextInt();
//        String html = "";
        //현재 줄 수는 1부터 입력받은 줄 수 까지 1씩 증가
//        for(int currentLine= 1; currentLine <= inputLine; currentLine++){
//
//            for(int star=1; star <= currentLine; star++){
//                html += "*";
//            }
//            //줄 바꿈
//            html +="\n";
//        }
//        System.out.println(html);

        //문5
        //현재 줄 (cLine) 은 1부터 입력받은 줄 수 (iLine) 만큼 1씩 증가 반복
//        for(int cLine =1; cLine <=cLine; cLine++){}
//
//        //공백은 1부터 입력받은 줄 수 - 현재 줄 수 뺀 값 까지 1씩 증가 반복
//            for(int blank=1; blank <= iLine -cLine; blank++){}
//
//        //별 은 1부터 현재줄수 까지 1씩 증가 반복
//            for(int star=1; star <= cLine; star ++){}



        //[5]
//        System.out.print("[5] 줄 수 :"); //안내문 출력
//        int iLine= scanner.nextInt(); //키보드로부터 입력받은 값을 반환 해서 변수에 저장
//        String html="";
//
//        for(int cLine =1; cLine <=iLine; cLine++){
//
//            //줄마다 공백출력
//            for(int blank= 1; blank <= iLine -cLine; blank++){
//                html += " ";
//            }
//
//            //줄마다 별 출력
//            for(int star =1; star <=cLine; star++){
//                html+= "*";
//            }
//            //줄마다 줄바꿈
//            html +="\n";
////        }
//        System.out.println(html);

        //[6]
//        System.out.print("[6] 줄 수 :"); //안내문 출력
//        int iLine= scanner.nextInt(); //키보드로부터 입력받은 값을 반환 해서 변수에 저장
//        String html="";
//
//        for(int cLine =1; cLine <=iLine; cLine++) {
//            //줄마다 공백출력
//            for(int star =1; star <=iLine -cLine; star++){
//                html+= "*";
//            }
//            html +="\n";
//        }System.out.println(html);





        //[7]
//        System.out.print("[6] 줄 수 :"); //안내문 출력
//        int iLine= scanner.nextInt(); //키보드로부터 입력받은 값을 반환 해서 변수에 저장
//        String html="";
//        for(int cLine =1; cLine <=iLine; cLine++) {
//
//            for(int blank= 1; blank <= cLine-1; blank++){
//                html += " ";
//           }
//            for(int star =1; star <=iLine-cLine; star++){
//                html+= "*";
//        }
//            html +="\n";
//        }
//        System.out.println(html);



        //[8]
//        System.out.print("[6] 줄 수 :"); //안내문 출력
//        int iLine= scanner.nextInt(); //키보드로부터 입력받은 값을 반환 해서 변수에 저장
//        String html="";
//        for(int cLine =1; cLine <=iLine; cLine++) {
//
//            for(int blank= 1; blank <= iLine-cLine; blank++){
//                html += " ";
//           }
//            for(int star =1; star <=cLine *2 -1; star++){
//                html+= "*";
//        }
//            html +="\n";
//        }
//        System.out.println(html);
//
        //[9]
        System.out.print("[6] 줄 수 :"); //안내문 출력
        int iLine= scanner.nextInt(); //키보드로부터 입력받은 값을 반환 해서 변수에 저장
        String html="";
        for(int cLine =1; cLine <=iLine; cLine++) {

            for(int blank= 1; blank <= cLine-1; blank++){
                html += " ";
           }
            for(int star =1; star <=(iLine-cLine)*2-1; star++){
                html+= "*";
        }
            html +="\n";
        }
        System.out.println(html);




        
    }//main e
}//class e
