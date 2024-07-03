package project.controller;

import day16.controller.BoardController;
import project.model.ProductDao;
import project.model.ProductDto;


import java.util.Random;

public class ProductController {

  //싱글톤 생성
  private static ProductController productController = new ProductController();

  //2.해당 클래스의 생성자를 private 한다. 다른 클래스로부터  new 사용하지 못하게 차단하기
  private ProductController() {
  }
  //3. 해당 객체(싱글톤)를 외부로부터 접근할 수 있도록 간접(추후에 유효성검사) 호출 메소드

  public static ProductController getInstance() {
    return productController;

  }



  // 1. 구매
  public boolean 구매(int game_date){

    // 1. 랜덤으로 구매할 제품 선택
      pNum = new Random().nextInt(10) + 1;
    System.out.println("제품번호 : "+pNum+" 구매 했습니다.");

      // 재고확인
    int result = 개별재고확인(  pNum );
    System.out.println( result );

    if( result <= 0) {
      System.out.println("재고 부족 ");
      return false;
    }

    // 2. 랜덤으로 구매수량
    int pCount = new Random().nextInt(11); // 0 ~ 10( 선택한 제품의 재고 수량 )
    System.out.println("구매수량 : "+ pCount +"입니다.");

    ProductDao.getInstance().구매();

    return true;
  }

  public int 개별재고확인( int pNum ){
    return ProductDao.getInstance().개별재고확인( pNum );
  }

}
