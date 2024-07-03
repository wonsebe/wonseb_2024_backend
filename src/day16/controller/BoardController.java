package day16.controller;

import day16.model.dao.BoardDao;
import day16.model.dto.BoardDto;
import day16.model.dto.ReplyDto;

import java.util.ArrayList;

public class BoardController {

    // ========싱글톤 만들기======== //
    // 싱글톤: 프로그램내 해당 클래스의 하나의 객체만 갖는 패턴

        //1. private static 변수에 해당 클래스의 객체 생성해서 대입
    private static BoardController bController=new BoardController();
    private int loginMno;

    //2.해당 클래스의 생성자를 private 한다. 다른 클래스로부터  new 사용하지 못하게 차단하기
    private  BoardController(){}
        //3. 해당 객체(싱글톤)를 외부로부터 접근할 수 있도록 간접(추후에 유효성검사) 호출 메소드

        public static BoardController getInstance(){
        return bController;


    }

    public ArrayList<BoardDto> bPrint() {
        //다오에게 전체 게시물 조회 요청 후 결과를 반환
        return BoardDao.getInstance().bPrint();
    }
    // ======게시물 개별 조회=====================//
    public  BoardDto bView(int bno){
        ///해당 게시물 조회수 처리
         BoardDao.getInstance().viewIncrease(bno);

        //BoardDao에 있는 getInstance안에 bView를 매개변수 게시판번호로하여 반환한다.
    return BoardDao.getInstance().bView(bno);

    }

    public boolean bWrite(BoardDto boardDto){
        //매개변수로 전달받은 boardDto에 현재 로그인된 회원번호를 대입
        boardDto.setMno(MemberController.mcontrol.loginMno);
        //-
        return BoardDao.getInstance().bWrite(boardDto);
    }

    public boolean bDelete(int bno){

        //매개변수로 전달받은 boardDto에 현재 로그인된 회원번호를 대입
        int mno=MemberController.mcontrol.loginMno;
        //-
        return BoardDao.getInstance().bDelete(bno,mno);
    }

    public boolean bUpdate(BoardDto boardDto) {


        int mno=MemberController.mcontrol.loginMno;
        boardDto.setMno(mno);
        return BoardDao.getInstance().bUpdate(boardDto);



    }
    //댓글출력
    public ArrayList<ReplyDto> rPrint(int bno){
        return BoardDao.getInstance().rPrint(bno);

    }

    //10 댓글 쓰기 함수
    public boolean rWrite(ReplyDto replyDto){
        // 현재 로그인된 회원의 번호, 즉) 작성자 회원번호
        replyDto.setMno(MemberController.mcontrol.loginMno);
        //-
        return BoardDao.getInstance().rWrite(replyDto);




    }

    //  12. 제목 검색 함수
    public ArrayList<BoardDto> search(String title){
        //ArrayList<BoardDto> result = BoardDao.getInstance().search(title);
       // System.out.println(BoardDao.getInstance().search(title)); DAO가 두번 실행됨
        return BoardDao.getInstance().search(title);

    }   //  search 메소드 end



}
