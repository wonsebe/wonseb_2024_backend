package day16.view;

import day16.controller.MemberController;
import day16.model.dto.MemberDto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MemberView {

    //-해당 클래스의 함수들을 다른 클래스에서 호출 할 수 있도록 static 변수에 해당
    public static MemberView mView=new MemberView(); //원래 static만 사용하면 다른 패키지 이기 때문에 안됨.
    //public을 꼭 써줘야 된다.




    Scanner scan=new Scanner(System.in);


    //0.초기화면 함수
    public void index(){ //얘도 public으로 바꿔주ㅓ야 함
        while(true){
            System.out.println("1.회원가입 2.로그인 3. 아이디찾기 4.비밀번호찾기 : ");
            try {
                int ch=scan.nextInt();
                if(ch==1){signup(); }
                else if (ch==2) {login();}
                else if (ch==3) {findId();}
                else if (ch==4) {findPwd();}
                else {
                    System.out.println(">>없는 기능입니다.");
                }
            }catch (InputMismatchException e){
                System.out.println(">>잘못된 입력이 있습니다. 초기메뉴로");
                scan=new Scanner(System.in);

            }




        }//w e
    }//i e

    //1. 회원가입 화면 함수
    public void signup(){
        System.out.println(">>회원가입페이지<<");
        System.out.println(">>[저장]아이디"); String mid= scan.next();
        System.out.println(">>[저장]비밀번호"); String  pmwd= scan.next();
        System.out.println(">>[저장]이름"); String mname= scan.next();
        System.out.println(">>[저장]연락처"); String mphone= scan.next();
        //유효성검사
        //객체화
        MemberDto memberDto=new MemberDto(mid,pmwd,mname,mphone);
        //4.Controller에게 전달
        boolean result= MemberController.mcontrol.signup(memberDto);
        if(result){
            System.out.println(">>회원가입성공");
        }else {
            System.out.println(">>회원가입실패");
        }


    }
    //2. 로그인 화면 함수
    public  void login(){

        System.out.println(">>아이디 입력:"); String mid= scan.next();
        System.out.println(">>비밀번호 입력:");String  pmwd= scan.next();
        MemberDto memberDto=new MemberDto();
        memberDto.setMid(mid); memberDto.setPmwd(pmwd);
        boolean result= MemberController.mcontrol.login(memberDto);

        if(result){
            System.out.println(">>로그인성공");
        }else {
            System.out.println(">>로그인실패");
        }
    }
    //3.아이디 찾기 화면 함수
    public  void findId( ){
        System.out.println(">>아이디 찾기");
        System.out.println(">>이름:");  String mname= scan.next();
        System.out.println(">>연락처"); String mphone= scan.next();
        MemberDto memberDto=new MemberDto();
        memberDto.setMname(mname); memberDto.setMphone(mphone);
        String result= MemberController.mcontrol.findId(memberDto);

        if(result !=null){
            System.out.println(">>찾은 아이디"+result);
        }else {
            System.out.println(">>아이디가 없습니다");
        }
    }
    //4. 비밀번호 찾기 화면 함수
    public  void findPwd(){
        System.out.println(">>비밀번호 찾기");
        System.out.println(">>아이디:"); String mid= scan.next();
        System.out.println(">>연락처"); String mphone= scan.next();

        MemberDto memberDto=new MemberDto();
        memberDto.setMid(mid); memberDto.setMphone(mphone);
        String  result= MemberController.mcontrol.findPwd(memberDto);

        if(result !=null){
            System.out.println(">>찾은 비밀번호"+result);
        }else {
            System.out.println(">>비밀번호가 없습니다");
        }
    }

}//c e
