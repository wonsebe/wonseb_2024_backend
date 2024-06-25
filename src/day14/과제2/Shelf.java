package day14.과제2;

 //책장에 넣은 순서대로 꺼내기

import java.util.ArrayList;

public class Shelf { //선반
    //protected는 같은 패키지에 있는 것들만 할 수있다.
    protected ArrayList<String> shelf; //자료를 순서대로 저장할 배열 선언 이름저장:String

    public Shelf(){
    this.shelf=new ArrayList<>();

    }
    public ArrayList<String> getShelf(){
        return this. shelf;
    }//저장되어 있는 배열을 반환
    public int getCount(){
        return this. shelf.size(); //길이

    }//저장되어 있는 배열의요소개수를  반환
}
//add:리스트에 요소를 추가하는 함수
//size: 리스트에 요소들의 총 개수 vs length
//remove(인덱스): 리스트내 요소들의 총 개수 반환 함수

