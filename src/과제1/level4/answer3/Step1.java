package 과제1.level4.answer3;

public class Step1 {

    public static void main(String[] args) {
        //            [ 객체 생성 ]
//    임의의 데이터를 입력하여 2개의 객체를 생성하고 출력하는 코드를 작성하시오.

        회원 c1= new 회원(1, "sevin0129",1234,"원세빈");
        회원 c2= new 회원(2, "kany0129",5678,"원카니");

        System.out.println("//==========================회원목록=============================//");
        System.out.println("회원번호             아이디           비밀번호                이름");

        System.out.println(c1.회원번호 +"                 "+ c1.아이디 +"         "+ c1.비밀번호 +"                "+ c1.이름        );
        System.out.println(c2.회원번호 +"                 "+ c2.아이디 +"          "+ c2.비밀번호 +"                "+ c2.이름 );
    }


}
