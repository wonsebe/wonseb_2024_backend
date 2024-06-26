package day15.step3_MVC;

import java.util.ArrayList;

public class Controller {
    static Controller controller =new Controller();
    //2. 등록제어 함수 , 매개변수 :저장할 값 String, 리턴 : 등록성공여부 boolean
    public boolean signupC(String name){
        System.out.println("Controller.signupC");
        boolean result=Dao.dao.signupC(name);
        return result;
    }
    //3.출력제어 함수 , 매개변수 : x, 리턴: 회원목록 ArrayList<String>
    public ArrayList<String> printC(){
        System.out.println("Controller.printC");
        ArrayList<String>result= Dao.dao.printC();
        return  result;
    }
    //3.수정제어 함수, 매개변수 : 기존이름 String, 새로운 이름 String ,리턴 성공여부 :boolean
    public boolean updateC(String oldName, String newName){
        System.out.println("Controller.updateC");
        boolean result=Dao.dao.updateC(oldName,newName);
        return result;
    }

    //5.삭제제어 함수,  매개변수 : 삭제할이름 String, 리턴: 삭제성공여부: boolean
    public boolean deleteC(String name){
        System.out.println("Controller.deleteC");
        boolean result=Dao.dao.deleteC(name);
        return result;
    }

}
