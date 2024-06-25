package day14.과제2;

import java.util.ArrayList;

public class BookShelf extends  Shelf implements  Queue{
    //Shelf 클래스가 가지고 있는 배열을 사용해 Queue인터페이스에서 선언한 메서드를 구현한다

    @Override
    public void enQueue(String title) {
        shelf.add(title);
    } //배열의 요소를 추가하는 메소드를 제정의함

    @Override
    public String deQueue() {
        return shelf.remove(0);
    } //맨 처음 요소를 배열에서 삭제하고 반환

    @Override
    public int getSize() {
        return super.getCount();
    }//배열 요소 개수 반환
}
