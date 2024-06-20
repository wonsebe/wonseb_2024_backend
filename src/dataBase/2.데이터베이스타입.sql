
/*
   - MYSQL 데이터 타입
   [ 정수 ] 
      1. TINYINT      1바이트    -128 ~ +127
        2. SMALLINT      2바이트    +-3만정도 
        3. MEDIUMINT   3바이트   +-800만정도
      4. *INT         4바이트   +-20억정도 
        5. BIGINT      8바이트    +-20억이상 
   [ 실수 : 부동소수점 , 오차발생  ]
      1. FLOAT      4바이트
        2. DOUBLE       8바이트 
   [ 문자형태로 저장되는 숫자 , 오차없는 실수 표현 ]
      1. DECIMAL      : 실수를 오차 없이 표현할때 사용 
   [ 날짜 ]
      1. DATE         : 날짜만 1000년 ~ 9999년  
        2. DATETIME      : 날짜와 시간 표현       
   [ 문자 ] 
      1. * CHAR(문자길이)      : 고정길이 , 1~255 문자
         CHAR(5)          유재석  -->  [유] [재] [석] [ ] [ ] 
        2. * VARCHAR(문자길이)   : 가변길이 , 1~255 문자
         VARCHAR(5)         유재석  -->  [유] [재] [석] [ ] [ ] -> [유] [재] [석]
        3. TEXT               : 최대길이 6만개 글자 표현
        4. LONGTEXT            : 최대길이 42억개 글자 표현 (4gb)
   [ 논리 ] 
      1. BOOL               : true , false 
      
      */
      
      
    use mydb;
    
    
    
    
    
    
    #[예]
    drop database if exists sqlweb1;
    create database sqlweb1;
    use sqlweb1;
    drop table if exists member;
    create table member(id varchar(20), password varchar(20), age int, joindate date);
    show tables;
    select *from member; #테이블 값확인
    
    #[예2]
    drop table if exists board;
    create table board(
    bno int,     -- 번호(정수)
    title varchar(100), -- 제목(최대100글자)
    content longtext , -- 내용(정수)
    view int, -- 조회수 (정수)
    date datetime -- 작성일(날짜와 시간)
    );
    show tables;
    select * from board;
    #[예3]
    drop table if exists student;
    create table student(
    
		정수1  tinyint,
        정수2 smallint,
        정수3 mediumint,
        정수4 int,
        정수5 bigint,
        
        실수1 float,
        실수2 double,
        실수3 decimal,
        
        날짜 date,
        날짜시간 datetime,
        
        문자열1 char(100),
        문자열2 varchar(100),
        문자열3 text,
        문자열4 longtext,
        
        논리 bool
    
    
    );
    show tables;
    select *from student;
    
    
    #[실습]
		/*
        
			-키오스크 개발의 메모리 설계
				[요구사항]
					1. 여러개 카테고리중에 카테고리를 선택을 해서 카테고리 별로 제품들을 출력/확인
					2. 해당 제품을 선택해서 수량 입력받아 주문처리  -단)하나의 주문의 여러개 제품을 주문할수있다.
                    3.주문번호를 받아서 대기한다.
                    
				[메모리 설계 필수 속성]
					각 식별자코드, 카테고리명, 가격, 제품명, 주문수량 , 주문날짜
                    
                    
			-SQL 생성  
        
        
        */
		
    
    
    #[실습]
    drop table if exists categoryTable; #카테고리테이블
    drop table if exists menuTable; #메뉴테이블
    drop table if exists orderTable; #주문테이블
    drop table if exists orderInfoTable; #주문상세테이블
    
    create table categoryTable( categoryCode  , categoryName ); #카테고리코드,카테고리이름
	create table menuTable(menuCode , categoryCode,  menuName , menuPrice ,  );#메뉴코드,카테고리코드 , 메뉴이름, 메뉴가격
    create table orderTable(orderCode, orderDate);#주문코드,주문날짜 
    create table orderInfoTable(orderInfoCode, orderAmount,menuCode, orderCode) #주문상세코드, 수량코드, 메뉴코드, 주문코드
    
    show tables;
    select *from categoryTable;
    select *from menuTable;
    select *from orderTable;
    select *from orderInfoTable;

    
    
    
    
    
    
    
    
    
    
    
    
      
      
      
      