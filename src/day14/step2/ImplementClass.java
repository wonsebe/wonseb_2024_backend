package day14.step2;
//implements:구현하다
public class ImplementClass implements StepInterface {

    @Override
    public void method1(int a) {
        System.out.println("ImplementClass.method1");
    }

    @Override
    public int method2(String a) {
        System.out.println("ImplementClass.method2");
        return 5;
    }

    @Override
    public void method3(int a) {
        StepInterface.super.method3(a);
    }

    @Override
    public int method4(String a) {
        return StepInterface.super.method4(a);
    }
}
