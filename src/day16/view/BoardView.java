package day16.view;
//패키지가 day16 안에 view라는 서브 패키지를 선언함

import day15.step3_MVC.Controller;
//day15 패키지 안에 있는 step_MVC 서브 패키지 안에 controller클래스를 현재 파일에서 사용하겠다는 뜻
import day16.controller.BoardController;
import day16.controller.MemberController;
//day16 패키지 안에 있는 controller 패키지에 속한
// MemberController 클래스를 현재 파일에서 사용하겠다는 것.
import day16.model.dto.BoardDto;
import day16.model.dto.MemberDto;
import day16.model.dto.ReplyDto;
//day16 패키지 안에 model서브 패키지 안에 dto라는 또다른 패키지 안에 MemberDto클래스를 현재 파일에서 사용하겠다는 뜻
import java.util.ArrayList;
import java.util.Scanner;
// java.util 패키지에 속한 Scanner 클래스를 현재 파일에서 사용할 수 있도록 선언

public class BoardView {// MemberView라는 클래스를 공개적으로 정의하는 것

    //0 객체생성 + Scanner 선언
    public static BoardView bView =new BoardView(); //공개적인 static BoardView클래스를 안에  static변수 bView를 생성하여  BoardView값을 넣겠다는 객체 생성을 함
    Scanner scan=new Scanner(System.in);
    //사용자로부터 입력받기 위해 스캐너라는 클래스를 생성하여 스캔이라는 변수에 입력받겠다는 것

    //0. 로그인 성공시 초기화면
    public void index2(){  //index2 공개(public) 메서드를 정의
        while (true){ //무한으로 입력받을 메뉴 while문을 선언
            System.out.println(">> 1. 로그아웃 2. 회원수정 3. 회원탈퇴 4. 게시판 : ");
            int ch= scan.nextInt(); //정수형으로 값을 입력받을 변수 ch 선언
            if(ch==1){ logout();return;
                //로그아웃 버튼을 클릭했을 때 (ch==1일때)로그아웃이 되는 함수  logout()를 호출하여 로그아웃이 바로 가능하도록 함
                //초기화면으로 돌아가기 위해 return 사용
            }
            else if (ch==2) {mUpdate();} //2번을 눌렀을 때 수정이 가능하도록 하는 함수 mUpdate()를 호출
            else if (ch==3){ //회원탍퇴할 때 탈퇴기능이 가능한 함수 mDelete()를 호출함
               if (mDelete()){

                   logout(); //로그아웃이 되는  logout()함수 호출
                   return; // else if문을 나가는 리턴을 씀 (다시 초기화면으로 돌아감-while 문)

               }
            }
            else if (ch==4) {bPrint();} //게시판을 누르면 게시판을 작성할 수 있는 함수 bPrint()를 호출


             else {} //1,2,3,4번 외에 다른 값을 입력할 시 , 잘못입력했다는 안내를 해줌 -초기화면으로 돌아감 -while

        }//w e
    }//i e


    //1. 로그아웃 함수
    public void logout(){ //logout 공개(public) 메서드를 정의
        //회원 컨트롤러에 로그아웃 메소드 호출
        //MemberController클래스안 에 선언된 변수 mcontrol을 참조하여 logout 함수를 호출함
        MemberController.mcontrol.logout();//MemberController클래스안에 선언된 mcontrol멤버변수가 logout함수를 호출
        System.out.println(">>로그아웃 성공[초기메뉴로]"); //로그아웃 함수를 만나면 초기화면으로 돌아간다는 안내 출력



    }//logout() end

