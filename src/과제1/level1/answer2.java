package 과제1.level1;

public class answer2 {

    public static void main(String[] args) {
        System.out.println(">>Level1_2 answer >>");
        System.out.println(">>answer time: 2022-09-20T01:59:37.892550200 >>");
        System.out.println("type              value               range");
        System.out.println("-------------------------------------------");

        boolean a= true;
        byte b=100;
        char c ='A';
        short d=30000;
        int e=2000000000;
        long f=   40000000000L;
        float i= 3.1231232F;
        double j=3.123123123;

        System.out.printf("boolean: %s                 true or false  \n" ,a);
        System.out.printf("byte:  %d                       -128 ~ 127  \n",b );
        System.out.printf("char: %c                0~65535[ chapter  1]\n",c );
        System.out.printf("short: %d                  -32768 ~32767\n" ,d );
        System.out.printf("int: %d               -+2000 millon\n" ,e);
        System.out.printf("long: %d      -+2000 millon Excess\n" ,f );
        System.out.printf("float: %.3f            8 decimal places\n" ,i );
        System.out.printf("double: %.8f         17 decimal places\n" ,j );
    }
}
