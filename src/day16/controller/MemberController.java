package day16.controller;
//day16 패키지안에 controller라는 서브 패키지를 선언함

import day16.model.dao.MemberDao;
//day16 안에 서브 패키지 model에 속한 dao패키지 안에 MemberDao클래스를 현재 파일에서 쓰겠다는 말

import day16.model.dto.MemberDto;
//day16 안에 model 패키지 안에 dto안에 속한 MemberDto클래스를 현재 파일에서 사용하겠다는 말

public class MemberController { // MemberController라는  클래스를 공개적으로 정의하는 것

    //0.
    public static MemberController mcontrol=new MemberController(); //공개 static클래스 MemberController 에 선언된
    // static변수 mcontrol 선언하여  MemberController갑을 대입하겠다는 객체생성
    //static 변수를 선언하지 않으면 다른 클래스에서 사용하기 어렵기 때문에 객체 하나만 가지고 여러 클래스에서 사용(공유)하기 위해 static클래스를 선언해줘야한다.



    //1. 회원가입 화면 함수: 아이디(String)비밀번호(String?)이름(String)연락처(String) 회원가입성공여부: boolean
    public boolean signup(MemberDto memberDto){ //signup 공개(public)로 하여 boolean로 값을 반환한다는 메소드 정의
        //MemberDto 타입의 객체를 매개변수로 받아 memberDto 객체를 사용하여 로그인하는 기능을 수행한다
        System.out.println("MemberController.signup");//확인용
        boolean result= MemberDao.mdao.signup(memberDto);
        //MemberController클래스안에 선언된 변수 mcontrol 에 mDelete 호출하여  전달후 result변수안에 넣어
        //true/false 결과값을 저장
        return result; //초기화면으로 result을 가지고  돌아감
    }//signup e

    //2-1로그인 성공한 회원의 번호 저장하는 멤버변수
        //-글쓰기,댓글쓰기 할 때 현재 로그인된 회원을 식별하기 위해서
        //-초기값 :0 비로그인상태, 1~ : 로그인된회원번호(로그인된상태)
    public int loginMno=0; //loginMno를 정수타입으로 하여 0으로 값을 대입함

    //static MemberController으로 하지않고 멤버변수로만 선언할 경우 , 각 클래스가 만든 객체들 각각 수정해줘야한다.(하나만 바꾸면 하나는 바뀌지않음)

    //2-2로그아웃 함수
    public  void logout(){ //logout 공개(public) 메서드를 정의
        loginMno =0; //로그인이 안된 상태를 0으로 지정하여 로그아웃된 상태를 보여줌
    }//logout e
    //2. 로그인 화면 함수
    public  boolean login(MemberDto memberDto) { //login 공개(public)로 하여 boolean로 값을 반환한다는 메소드 정의
        //MemberDto에  memberDto 을 매개변수로 받아 로그인하는 기능을 수행한다
        loginMno = MemberDao.mdao.login(memberDto); //MemberDao 클래스 안에 mdao변수가 memberDto값을 매개변수로 갖는 login함수를 호출하여 로그인번호를 전달하는 loginMno 에 대입
        return loginMno ==0 ? false : true; //loginMno가 0이면 로그인이 안된상태고 0이아니면 로그인이 된 상태를 반환값으로 갖는다
        //0이면 로그인 안한상태
    }//logout e



    //3.아이디 찾기 화면 함수 매개변수:
    public  String  findId(MemberDto memberDto){  //login 공개(public)로 하여 String으로 값을 반환한다는 메소드 정의
        //MemberDto에  memberDto 을 매개변수로 받아 아이디를 찾는 기능을 수행한다
        return MemberDao.mdao.findId(memberDto);
        //MemberDao클래스 안에 선언된 mdao변수가  findId함수를 호출하여 memberDto를 매개변수로 값을 전달하여  가져온  받은 반환값(String)을 받아와서 반환한다.



    }//findId e
    //4. 비밀번호 찾기 화면 함수
    public  String findPwd(MemberDto memberDto){ ////findPwd 공개(public)로 하여 String으로 값을 반환한다는 메소드 정의
        //MemberDto에  memberDto 을 매개변수로 받아 비밀번호를 찾는 기능을 수행한다
        //view로부터 받은 확인비밀번호와 로그인된 회원번호를 Dao 에게 전달
        return MemberDao.mdao.findPwd(memberDto);
        //MemberDao클래스 안에 선언된 mdao변수가  findPwd함수를 호출하여 memberDto를 매개변수로 값을 전달하여  가져온  받은 반환값(String)을 받아와서 반환한다.


    }//findPwd e

    public boolean mDelete(String confirmPwd){ //login 공개(public)로 하여 boolean으로 값을 반환한다는 메소드 정의
        return  MemberDao.mdao.mDelete(confirmPwd,loginMno);
        //MemberDao클래스 안에 선언된 mdao변수가  mDelete 함수를 호출하여 memberDto를 매개변수로 값을 전달하여  가져온
        // 받은 반환값(String)을 받아와서 반환한다.


    }//mDelete e

    //2. 회원수정 함수 매개변수
    public boolean mUpdate(MemberDto memberDto){//mUpdate 공개(public)로 하여 boolean으로 값을 반환한다는 메소드 정의
        //+memberDto에 로그인된회원번호
        memberDto.setMno(loginMno);
        //memberDto 객체내 mno멤버변수에 loginMno를 대입/저장
        return  MemberDao.mdao.mUpdate(memberDto);
        //MemberDao클래스 안에 선언된 mdao변수가  mUpdate 함수를 호출하여 memberDto를 매개변수로 값을 전달하여  가져온
        // 받은 반환값(boolean)을 받아와서 반환한다.
    }//mUpdate e
}//c e
