package day14.step1;

public class CompleteCalc extends Calculator{

    @Override
    public int times(int num1, int num2) {
        return super.times(num1, num2);
    }

    @Override
    public int divide(int num1, int num2) {
        return super.divide(num1, num2);
    }

    public void showInfo(){
        System.out.println("Calc 인터페이스를 구현하였습니다.");
    }

    @Override
    public void description() {
        super.description();
    }
}
