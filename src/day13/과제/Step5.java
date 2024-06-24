package day13.과제;

class Car{
    Tire tire;
    public void run(){this.tire.roll();}
}
class Tire{
    public  void roll(){
        System.out.println("일반 타이어가 회전합니다.");
    }
}
class HankoolTire extends  Tire{ //HankoolTire가 Tire의 자식
    @Override
    public void roll() {
        System.out.println("한국 타이어가 회전합니다.");
    }
}
class KumhoTire extends  Tire{
    @Override
    public void roll() {
        System.out.println("금호 타이어가 회전합니다");
    }
}


public class Step5 {
    public static void main(String[] args) {
        Car mycar=new Car(); //객체생성
        Car yourCar =new Car();
        yourCar.tire= new Tire();

        yourCar.run();

        mycar.tire=new HankoolTire();
        mycar.run(); //HankoolTire가 Tire 의 자식이기 때문에 overide 에 의해 자식이 우선

        mycar.tire=new KumhoTire();
        mycar.run();
        yourCar.run();

        System.out.println(mycar.tire instanceof KumhoTire);
        if(mycar.tire instanceof Tire){
            mycar.tire =new HankoolTire();
        }

        mycar.run();
    }

}
