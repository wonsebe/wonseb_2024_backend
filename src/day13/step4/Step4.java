package day13.step4;

class Parent{
    //상위클래스로 사용할 예정
    protected  String filed1;
    //생성자

    //메소드
    public void method1(){
        System.out.println("Parent.method1");
    }
    public void method2(){
        System.out.println("Parent.method2");
    }

}
class  Child extends Parent{

    //하위클래스 사용
protected String filed2;
public void method3(){
    System.out.println("Child.method3");
}
    //오버라이딩: 상속받은 메소드의 로직을 재정의

    @Override
    public void method1() {
        System.out.println("Child.method1");
    }

    @Override
    public void method2() {
        System.out.println("Child.method2");
    }
}

public class Step4 {

    public static void main(String[] args) {

        Child child=new Child();
        //자식은 부모타입의 메소드,멤버변수를 사용할 수 있다.

        child.method1();; //child.method1
        child.method2(); //child.method2
        System.out.println(child.filed1);//null

        System.out.println(child.filed2);//null
        child.method3();
        //----------------------------------------//
        Parent parent=child;//자식타입 ---> 부모타입*(자식타입의 오버라이딩 메소드 최우선)
        parent.method1();  // --,Child.method1
        parent.method2(); // --,Child.method2
        System.out.println(parent.filed1);

        //----------부모타입에서는 자식타입의 메소드, 멤버변수를 사용할 수 없다.
//        System.out.println(parent.filed2);
//        parent.method3();

        //------------------------------------//
        Child child2=(Child)parent; // 자식타입<---부모타입
        System.out.println(child2.filed2);
        child2.method3();// -- child.method3

    }

}
