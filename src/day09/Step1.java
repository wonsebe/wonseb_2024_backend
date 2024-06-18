package day09;

import day09.step1.Student;

public class Step1 {
    public static void main(String[] args) {

        //[1]학생(객체) 2명 생성)
        Student studentJames= new Student("James",5000);
        //Student studentJames2=new Student();

        Student studentTomas= new Student("Tomas", 10000);

        Student studentEdward=new Student("Edward",20000);

        Bus bus100 =new Bus(100);
        studentJames.takeBus(bus100);
        System.out.println(bus100);
        System.out.println(studentJames);


        Subway subwayGreen=new Subway("2호선");
        studentTomas.takeSubway(subwayGreen);
        System.out.println(studentTomas);
        System.out.println(subwayGreen);

        taxi tt= new taxi("56호 8979");
        studentEdward.taketaxi(tt);
        System.out.println(studentEdward);
        System.out.println(tt);
    }
}
