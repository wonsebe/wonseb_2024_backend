    drop database if exists day06;
    create database day06;
    use day06;

    #1.회원테이블
    drop table if exists member;
    create table member( #아이디, 비밀번호, 이름, 연락처,가입일 ,회원번호 (pk,ai)
        mid varchar(20) not null unique,
        pmwd varchar(30) not null,
        mname varchar(20) not null,
        mphone varchar(15) not null,
        mdate datetime default now(),
        mno int auto_increment,
        primary key(mno)
    );
    select *from member;

    #2.게시물테이블
    drop table if exists board;
    create table board( #글제목,글내용,글작성일,글작성자,글조회수
        btitle varchar(100) not null,
        bcontant longtext,
        bdate datetime default now(),
        bview smallint default 0, #조회수 0부터 시작
        mno int,
        bno int auto_increment,
        primary key(bno),
        foreign key(mno) references member(mno)
    );
    select *from board;
    #3.댓글테이블
    drop table if exists replay;
    create table replay(#댓글내용,댓글작성일,댓글작성자
        rcontant varchar(200) not null,
        rdate datetime default now(),
        mno int,
        bno int,
        rno int auto_increment,
        primary key (rno),
        foreign key(mno) references member(mno),
        foreign key(bno) references board(bno)
    );
    select *from replay;


    #ERR 다이어그램 확인
    #샘플 데이터 등록
    #회원 5명
    insert into member(mid,pmwd,mname,mphone) values('gs00','0018','유재석','010-0000-0000');
    insert into member(mid,pmwd,mname,mphone) values('dy00','9797','신동엽','010-3432-0000');
    insert into member(mid,pmwd,mname,mphone) values('hd00','5767','강호동','010-3436-0000');
    insert into member(mid,pmwd,mname,mphone) values('sb00','5545','원세빈','010-8664-0000');
    insert into member(mid,pmwd,mname,mphone) values('kn00','3453','원카니','010-7788-0000');

  # 게시물 5개
    insert into board(btitle,bcontant,mno) values('제목: 하하하.1','내용: 오늘은.1',1);
    insert into board(btitle,bcontant,mno) values('제목: 키키키.2','내용: 내일은.2',2);
    insert into board(btitle,bcontant,mno) values('제목: 토토톹.3','내용: 과거는.3',3);
    insert into board(btitle,bcontant,mno) values('제목: 피히히.4','내용: 나는.4',4);
    insert into board(btitle,bcontant,mno) values('제목: 게게게.5','내용: 아냐.5',5);


   #댓글 5개 foreignkey를 입력해줘야함(그래야 식별 가능)
    insert into replay(rcontant,mno,bno) values('재밋다1',1,1);
    insert into replay(rcontant,mno,bno) values('오오1',5,1);
    insert into replay(rcontant,mno,bno) values('아니근데3',2,3);
    insert into replay(rcontant,mno,bno) values('별로4',1,4);
    insert into replay(rcontant,mno,bno) values('우울해5',3,1); # 1번 게시물에 3번이( 강호동) 댓글을 닮.



