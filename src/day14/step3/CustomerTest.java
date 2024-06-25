package day14.step3;

public class CustomerTest {
    public static void main(String[] args) {
        //객체 선언
        Customer customer =new Customer();

        //customer타입이 Buy타입 변환 (자동타입 변환 가능)
        Buy buyer=customer;
        buyer.buy();
        buyer.order();
        //customer타입이 Sell타입 변환 ( 자동타입 변환 가능)
        Sell seller =customer;
        seller.sell();
        seller.order();


        if(seller instanceof  Customer){ //seller타입이 Customer 타입에 포함 됨.
            Customer customer2=(Customer) seller;
            customer2.buy();
            customer2.sell();

        }
        customer.order();
    }
}
