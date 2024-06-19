package day10.step3;

import java.util.Scanner;

public class StudentTest {//실행코드

    public static void main(String[] args) {
//        Student studentLee= new Student(1001, "lee");
//        studentLee.addSubject("국어",100);
//        studentLee.addSubject("수학",50);
//
//        Student studentKim= new Student(1002, "Kim");
//        studentKim.addSubject("국어",70);
//        studentKim.addSubject("수학",85);
//        studentKim.addSubject("영어",100);
//
//        studentLee.showStudentInfo();
//        System.out.println("========================================");
//        studentKim.showStudentInfo();





        //229p. 코드 주석처리
        Scanner scanner=new Scanner(System.in);

        while(true){
            System.out.println("1. 학생등록 2. 점수등록 3. 점수확인 4. 학생삭제 선택]");
            int ch= scanner.nextInt();
            if(ch==1){}
            if(ch==2){}
            if(ch==3){}
            if(ch==4){}

        }//w e

    }
}


/*
     학생목록 리스트 만들기
        [학생등록]
            1. 학번과 이름을 입력받아 학생객체 생성후 학생목록 리스트에 저장하기

        [점수등록]
            1.학번을 입력받아 동일한 학번이 있을경우
            2.과목명과 점수를 입력받아 해당 학번 학생의 점쉬리스트 정수 저장하기

        [점수확인]
            1.학번을 입력받아 동일한 학번이 있을경우
            2. 해당 학번의 학생의 모든 점수리스트를 출력해주세요.
 */