package day16.controller;

import day16.model.dao.MemberDao;
import day16.model.dto.MemberDto;

public class MemberController {

    //0.
    public static MemberController mcontrol=new MemberController();


    //1. 회원가입 화면 함수: 아이디(String)비밀번호(String?)이름(String)연락처(String) 회원가입성공여부: boolean
    public boolean signup(MemberDto memberDto){
        System.out.println("MemberController.signup");//확인용
        boolean result= MemberDao.mdao.signup(memberDto);
        return result;
    }
    //2. 로그인 화면 함수
    public  boolean login(MemberDto memberDto){
    return MemberDao.mdao.login(memberDto);

    }
    //3.아이디 찾기 화면 함수 매개변수:
    public  String  findId(MemberDto memberDto){
        return MemberDao.mdao.findId(memberDto);



    }
    //4. 비밀번호 찾기 화면 함수
    public  String findPwd(MemberDto memberDto){

        return MemberDao.mdao.findPwd(memberDto);



    }
}//c e
