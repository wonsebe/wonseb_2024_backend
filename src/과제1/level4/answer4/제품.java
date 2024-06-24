package 과제1.level4.answer4;

public class 제품 {
//
//    제품' 을 설계하고 만들기
//            [ 클래스 생성 ]
//    멤버변수/필드 : 제품코드 , 제품명 , 가격 , 등록일
//      - 위 필드을 적절한 자료형을 선택하여 설계하시오.


    String 제품코드;
    String 제품명;
    int 가격;
    String 등록일;

    @Override
    public String toString() {
        return "제품{" +
                "제품코드='" + 제품코드 + '\'' +
                ", 제품명='" + 제품명 + '\'' +
                ", 가격=" + 가격 +
                ", 등록일='" + 등록일 + '\'' +
                '}';
    }
}