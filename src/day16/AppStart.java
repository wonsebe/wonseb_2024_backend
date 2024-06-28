package day16;
//패키지 day16 선언

import day16.view.MemberView;
//day16 안에 view서브 패키지 안에 MemberView 클래스를 현재 파일에서 사용하겠다는 뜻
public class AppStart {// MemberView라는 클래스를 공개적으로 정의
    public static void main(String[] args) { //main 함수(실행함수) 선언

        MemberView.mView.index();//MemberView 클래스 안에 mView멤버변수가 index함수를 호출하는 식
    }//m e



}//AppStart e
