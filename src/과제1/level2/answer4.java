package 과제1.level2;

import java.util.Scanner;

public class answer4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" >> Level2_4 answer >> ");
        //입력값 출력
        System.out.println("가위 바위 보 선택 :");
        String player=scanner.next();//입력하기


        String com=""; //문자열 변수선언(가위바위보입력)

        int random = (int)(Math.random()*3); //랜덤함수 선언



        //가위바위보 지정
        if(random==0){
            com="가위";
        } else if (random==1) {
            com="바위";

        }else{
            com="보";
        }
        System.out.println("comran)" +com);

        if (player.equals(com)) { //equals(문자열변수)대입하여 player에게 참조시켜 컴퓨터와 일치할 경우 비겼다는 안내출력
            System.out.println("result) 비겼습니다."); }

        else if ( //컴퓨터와 일치하지 않을 경우 player가 이기는 경우의 수를 생각
                player.equals("보") && com.equals("바위")||
                        player.equals("바위") && com.equals("가위") ||
                        player.equals("가위") && com.equals("보")
        ) {System.out.println("result) player 승리");}

        else if (//player가 지는 조건을 생각하여 com이 이기는 안내 출력
                player.equals("바위") && com.equals("보")||
                        player.equals("가위") && com.equals("바위") ||
                        player.equals("보") && com.equals("가위")
        ){
            System.out.println("result) com 승리");
        }


    }
}




