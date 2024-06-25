package day14.과제;

class Car{
    Tire tire;
    public void run(){
        this.tire.roll();
    }

}
interface Tire{
    void roll(); //추상화된 메소드
}
class  HankookTire implements  Tire{
    @Override
    public void roll() {
        System.out.println("한국 타이어가 회전합니다");
    }
}
class KumhoTire implements  Tire{
    @Override
    public void roll() {
        System.out.println("금호 타이어가 회전합니다");
    }
}

public class Step4 {

    public static void main(String[] args) {
        Car mycar =new Car();
        //myCar.run();//아무것도 들어있지 않아 오류
        Car yourcar=new Car();

        //yourCar.tire=new Tire(); //추상화된 메소드만 들어있음
         //yourCar.run();//아무것도 안들어있음

        mycar.tire =new HankookTire();
        mycar.run();
        //yourCar.run();

        mycar.tire =new KumhoTire();
        mycar.run();
        //yourCar.run();

        System.out.println(mycar.tire instanceof KumhoTire);
        if(mycar.tire instanceof Tire){
            mycar.tire = new HankookTire();
        }
        mycar.run();
    }

}
