package day16.view; //day16이라는 패키지 이름 안에 view라는 서브 패키지를 선언함

import day16.controller.MemberController;
//day16 패키지 안에 있는 controller 패키지에 속한
// MemberController 클래스를 현재 파일에서 사용하겠다는 것.

import day16.model.dto.MemberDto;
//day16 패키지 안에 있는 model에 속하며 dto 패키지를 통한 MemberDto 클래스를 현재 파일에서 사용하겠다는 것.

import java.util.InputMismatchException;
//예외 클래스를 사용하여 예외 상황을 처리할 때, 해당 클래스의 기능을 현재 파일에서 사용하겠다는 선언

import java.util.Scanner;
// java.util 패키지에 속한 Scanner 클래스를 현재 파일에서 사용할 수 있도록 선언

public class MemberView {
// MemberView라는 클래스를 공개적으로 정의하는 것
    //-해당 클래스의 함수들을 다른 클래스에서 호출 할 수 있도록 static 변수에 해당
    //public: 다른 클래스에서도 접근 가능

    public static MemberView mView=new MemberView(); //원래 static만 사용하면 다른 패키지 이기 때문에 안됨.
    //public을 꼭 써줘야 된다.
    //공개정적 변수를 선언하고 mView가  MemberView()라는 클래스의 객체를 참조하겠다는 뜻의 객체생성을 하였다.
    //static: 정적 메소드로 객체가 생성되기 이전에 메모리에 할당되어 인스턴스를 생성하지 않고 접근할 수 있다.


    Scanner scan=new Scanner(System.in);
    //사용자로부터 입력받기 위해 스캐너라는 클래스를 생성하여 스캔이라는 변수에 입력받겠다는 것


    //0.초기화면 함수
    public void index(){
        //얘도 public으로 바꿔주ㅓ야 함
        //index인 공개(public) 메서드를 정의

        while(true){ // 각종 메뉴를 무한적으로 입력받는 while 문 생성
            System.out.println("1.회원가입 2.로그인 3. 아이디찾기 4.비밀번호찾기 : ");
            //각 입력받을 메뉴 출력
            try { //예외가 발생할 가능성이 있는 코드를 정의
                int ch=scan.nextInt();
                if(ch==1){signup(); }
                else if (ch==2) {login();}
                else if (ch==3) {findId();}
                else if (ch==4) {findPwd();}
                else {
                    System.out.println(">>없는 기능입니다.");
                }
            }catch (InputMismatchException e){
                //catch: 예외상황을 처리하기 위해 catch를 씀 -프로그램 안정화
                //InputMismatchException: 입력시 타입이 일치하지 않을때 발생하는 예외 클래스임
                //InputMismatchException e 입력시 타입이 일치하지 않을때 e라는 변수에 담아 오류를 안내해주는 것
                System.out.println(">>잘못된 입력이 있습니다. 초기메뉴로"); //잘못된 값을 안내해주는 말 출력
                scan=new Scanner(System.in);  //위에 지역변수로 선언된 Scanner scan=new Scanner(System.in);이 있으므로 클래스명은
                //쓰지 않고 객체에 넣을 변수부터 입력가능
                //잘못된 입력값을 입력하여 초기메뉴로 돌아가면 다시 입력을 받는 식을 세움.
            }

        }//w e
    }//i e

