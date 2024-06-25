package day14.과제2;

public class BookShelfTest {

    public static void main(String[] args) {

        Queue shelfQueue =new BookShelf(); // Queue 타입안에  shelfQueue를 생성해  BookShelf() 메서드 대입

        shelfQueue.enQueue("태백산맥 1"); //책을 차례대로 넣음
        shelfQueue.enQueue("태백산맥 2");
        shelfQueue.enQueue("태백산맥 3");

        System.out.println(shelfQueue.deQueue()); //먼저 들어온 것부터 꺼내는 출력문 생성
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
    }
}
