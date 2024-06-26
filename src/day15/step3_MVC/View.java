package day15.step3_MVC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
    //외부 클래스로부터 내부 메소드를 사용할 수 있도록 만든 static 변수
    static View view=new View();
    Scanner scan=new Scanner(System.in);
    
    
    public void mainView(){
        System.out.println("===메인화면===");
        while (true){
            try {
                System.out.println("1.등록 2. 출력 3. 수정 4. 삭제: ");
                int ch=scan.nextInt();
                if(ch==1){ signupView(); } 
                else if (ch==2) {printView();}
                else if (ch==3){updateView(); } 
                else if (ch==4) {deleteView(); }
                else if (ch==5){

                }else {
                    System.out.println(">>없는 기능입니다.");
                }
            }
            catch (Exception e){
                System.out.println(">> 잘못된 입력입니다.");
                scan=new Scanner(System.in); //잘못입력받은 값을 가지고있는 객체를 초기화
            }

        }

    }//m
    
    
    //2. 등록페이지 함수
    public void signupView(){
        System.out.println(">>등록페이지<<");
        System.out.println(">>[저장] 이름: "); String name = scan.next();
        boolean result=Controller.controller.signupC(name);
        if(result){
            System.out.println(">>등록성공");
        }else {
            System.out.println(">>등록실패");
        }
        
    }
    //3.출력페이지 함수
    public void printView(){
        System.out.println(">>출력페이지<<");
        ArrayList<String>result=Controller.controller.printC();
        System.out.println("-----이름명단-----");
        for(int i=0; i<result.size();i++){
            System.out.println(result.get(i));
        }
    }



    //3.수정페이지 함수
    public void updateView(){
        System.out.println(">>수정페이지<<");
        System.out.println(">>[수정U] 기존 이름: "); String oldName= scan.next();
        System.out.println(">>[수정U] 새로운 이름: "); String newName= scan.next();
        boolean result=Controller.controller.updateC(oldName,newName);
        if(result){
            System.out.println(">>수정성공");
        }else {
            System.out.println(">>수정실패");
        }
    }
    
    //5.삭제 페이지 함수
    public void deleteView(){
        System.out.println(">>삭제페이지<<");
        System.out.println(">>[삭제D] 이름: "); String name= scan.next();
        boolean result=Controller.controller.deleteC(name);
        if(result){
            System.out.println(">>삭제성공");
        }else {
            System.out.println(">>삭제실패");
        }
    }
    
}//c e
