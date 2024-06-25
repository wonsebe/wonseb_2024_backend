package day14.과제1;

public class MyClassTest {

    public static void main(String[] args) {

        Myclass mClass =new Myclass();
        X xClass=mClass; //mClass를 인터페이스 X 타입의 변수 xClass에 타입변환
        xClass.x();

        Y yClass= mClass;
        yClass.y();
        MyInterface iClass=mClass;
        iClass.myMethod();
        iClass.x();
        iClass.y();
    }
}
