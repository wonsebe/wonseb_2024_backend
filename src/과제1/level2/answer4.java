package 과제1.level2;

import java.util.Scanner;

public class answer4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("가위 바위 보 선택 :");
        String player=scanner.next();


       String com="";

        int random = (int)(Math.random()*3);



        //가위바위보 지정
        if(random==0){
            com="가위";
        } else if (random==1) {
            com="바위";

        }else{
            com="보";
        }
        System.out.println("comran)" +com);

        if (player.equals(com)) {
            System.out.println("result) 비겼습니다.");
        } else if (
                player.equals("보") && com.equals("바위")||
                        player.equals("바위") && com.equals("가위") ||
                        player.equals("가위") && com.equals("보")
        ) {System.out.println("result) player 승리");}else if (
                player.equals("바위") && com.equals("보")||
                        player.equals("가위") && com.equals("바위") ||
                        player.equals("보") && com.equals("가위")
        ){
            System.out.println("result) com 승리");
        }


    }
}




