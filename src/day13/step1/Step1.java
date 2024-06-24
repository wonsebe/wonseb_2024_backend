package day13.step1;

import java.util.ArrayList;

class 동물{
    String myName; //멤버변수
    동물 (){myName="동물";}//생성자
    void showMe(){
        System.out.println("myName: "+myName);}//메소드
}
class 조류 extends 동물{
    조류(){ myName="조류";}
}
class  참새 extends  조류{
    참새(){myName="참새";}
}
public class Step1 {

    public static void main(String[] args) {
    동물 animal =new 동물();//객체 생성
    animal.showMe();
    조류 bird=new 조류(); //myName 을 상속받아 사용하기 때문에 조류가 됨
    bird.showMe();
    참새 sparrow=new 참새();
    sparrow.showMe();//myName 을 상속받아 사용하기 때문에 참새가 됨 (자식이 우선적임 -부모는 묻힘)

    //자동타입변환
    //-자식타입은 부모타입으로 변환 가능
    동물 bird2=new 조류();    bird2.showMe();        //부모<자식
    동물 sparrow2=new 참새();    sparrow2.showMe();

    //강제타입변환
    //-부모 타입은 자식타입으로 변환 불가능, 단 상속관계이면 가능, 상하관계만 가능(형제는 불가능)
//    조류 bird3=new 동물();
//    참새 sparrow3=new 조류();

        //부모타입으로 배열/리스트를 선언하면 해당 배열/리스트에는 부모타입 포함 자식타입도 저장이 가능하다.
        ArrayList<동물> 동물사전= new ArrayList<>();
        동물사전.add(animal); 동물사전.add(bird); 동물사전.add(sparrow);

        //부모타입으로 배열/리스트를 선언하면 해당 배열/리스트에는 본인타입 포함 하위타입도 저장이 가능하다. 상위타입은 불가.
        ArrayList<조류> 조류사전 =new ArrayList<>();
        //조류사전.add(animal); //자식타입에 부모타입을 넣어 오류
        조류사전.add(bird); 조류사전.add(sparrow);









    }
}
