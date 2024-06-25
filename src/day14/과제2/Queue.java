package day14.과제2;

public interface Queue { //추상 메소드를 선언
    void  enQueue(String title); //입력되는  요소값을 배열 맨 뒤에 추가하는 메소드
    String deQueue(); //배열에서 맨 앞에 있는 요소를 제거, 그 값을 반환 하는 메소드
    int getSize(); //요소 개수를 반환

}