    //1. 회원가입 화면 함수
    public void signup(){ //signup 공개(public) 메서드를 정의
        System.out.println(">>회원가입페이지<<"); //'회원가입페이지'출력
        System.out.println(">>[저장]아이디"); String mid= scan.next();//      '>>[저장]아이디' 출력
        System.out.println(">>[저장]비밀번호"); String  pmwd= scan.next(); // '>>[저장]비밀번호' 출력
        System.out.println(">>[저장]이름"); String mname= scan.next(); //     '>>[저장]이름' 출력
        System.out.println(">>[저장]연락처"); String mphone= scan.next(); // '>>[저장]연락처' 출력
        //유효성검사
        //객체화: MemberDto클래스안에 있는 멤버변수 값을 MemberDto클래스에 변수memberDto에 대입하겠다는 객체 생성
        MemberDto memberDto=new MemberDto(mid,pmwd,mname,mphone);
        //4.Controller에게 전달: 아이디,비밀번호,이름,연락처를 갖고있는  변수memberDto를
        // MemberController안에있는 mcontrol안에 signup함수에매개변수값을 전달후 true / false로 결과값(result)에 대입하는 식
        boolean result= MemberController.mcontrol.signup(memberDto);
        if(result){ //결과값이 있으면 회원가입 성공 출력
            System.out.println(">>회원가입성공");
        }else {
            System.out.println(">>회원가입실패");
            //결과값이 없으면 회원가입 실패 출력
        }


    }
    //2. 로그인 화면 함수
    public  void login(){ //login 공개(public) 메서드를 정의

        System.out.println(">>아이디 입력:");  // >>아이디 입력: 출력
        String mid= scan.next(); //입력할 값이 문자열이므로 타입을 String으로 설정하여 아이디를 입력할 수 있게 하는 식 선언
        System.out.println(">>비밀번호 입력:"); // >>비밀번호 입력:
        String  pmwd= scan.next();////입력할 값이 문자열이므로 타입을 String으로 설정하여 비밀번호를 입력할 수 있게 하는 식 선언
        MemberDto memberDto=new MemberDto(); //MemberDto()MemberDto안에 변수memberDto 에 값을 대입하겠다는 객체 생성
        memberDto.setMid(mid); memberDto.setPmwd(pmwd); //변수 memberDto안에 아이디를 저장하는 setMid()를 참조하여 대입.
        //수 memberDto안에 비밀번호를 저장하는 setPmwd()를 참조하여 대입.
        boolean result= MemberController.mcontrol.login(memberDto); //MemberController클래스안에 선언된 변수 mcontrol 에 login함수를 호출하여 전달후 result변수안에 넣어
        //true/false 결과값을 저장

        if(result){ //result값이 있으면 로그인성공 출력
            System.out.println(">>로그인성공");
            //로그인 성공시 로그인된 메뉴로 이동
            BoardView.bView.index2();
            // BoardView클래스 안에 선언된 static 변수인 bView를 참조하고 그 변수가 index2() 메소드를 호출한다.
            //=> 1. 로그아웃 2. 회원수정 3. 회원탈퇴 4. 게시판 : 를 입력받는 화면으로 이동

        }else { //result 값이 없으면 로그인 실패 출력
            System.out.println(">>로그인실패");
        }
    }
    //3.아이디 찾기 화면 함수
    public  void findId( ){//findId 공개(public) 메서드를 정의
        System.out.println(">>아이디 찾기");  //>>아이디 찾기 출력하는 식
        System.out.println(">>이름:");  String mname= scan.next(); //>>이름: 출력하고 새로운 이름을 받는 변수 mname를 선언하여 문자열타입으로 입력받음
        System.out.println(">>연락처"); String mphone= scan.next(); //>>연락처: 출력하고 새로운 연락처를 받는 변수 mname를 선언하여 문자열타입으로 입력받음
        MemberDto memberDto=new MemberDto(); //MemberDto()MemberDto안에 변수memberDto 에 값을 대입하겠다는 객체생성
        memberDto.setMname(mname); memberDto.setMphone(mphone); //변수 memberDto안에 이름과 연락처 정보를 저장하는 setMid()를 사용해 참조하여 대입.
        String result= MemberController.mcontrol.findId(memberDto); //MemberController클래스안에 선언된 변수 mcontrol 에 findId함수를 호출하여 전달후 result변수안에
        //문자열 타입으로 결과값을 대입
        if(result !=null){ //result값이 빈깡통이 아니면 찾은아이디와 그 값의 정보를 출력신다
            System.out.println(">>찾은 아이디"+result);
        }else { // 값이 빈깡통이면 아이디가 없습니다 출력
            System.out.println(">>아이디가 없습니다");
        }
    }
    //4. 비밀번호 찾기 화면 함수
    public  void findPwd(){ //findPwd 공개(public) 메서드를 정의
        System.out.println(">>비밀번호 찾기"); //>>비밀번호 찾기 출력
        System.out.println(">>아이디:"); String mid= scan.next();//">>아이디:를 입력받을 문구 출력 + 아이디를 입력할  변수mid를 선언해 값을 넣음
        System.out.println(">>연락처"); String mphone= scan.next(); //>>연락처를 입력받을 문구 출력 + 연락처를 입력할 변수 mphone를 선언하여 값 대입

        MemberDto memberDto=new MemberDto(); //MemberDto()MemberDto안에 변수memberDto 에 값을 대입하겠다는 객체생성 -멤버변수가아니기 때문에 계속 선언해줘야함
        memberDto.setMid(mid); memberDto.setMphone(mphone); //변수 memberDto안에 아이디과 연락처 정보를 저장하는  setMid()를 사용해 참조하여 대입.
        String  result= MemberController.mcontrol.findPwd(memberDto); //MemberController클래스안에 선언된 변수 mcontrol 에 findId함수를 호출하여 전달후 result변수안에
        //문자열 타입으로 결과값을 대입

        if(result !=null){ //result값이 빈깡통이 아니면 찾은 비밀번호와 그 값의 정보를 출력신다
            System.out.println(">>찾은 비밀번호"+result);
        }else {// 값이 빈깡통이면 비밀번호가 없습니다 출력
            System.out.println(">>비밀번호가 없습니다");
        }
    }



}//c e
