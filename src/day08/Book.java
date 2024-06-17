package day08;

public class Book {

    //1. 멤버변수/필드
    private String bookname;
    private String author;
    //2. 생성자:오른쪽 클릭-> 생성->생성자
    public Book(){}

    public Book(String bookname, String author) {
        this.bookname = bookname;
        this.author = author;
    }
    //3. 메소드
        //1. 일반함수
    public void showBookInfo() {
        System.out.println(this.bookname + ","+ this.author);
    }
        //2. getter and setter

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
