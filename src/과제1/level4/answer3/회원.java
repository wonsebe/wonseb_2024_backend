package 과제1.level4.answer3;

public class 회원 {

//    주제 : '회원' 을 설계하고 만들기
//   [ 클래스 생성 ]
//    멤버변수/필드 : 회원번호 , 아이디 , 비밀번호 , 이름
//      - 위 필드을 적절한 자료형을 선택하여 설계하시오.
//


    int 회원번호;
    String 아이디;
    int 비밀번호;
    String 이름;

    public 회원(int 회원번호, String 아이디, int 비밀번호, String 이름) {
        this.회원번호 = 회원번호;
        this.아이디 = 아이디;
        this.비밀번호 = 비밀번호;
        this.이름 = 이름;
    }

    @Override
    public String toString() {
        return "회원{" +
                "회원번호=" + 회원번호 +
                ", 아이디='" + 아이디 + '\'' +
                ", 비밀번호=" + 비밀번호 +
                ", 이름='" + 이름 + '\'' +
                '}';
    }
}
