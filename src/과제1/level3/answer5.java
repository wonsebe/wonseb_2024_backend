package 과제1.level3;

import java.util.Random;

public class answer5 {

//        [문제]
//        - 본인확인 인증번호 구현
//        1. 문자열 authNumber 변수에 빈 데이터가 초기화 되어 있습니다.
//        2. 난수[ 0~9 ]를 생성하여 authNumber변수에 추가합니다.
//        난수 생성 코드 참고 : int random = new Random().nextInt(10);
//        3. 총 6회 난수[ 0~9 ]를 생성하여 6자리 인증번호를 만들어줍니다.
//	[조건]
//        1. 문제풀이 위치 외 코드는 수정 불가 합니다.
//        2. 실행할때마다 서로 다른 인증번호가 생성 되어야 합니다.
public static void main(String[] args) {
    //문자열 변수 authNumber 선언
    String authNumber="";

    //i가 0부터 5까지 6개의 난수를 생성하는 for 문 작성
    for(int i=0; i<6; i++){
        int random = new Random().nextInt(10);
        authNumber +=random; //random이 6개의 난수를 뽑아내면 authNumber변수가 숫자들을 합쳐 담아줌
    }
    System.out.println("본인확인 인증번호: "+ authNumber); //6개 인증번호 출력





}


    }


