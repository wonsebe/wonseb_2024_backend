package day12.step2;

public class Step2 {

    public static void main(String[] args) {
        Car car=new Car();
        car.speedUp();//함수호출
        car.speedUp();
        System.out.println("car :"+car.speed); //2

        SportCar sportCar=new SportCar();
        sportCar.speedUp();
        System.out.println("SportCar:"+sportCar.speed); //1

        Car car2=new Car();
        car2.speedUp();
        System.out.println("car2 :"+car2.speed);//1

    }
}
