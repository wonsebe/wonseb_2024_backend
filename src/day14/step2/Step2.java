package day14.step2;

public class Step2 {
    public static void main(String[] args) {

        //인터페이스 타입의 변수 선언
        StepInterface si;

        //인터페이스는 스스로 객체/인스턴스를 생성불가능
        //구현을 안한 메소드가 있으니까 --> 추상메소드
        //구현을 해준 [implement]를 해준 클래스가 필요하다.
        //[implement]한 클래스로 객체 생성한다. -->구현(객)체
        //new implementClass(); //<-----(인터페이스를 구현된 클래스의) 객체
        si=new ImplementClass();

        si.method1(3);          //ImplementClass.method1
        si.method2("JAVA");     //ImplementClass.method2
        si.method3(4);          //StepInterface.method2
        si.method4("JAVA");     //StepInterface.method4
        //si.method5(5);           //정적메소드는 객체가 필요없다. 따라서 그냥 출력
        //si.method6("JAVA");      //정적메소드는 객체가 필요없다. 따라서 그냥 출력

        StepInterface.method5(5);
        StepInterface.method6("JAVA");


        //si.method7(6); //private 이므로 외부 클래스로부터 사용불가
        //si.method8("JAVA");//private 이므로 외부 클래스로부터 사용불가

        //si.method9(7);//private 이므로 외부 클래스로부터 사용불가
        //si.method10("JAVA");//private 이므로 외부 클래스로부터 사용불가

        System.out.println(StepInterface.value);


    }

}
