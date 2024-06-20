package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Step1 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        ArrayList<CategoryRow> categoryTable=new ArrayList<>();
        //메모리설계 셈플
        CategoryRow c1= new CategoryRow(); //객체

        c1.setCategoryCode(1);
        c1.setCategoryName("커피");

        CategoryRow c2= new CategoryRow();
        c2.setCategoryCode(2);
        c2.setCategoryName("스무디");

        CategoryRow c3= new CategoryRow();
        c3.setCategoryCode(3);
        c3.setCategoryName("에이드");

        categoryTable.add(c1);
        categoryTable.add(c2);
        categoryTable.add(c3);

        ArrayList<MenuRow> menuTable= new ArrayList<>();
        MenuRow m1= new MenuRow( 1, 1, 1000,"아메리카노");
        MenuRow m2= new MenuRow( 2,1 ,2000 ,"라떼");
        MenuRow m3= new MenuRow( 3,3 ,3000 ,"청포도에이드");

        menuTable.add(m1);
        menuTable.add(m2);
        menuTable.add(m3);

        ArrayList<OrderRow> orderTable =new ArrayList<>();
        OrderRow o1= new OrderRow(1,"2024-06-20");
        OrderRow o2= new OrderRow(2,"2024-06-19");
        OrderRow o3= new OrderRow(3,"2024-06-18");

        orderTable.add(o1);
        orderTable.add(o2);
        orderTable.add(o3);

        ArrayList<OrderInfoRow>orderInfoTable=new ArrayList<>();
        OrderInfoRow i1= new OrderInfoRow(1, 5,1,1);
        OrderInfoRow i2= new OrderInfoRow(2, 2,2,1);
        OrderInfoRow i3= new OrderInfoRow(4, 1,3,3);

        orderInfoTable.add(i1);
        orderInfoTable.add(i2);
        orderInfoTable.add(i3);

        System.out.println(categoryTable);
        System.out.println(menuTable);
        System.out.println(orderTable);
        System.out.println(orderInfoTable);

        // 기능 구현
        while(true){
            System.out.println(" ===== ADMIN MENU ===== ");
            System.out.println("1.Category Add");   System.out.println("2.Category List");
            System.out.println("3.Product Add");    System.out.println("4.Product List");
            System.out.println("5.Cart Add");      System.out.println("6.Cart List");
            System.out.println("7.Order Add");      System.out.println("8.Order List");
            System.out.print("Menu choose : ");     int ch = scan.nextInt();
            if( ch == 1 ){}
            else if ( ch == 2 ){}
            else if ( ch == 3 ){}
            else if ( ch == 4 ){}
            else if ( ch == 5 ){}
            else if ( ch == 6 ){}
            else if ( ch == 7 ){}
            else if ( ch == 8 ){}
            else {}
        } // w end









    }
}
