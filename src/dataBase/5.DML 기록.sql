#데이터베이스 생성
drop database if exists day04; #day04 존재하면 삭제
create database day04;#day04 만들기
use day04; #day04 사용

#테이블 생성
drop table if exists table1; #table1 삭제
create table table1(
mno int,
mname varchar(30) not null unique
); #table1의 속제목 만들기

#DML : 조작어
#1. INSERT 2. SELECT 3. UPDATE  4. DELETE
#-   (C)       (R)       (U)        (D)

/*
[1] INSERT :레코드(행,튜플,가로 단위) 삽입
	1.모든 필드에 값 대입insert into 테이블명 values(값1,값2,값3 ~~~~);
    2. insert into(필드명, 필드명) values(값1,값2);
	3. 여러개의 레코드 삽입 : insert into(필드명,필드명) values (값1,값2), (값1,값2), (값1,값2);
    
[2] SELECT : 레코드(행,튜플,가로단위) 조회/검색/찾기
	1.select * from 테이블명;                  *:모든 필드를 조회하는 전체 레코드 검색
    2. 특정필드 조회: select 필드명1 , 필드명2 from 테이블명;
    3.레코드 조건 조회 : select 필드명1, 필드명2 from 테이블명 where 조건절
    
[3] UPDATE :레코드(행,튜플,가로단위)의 필드 값 수정
	1. 특정필드의 전체 값 수정: update 테이블명 set 수정할필드명= 새로운값;
	2. 특정 필드의 조건에 따른 값 수정 :update 테이블명 set 수정할필드명= 새로운값 where 조건절;
    
[4] DELETE : 레코드(행,튜플,가로단위) 삭제
	1.전체 레코드 삭제: delete from 테이블명; vs  DDL: truncate table 테이블명;
    2. 특정 조건에 따른 레코드 삭제: delete from 테이블명 where 조건절
*/













#[1] INSERT :레코드(행,튜플,가로 단위) 삽입
#모든 필드에 값 대입insert into 테이블명 values(값1,값2,값3 ~~~~);
insert into table1 values(1, '박명수');

#특정 필드에 값 대입
#2. insert into(필드명, 필드명) values(값1,값2);
insert into table1(mno,mname)values(2,'유재석');
insert into table1(mname,mno)values('신동엽',3);
insert into table1(mname)values('서장훈');
#필드 순으로 값을 입력해야 함 !

#3. 여러개의 레코드 삽입 : insert into(필드명,필드명)values(값1,값2),(값1,값2),(값1,값2);
insert into table1 values(4,'강호동'),(5,'김희철');


#---확인
select *from table1;


#[2] SELECT : 레코드(행,튜플,가로단위) 조회/검색/찾기
#1.select *(와일드카드) from 테이블명;              # *:모든 필드를 조회하는 전체 레코드 검색
select *from table1;

#2. 특정필드 조회: select 필드명1 , 필드명2 from 테이블명;
select mno from table1;
select mname from table1;
select mname,mno from table1;

#3.레코드 조건 조회 : select 필드명1, 필드명2 from 테이블명 where 조건절
select * from table1 where mname='유재석';              # = 같다. (java,js 처럼 =대입이 아니다)
	#테이블 내 mname 필드내 '유재석'인 데이터의 레코드 검색


#[3] UPDATE :레코드(행,튜플,가로단위)의 필드 값 수정
#1. 특정필드의 전체 값 수정: update 테이블명 set 수정할필드명= 새로운값;
update table1 set mno=10;   #테이블의 mno 필드를 10으로 수정 #오류 발생 (safe mode 해제)
#2. 특정 필드의 조건에 따른 값 수정 
update table1 set mno=3 where mname = '유재석';
		#테이블의 mname 필드내 '유재석'인 레코드의 mno 필드 값을 3으로 수정
        
update table1 set mname = '유재석B' where mno=3;
		#테이블의 mno 필드가 3인 레코드의 mname 필드값을 '유재석B'으로 수정
 
select *from table1;


#[4] DELETE : 레코드(행,튜플,가로단위) 삭제
#2. 특정 조건에 따른 레코드 삭제: delete from 테이블명 where 조건절
delete from table1 where mno=3;          #만약에 테이블에 mno필드가 3인 레코를 삭제
delete from table1 where mname='강호동';   #테이블의 mname 필드가 '강호동'인 레코드를 삭제
#1.전체 레코드 삭제: delete from 테이블명;
delete from table1;						 #전체 레코드 삭제 ( 레코드 하나씩 처리 -> 느리다, 복구(취소) 가능 )
		#vs
truncate table table1;                   #전체 레코드 삭제 ( 빠르다, 복구(취소)불가능 )

#수정, 삭제
#update, delete workbench 에서 기본적으로 차단,, safe mode
#safe mode 끄기
SET SQL_SAFE_UPDATES=0;      # sate mode: 0; 해제, 1: 사용



#삽입(문제1)
insert into employees(employees_id,first_name,last_name ,email,hire_date,job_id) 
values(101, 'john','Doe','johndoe@example.com','2024-06-24','IT_PROG');

#문제2
insert into products (product_id,product_name,category,price,stock_quantity) values(201,'Wireless Mouse','Electronics',29.99,150);

#문제3 모든 직원  first_name과 email 조회
select first_name,email from employees;

#문제4 products 테이블에서 price가 1000 인 제품의 product_name과 price를 조회하세요.
select product_name, price를 from products where price가=1000; 

#문제5: employees 테이블에서 employee_id가 101인 직원의 email을 'john.doe@company.com'으로 업데이트하세요.
update employees set email = 'john.doe@company.com' where employee_id= 101;

#문제6: products 테이블에서 product_id가 201인 제품의 price를 24.99로 업데이트하세요.
update products set price를 = 24.99 where product_id= 201;

#문제7: employees 테이블에서 employee_id가 101인 직원을 삭제하세요
delete from employees where  employee_id= 101;

#문제8: products 테이블에서 product_id가 201인 제품을 삭제하세요.
delete from products where  product_id= 201;





