    //2. 회원수정 함수
    public boolean mUpdate(){//mUpdate 공개(public) 메서드를 정의
        System.out.println(">>[수정U] 새로운 이름: "); String newName= scan.next();
        //>>[수정U] 새로운 이름:를 출력 +
        // 새로운 이름을 입력받을 새로운 변수(newName)를 선언

        System.out.println(">>[수정U] 새로운 연락처: "); String newPhone= scan.next();
        //>>[수정U] 새로운 연락처:를 출력 +
        // 새로운 연락처을 입력받을 새로운 변수(newPhone)를 선언


        MemberDto memberDto=new MemberDto();
        //객체화: MemberDto클래스안에 있는 멤버변수 값을 MemberDto클래스에 변수memberDto에 대입하겠다는 객체 생성
        memberDto.setMname(newName); memberDto.setMphone(newPhone);
        //변수 memberDto안에 이름을 저장하는 setMname()를 참조하여 대입
        //수 memberDto안에 연락처를 저장하는 setMphone()를 참조하여 대입.
        boolean result= MemberController.mcontrol.mUpdate(memberDto);
        //MemberController클래스안에 선언된 변수 mcontrol 에 mUpdate함수를 호출하여  전달후 result변수안에 넣어
        //true/false 결과값을 저장
        if(result){ //result기 있으면  수정성공 하여 초기 화면으로 돌아감
            System.out.println(">>수정성공"); return true;
        }else {
            System.out.println(">>수정실패"); //결과값이 없으면 (부르지 못하면) 실패 안내 출력 후
        }
        return false;//초기화면 돌아감



    }//mUpdate() end
    //3. 회원탈퇴 함수
    public  boolean mDelete(){//mDelete 공개(public)로 하여 boolean로 값을 반환한다는 메소드 정의
        System.out.println("[정말 탈퇴할까요?]"); //[정말 탈퇴할까요?]출력
        System.out.println(">>확인 비밀번호:");//>>확인 비밀번호: 출력
        String confirmPwd= scan.next(); //기존의 비밀번호를 담는(가져오는) 서랍 역할의 문자열 변수 confirmPwd를 선언하여 입력하는 식을 세움

        boolean result =MemberController.mcontrol.mDelete(confirmPwd);
        //MemberController클래스안에 선언된 변수 mcontrol 에 mDelete 호출하여 전달후 result변수안에 넣어
        //true/false 결과값을 저장
        if(result){ //result기 있으면  수정성공 하여 초기 화면으로 돌아감
            System.out.println("탈퇴성공)"); return true; //탈퇴성공)을 출력하고 초기화면으로 돌아감
        }else {
            System.out.println("탈퇴실패"); //탈퇴실패 출력하고 초기화면으로 돌아감
            return  false;
        }

    }//mDelete() end


    //4. 게시판(게시물 전체출력) 함수
    public  void  bPrint(){
        //BoardController클래스에서 가져온 getInstance함수안에 bPrint값을 BoardDto매개변수로하는 배열에 대입/저장
        ArrayList<BoardDto> result= BoardController.getInstance().bPrint();
        System.out.println("번호\t조회수\t작성일\t\t\t제목");
        result.forEach(dto->{  //리스트객체명 . forEach(반복변수->{실행문; });
                                    //리스트내 dto를 하나씩 반복변수에 대입 반복
            System.out.printf("%2d\t%2d\t%10s\t%10s\t%s \n",dto.getBno(),dto.getBview(),dto.getMid(),dto.getBdate(),dto.getBtitle());
        }); //dto안에 번호,조회수,날짜,제목을 가져와 출력
        System.out.print("0. 글쓰기 1~: 개별글조회"); int ch= scan.nextInt();
        if(ch==0){
            bWrite();
        } else if (ch>=1) { bView(ch);


        }


    }


    //5. 게시물 쓰기 함수 -
    public void bWrite(){
        System.out.println(">>글쓰기 <<");
        scan.nextLine();
        //입력받기 (제목과 내용)
        System.out.println(">>[저장]제목입력:"); String btitle= scan.nextLine();
        System.out.println(">>[저장]내용입력:"); String  bcontent= scan.nextLine();

        BoardDto boardDto=new BoardDto();
        boardDto.setBtitle(btitle); boardDto.setBcontent(bcontent);
        //3.입력받은 객체를 컨트롤에게 전달후 결과 응답 받기
        boolean result= BoardController.getInstance().bWrite(boardDto);
        if(result){ //결과값이 있으면 글쓰기 성공 출력
            System.out.println(">>글쓰기 성공");
        }else {
            System.out.println(">>글쓰기 실패");
            //결과값이 없으면 글쓰기 실패 출력
        }

    }

