package 과제1.level4.answer4;

public class Step1 {

    public static void main(String[] args) {
        //            [ 객체 생성 ]
//    임의의 데이터를 입력하여 2개의 객체를 생성하고 출력하는 코드를 작성하시오.

        제품 p1= new 제품();
        p1.제품코드="p-1";
        p1.제품명="사이다";
        p1.가격=2000;
        p1.등록일="2024-06-23";

        제품 p2=new 제품();
        p2.제품코드= "p-1";
        p2.제품명= "아메리카노";
        p2.가격=4000;
        p2.등록일="2024-06-24";

        System.out.println("//==========================제품목록===========================//");

        System.out.println(p1);
        System.out.println(p2);



    }
}
