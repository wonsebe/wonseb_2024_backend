package 과제1.level2;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class answer2 {
    public static int dbinsert() { return new Random().nextInt(3)+1;  }

    public static void main(String[] args) {
        System.out.println(" >> Level2_2 answer >> ");
        System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
        Scanner scanner = new Scanner(System.in);


        int result = scanner.nextInt();



        /* 문제풀이 위치 */
        if(result==1){
            System.out.println("회원가입 성공!");
        } else if (result==2) {
            System.out.println("사용중인 아이디");

        }else if (result==3){
            System.out.println("입력이 안된 정보가 있습니다.");

        }else {
            System.out.println("데이터 베이스 오류");
        }

        /* ----------- */


    }
}