    //6 게시물 개별조회 함수
    public  void  bView(int bno){

        //매개변수로 받은 선택받은 게시물을 컨트롤에게 전달
        BoardDto result =BoardController.getInstance().bView(bno);
        if(result==null){
            System.out.println("존재하지 않는 게시물입니다.");
            return;
        }
        System.out.println("제목: "+result.getBtitle());
        System.out.println("작성자: "+result.getMno());
        System.out.println("\t조회수: "+result.getBview());
        System.out.println("작성일: "+result.getBdate());
        System.out.println("내용: "+result.getBcontent());
        //------------댓글출력------------//
        rPrint(bno);
        System.out.println(">>0.뒤로 가기 1. 삭제 2. 수정 3. 댓글쓰기:");
        int ch=scan.nextInt();

        if(ch==1){bDelete(bno);}
        else if (ch==2) {bUpdate(bno);}
        else if (ch==3) { rWrite(bno);}
        else if (ch==0) {return;}


    }

    //7.게시물 삭제 함수

    public void bDelete(int bno){
        System.out.println(">>삭제페이지<<");

        boolean result=BoardController.getInstance().bDelete(bno);

        if(result){
            System.out.println(">>삭제성공");
        }else {
            System.out.println(">>삭제실패");
        }

    }

    //8.게시물 수정 함수
    public boolean bUpdate(int bno){
        System.out.println("수정할 제목: ");String btitle= scan.next();
        System.out.println("수정할 내용: ");String  bcontent= scan.next();

        BoardDto boardDto=new BoardDto();
         boardDto.setBno(bno);
        //객체화: MemberDto클래스안에 있는 멤버변수 값을 MemberDto클래스에 변수memberDto에 대입하겠다는 객체 생성
        boardDto.setBtitle(btitle); boardDto.setBcontent(bcontent);

        boolean result=BoardController.getInstance().bUpdate(boardDto);
        if(result){
            System.out.println(">>수정성공"); return true;
        }else {
            System.out.println(">>수정실패");
        }
        return false;

    }

    //9 댓글 전체 출력 함수
    public void rPrint(int bno){

        ArrayList<ReplyDto> result = BoardController.getInstance().rPrint(bno);
        System.out.println(result);
        //리스트객체명 . forEach(반복변수->{실행문 })
        //리스트내 요소들을 하나씩 반복변수에 대입 반복처리
        System.out.println("댓글");
        result.forEach(reply->{
            System.out.printf("%s  %d %s %s \n", reply.getRdate(),reply.getMno(),reply.getRcontent(),reply.getMid());
        }); //ReplyDto안에 번호,조회수,날짜,제목을 가져와 출력

    }


    //10 댓글 쓰기 함수
     public void rWrite(int bno){
        //만약에 상황상 로그인후 댓글쓰기가 아니였다면
            //로그인 상태를 확인후 댓글 쓰기 진행
         if(! MemberController.mcontrol.loginState()){
             System.out.println("로그인 후 가능합니다");
             return;
         }
         System.out.println(">>댓글쓰기 <<");
         //위에서 next() 후 엔터 쳤을 때 san 객체에 엔터 개행기록이 남았기 때문에 nextline()인식해서 입력했다는 걸로 간주
         //- 해결방안 : next() nextLine() 사이에 의미없는 scan.nextLine(); 코드 작성
         scan.nextLine();
         //입력받기 (제목과 내용)
         System.out.println(">>[저장]내용입력:");
         String rcontent= scan.nextLine();
         ReplyDto replyDto = new ReplyDto();
         replyDto.setBno(bno);

         replyDto.setRcontent(rcontent);
         //3.입력받은 객체를 컨트롤에게 전달후 결과 응답 받기
         boolean result= BoardController.getInstance().rWrite(replyDto);

         if(result){ //결과값이 있으면 글쓰기 성공 출력
             System.out.println(">>댓글 쓰기 성공");
         }else {
             System.out.println(">>댓글 쓰기 실패");
             //결과값이 없으면 글쓰기 실패 출력
         }
     }

}// B e
