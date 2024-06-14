package day07.step2;

public class Step2 {
    public static void main(String[] args) {


        Student studentLee= new Student(); //인스턴스 선언
        //studentLee.studentName="이상원";
       // studentLee.setStudenName("이상원"); -직접

        studentLee.grade=3;

       // System.out.println(studentLee.studentName);
        System.out.println(studentLee.getStudentName()); //-간접
        //System.out.println("studentLee= "+ studentLee);
    }
}
