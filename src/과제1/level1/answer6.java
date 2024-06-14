package 과제1.level1;

public class answer6 {

    public static void main(String[] args) {
        System.out.println(">>Level1_6 answer >>");

        short shortValue2= 48;
        byte byteValue2= (byte)shortValue2;
        System.out.println("byte <-short :" + byteValue2);

        int intValue2= -27648;
        short shortValue3= (short)intValue2;
        System.out.println("short <-int :" + shortValue3);

        long lValue2= 1345294336;
        int intValue3= (int)lValue2;
        System.out.println("int <-long :" + intValue3);

        float fValue2= 3;
        long lValue3= (long)fValue2;
        System.out.println("long <-float :" + lValue3);

        double dValue2= 3.1231232;
        float fValue3= (float)dValue2;
        System.out.println("float <-double :" + fValue3);
    }
}
