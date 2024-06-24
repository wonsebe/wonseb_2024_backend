package 과제1.level2;

import java.util.Scanner;

public class answer3 {

    public static void main(String[] args) {
//    [문제] 국어,영어,수학 3개의 점수가 선언되어 있습니다. 그림과 같이 출력하시오.
//   [조건]
//        1. 문제풀이 위치 외 코드는 수정 불가 합니다.
//        2.
//        합계 : 3개의 점수를 모두 더한 값
//        평균 : 합계 / 과목수       [소수 첫째자리 까지 출력 ]
//        3배수 : 합계 값이 3의 배수이면 true 아니면 false
//        7배수 : 합계 값이 7의 배수이면 true 아니면 false
//        홀짝 : 합계 값이 홀수이면 홀수출력 아니면 짝수 출력
//        결과 : 합계가 65점이상이면 합계 아니면 탈락 출력
//        3. *(중요) 풀이코드에서 printf는 한번만 사용합니다.

        //변수 선언
        int 국어=89;
        int 영어=49;
        int 수학=72;
        int sum= 국어+수학+영어;
        float average= sum/3;
        boolean check =false;
        boolean check8 =false;
        String 홀짝 ="";
        String result= "";

        //합계가 3배수일 때
        if(sum %3==0){
            check=true;
        }  else {
            check=false;
        }//합계가 8배수 일때
        if(sum %8==0){
            check8=true;
        }  else {
            check8=false;
        }
        //합계가 홀수일때
        if( sum%2!=0) {
            홀짝 = "홀수";
        }else{
            홀짝 = "짝수";
        }//합계가 65점 이상일 때
        if(sum >=65){
            result= "합격";
        }else {
            result= "탈락";
        }
        System.out.println(" >>                       Level2_3 answer                                >> ");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("국어     영어      수학      합계      평균    3배수      8배수     홀짝       결과");//출력
        System.out.printf("%d"+"%8d"+"%10d"+"%10d"+"%9.1f"+"%8b"+"%11b"+"%7s"+"%9s",국어,영어,수학,sum,average,check,check8,홀짝,result);//printf는 한 번만 사용





    }
}
