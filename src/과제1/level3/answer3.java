package 과제1.level3;

import java.util.Random;

public class answer3 {
    public static void main(String[] args) {

        //난수생성자 선언
        int random = new Random().nextInt(10);

        //난수를 추가할  문자열 변수 선언 , 추가
        String  authNumber=String.valueOf(random);

        //난수가 0~9까지만 반복되는 반복문 생성
        for(int i=0; i<5; i++){
            int result1=new Random().nextInt(10);
            authNumber+=result1;
        }
        System.out.println("본인확인 인증번호: "+authNumber );

    }

}
