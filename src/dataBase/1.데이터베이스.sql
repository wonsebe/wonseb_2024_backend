/*여러줄 주석*/
# 한줄 주석
-- 한줄주석
/*SQL질의어*/
/*
	1.주의할 점
		sql문장을 입력후;(세미콜론) 마침 , 자바와 비슷
        -문자처리 '' 혹은 ""
        -명령/키워드 에서는 대소문자 구분을 안함, 데이터/자료는 당연히 구분함.
    2. 실행
		-명령어 단위 실행, 전체 실행
        -명령어 단위 실행 : 실행 명령어에 커서 두고 ctrl+엔터,  상단 번개모양의 I 있는
		-전체 명령어 실행 : ctrl+shift+엔터 , 상단 번개모양의 I 없는  
	3. 실행결과
		-하단의 result 창
        -하단에 output 창
	-----------------------------------------------------------------------
    DDL(data Dfinition Language) 데이터 정의어 (생성)
		1.create
			-create database '새로운DB명';             :데이터베이스 생성
		2. drop
			-drop database '삭제할DB명';
				-drop database if exists '삭제할DB명'; :데이터베이스 삭제
                
		-그외
        show
			show databases                           :DBSERVER내 데이터베이스 목록 확인
			show variables like 'datadir';           :DBSERVER내 데이터베이스 local 위치 확인
		use
			use 사용할데이터베이스명						 :DBSERVER내 조작/사용할 데이터베이스 선택
    DML(data Manipulation Language) 데이터 조작어
    
    
    DCL(data Control Language) 데이터 제어어
    
    

*/
# 1. 현재 DB SERVER 존재하는 데이터베이스 확인
show databases;
# 2. 현재 DB SERVER 존재하는 로컬(C:드라이브) 위치 확인
show variables like 'datadir';  #C:\ProgramData\MySQL\MySQL Server 8.0\Data\ [숨김폴더]

# 3. 현재 DB SERVER내 데이터베이스 생성
create database myDB;

# 현재 데이터베이스 삭제
drop database mydb;
# 4-2 만약에 해당 데이터베이스 존재하면 삭제
drop database if exists mydb;

# 5. DB SERVER 에는 여러개의 데이터베이스 존재
use mydb;



drop database if exists test2;
create database test2;

show databases;
show variables like 'datadir'; 
use test2;















