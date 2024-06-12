package day05;

import java.security.spec.RSAOtherPrimeInfo;

public class Step1 {//class s

    public static void main(String[] args) {//main s

        //94.
        int age = 7;
        if (age >= 8) {
            System.out.println("학교에 다닙니다.");
        } else {
            System.out.println("학교에 다니지 않습니다.");
        }

        //97
        int age2 = 9;
        int charge;
        if (age2 < 8) {
            charge = 1000;
            System.out.println("취학 전 아동입니다.");
        } else if (age2 < 14) {
            charge = 2000;
            System.out.println("초등학생입니다.");
        } else if (age2 < 20) {
            charge = 2500;
            System.out.println("중,고등학생입니다.");
        } else {
            charge = 30;
            System.out.println("일반인입니다.");
        }
        System.out.println("입장료는" + charge + "원입니다.");


        //102
            //switch : 하나의 값을 비교할 때 주로, 논리[> < >= <= &&|| ] 비교 할 때는 적합하지 않다.
           //break(키워드): for,switch 문에서 사용되는 키워드
                    //switch 에서 해당 case 가 충족해서 실행문이 실행될 때 해당 switch 종료/탈출 할 때 사용
        int ranking =1;
        char medaColor;

        switch(ranking){ //switch (검사대상){}
            case 1 : medaColor ='G';break; //case 검사결과: 실행문;
            case 2 : medaColor ='S';break; //case 검사결과: 실행문;
            case 3 : medaColor ='B';break; //case 검사결과: 실행문;
            default: medaColor ='A'; // default(그외) : 실행문;
        }
        System.out.println(ranking +"등 메달의 색깔은 " + medaColor+" 입니다.");

        if(ranking ==1){medaColor ='G'; }
        else if(ranking ==2){ medaColor ='S';}
        else if(ranking ==3){ medaColor ='B';}
        else { medaColor ='A'; }
        System.out.println(ranking +"등 메달의 색깔은 " + medaColor+" 입니다.");




        //p.105
        String medal = "Gold";

        //switch (누구를 ){}
        switch ( medal ){
            case "Gold" :  //case 결과비교                //break : switch 탈출
                System.out.println("금메달"); break;
            case "Silver" :
                System.out.println("은메달"); break;
            case "Bronze" :
                System.out.println("동메달"); break;
            default:
                System.out.println("메달이 없습니다"); break;

        }

    }//main e
}//class e
