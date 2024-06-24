package 과제1.level4.answer2;

public class Step1 {

    public static void main(String[] args) {

        //   [ 객체 생성 ]
        //        임의의 데이터를 입력하여 2개의 객체를 생성하고 출력하는 코드를 작성하시오.


        //객체생성
        방문록 c1=new 방문록(1, "안녕하세요","2024-06-23","원세빈");
        방문록 c2=new 방문록(2, "안녕하세요","2024-06-22","원카니");


        System.out.println("//==========================방명록=============================//");
        System.out.println("번호             내용             작성일                작성자");


        System.out.println(c1.방문록번호 +"            "+ c1.내용 +"           "+ c1.작성일 +"           "+ c1.작성자        );
        System.out.println(c2.방문록번호 +"            "+ c2.내용 +"           "+ c2.작성일 +"           "+ c2.작성자 );
    }
}
