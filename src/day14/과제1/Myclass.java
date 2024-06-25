package day14.과제1;

public class Myclass implements MyInterface{ //MyInterface를 Myclass가 상속받아 메소드를 제정의함
    @Override
    public void x() { //X인터페이스에서 상속받은 x()메서드구현
        System.out.println("x()");
    }

    @Override
    public void y() {//Y인터페이스에서 상속받은 y()메서드구현
        System.out.println("y()");
    }

    @Override
    public void myMethod() {
        System.out.println("myMethod()");
    }
}
