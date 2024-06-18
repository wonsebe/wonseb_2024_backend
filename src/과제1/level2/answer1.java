package 과제1.level2;
import java.util.Scanner;

public class answer1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(">>Level2_1 answer >>");
        while( true ) {
            System.out.print(" 음악 재생 중 종료버튼[x] : ");
            char btn = scanner.next().charAt(0);
            if(btn == 'x'){
                System.out.println(">>음악종료");
                break;

            }
        }
    }
}