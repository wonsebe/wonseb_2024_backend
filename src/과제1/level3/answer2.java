package 과제1.level3;

import java.util.Scanner;

public class answer2 {

    public static void main(String[] args) {
        System.out.println(">>Level3_2 answer >>");
        Scanner scan= new Scanner(System.in);

        String s="";
        int count=1;

        while(true){
            System.out.print(count +"회 입력:");
            s = scan.next();

            if(s.equals("end")){
                System.out.println("안내) 프로그램을 종료합니다[총 " + --count+"회 입력]"); //end를 입력한 것을 제외하기 위해 --count 를 함
                break;
            }
            count++;



        }
    }
}

