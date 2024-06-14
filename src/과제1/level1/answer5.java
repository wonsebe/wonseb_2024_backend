package 과제1.level1;

public class answer5 {
    public static void main(String[] args) {

        System.out.println(">>Level1_5 answer >>");

        byte byteValue=100;
        short shortValue=byteValue;
        System.out.println("byte -> short : " + shortValue);

        short shortValue1=30000;
        int intValue=shortValue1;
        System.out.println("short -> int : " + intValue);

        int intValue1=2000000000;
        long longValue=intValue1;
        System.out.println("int -> long : " + longValue);

        long longValue1= 40000000000L;
        float floatValue=longValue1;
        System.out.println("long -> float : " + floatValue);

        float floatValue1=3.1231231689453125F;
        double doubleValue=floatValue1;
        System.out.println("float -> double : " + doubleValue);

    }
}
