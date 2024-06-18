package day09;

public class taxi {

    String taxiNumber;
    int passengerCount;
    int money;

    public taxi(String taxiNumber){
        this.taxiNumber=taxiNumber;

    }
    public void take(int money){
        this.money+=money;
        passengerCount++;

    }

    @Override
    public String toString() {
        return "taxi{" +
                "taxiNumber='" + taxiNumber + '\'' +
                ", passengerCount=" + passengerCount +
                ", money=" + money +
                '}';
    }
}
