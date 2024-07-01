package day16.model.dto;
//day16 패키지 안에 model서브패키지 안에 dto패키지 선언
import day16.model.dao.MemberDao;
//day16 패키지 안에 dao패키지 안에 MemberDao클래스를 현재파일에서 사용하겠다는 뜻

public class MemberDto { //이동객체
    //1.멤버변수 <--- DB필드와 동일
    //공개 MemberDto클래스 선언

    private int mno;
    //잠금 정수형 mno 멤버변수 선언

    private String mpwd;
    //잠금 문자열 mpwd 멤버변수 선언

    private String mname;
    //잠금 문자열 mname 멤버변수 선언

    private String mphone;
    //잠금 문자열 mphone 멤버변수 선언

    private String mdate;
    //잠금 문자열 mdate 멤버변수 선언

    private String mid;
    //잠금 문자열 mid 멤버변수 선언

    public MemberDto(){} // 생성자 기본,풀생성자 선언

    public MemberDto(String mid, String mpwd, String mname, String mphone,  String mdate, int mno) {
        // 공개 생성자 MemberDto생성(문자열 mid 문자열 mpwd 문자열 mname 문자열 mphone,문자열 mdate,정수 mno)
        this.mid = mid;
        //클래스 변수 mid에 매개변수 mid값 저장
        this.mpwd = mpwd;
        //클래스 변수 mpwd 매개변수 mpwd값 저장
        this.mname = mname;
        //클래스 변수 mname 매개변수 mname값 저장
        this.mphone = mphone;
        //클래스 변수 mphone 매개변수 mphone값 저장
        this.mdate=mdate;
        //클래스 변수 mdate 매개변수 mdate값 저장
        this.mno = mno;
        //클래스 변수 mno 매개변수 mno값 저장

    }
    //DB테이블의 회원마다 레코드/행 1개이고  레코드/행 1개당 DTO 1개
    //->회원이 여러개이면 --> DTO 여러개 --> arrayList<MemberDto> 사용
    public MemberDto(String mid, String mpwd, String mname, String mphone) {
        // 공개 생성자 MemberDto생성(문자열 mid 문자열 mpwd 문자열 mname 문자열 mphone)
        this.mid = mid;
        //클래스 변수 mid 매개변수 mid값 저장
        this.mphone = mphone;
        //클래스 변수 mphone 매개변수 mphone 값 저장
        this.mname = mname;
        //클래스 변수 mname 매개변수 mname 값 저장
        this.mpwd = mpwd;
        //클래스 변수 mpwd 매개변수 mpwd 값 저장
    }

    @Override //멤버변수 값 확인하려고-출력
    //오버라이드 : 값 재정의
    public String toString() {
        //공개 문자열 toString 생성
        return "MemberDto{" +
                "mno=" + mno +
                ", pmwd='" + mpwd + '\'' +
                ", mname='" + mname + '\'' +
                ", mphone='" + mphone + '\'' +
                ", mdate='" + mdate + '\'' +
                ", mid='" + mid + '\'' +
                '}';//메서드 e
    }// t e


    //멤버변수가 private이기 때문에  변수의 getter , setter 선언
    public int getMno() {
        return mno;
    }
    //공개 정수형 getMno 선언해서 mno 값을 가져옴

    public void setMno(int mno) {
        this.mno = mno;
    }
    //반환하지 않는 공개 setMno 선언해서 매개변수 mno 에 입력받은 값을 멤버변수 mno에 다시저장

    public String getPmwd() {
        return mpwd;
    }
    //공개 문자열 getPmwd 선언해서 mpwd 값을 가져옴

    public void setPmwd(String pmwd) {
        this.mpwd = pmwd;
    }
    //반환하지 않는 공개 setPmwd 선언해서 매개변수 pmwd 에 입력받은 값을 멤버변수 pmwd에 다시저장

    public String getMname() {
        return mname;
    }
    //공개 문자열 getMname 선언해서 mname 값을 가져옴

    public void setMname(String mname) {
        this.mname = mname;
    }
    //반환하지 않는 공개 setMname 선언해서 매개변수 mname 에 입력받은 값을 멤버변수 mname 다시저장

    public String getMphone() {
        return mphone;
    }
    //공개 문자열 getMphone 선언해서 mphone 값을 가져옴
    public void setMphone(String mphone) {
        this.mphone = mphone;
    }
    //반환하지 않는 공개 setMphone 선언해서 매개변수 mphone 에 입력받은 값을 멤버변수 mphone 다시저장
    public String getMdate() {
        return mdate;
    }
    //공개 문자열 getMphone 선언해서 mdate 값을 가져옴

    public void setMdate(String mdate) {
        this.mdate = mdate;
    }
    //반환하지 않는 공개 setMdate 선언해서 매개변수 mdate 에 입력받은 값을 멤버변수 mdate 다시저장

    public String getMid() {
        return mid;
    }
    //공개 문자열 getMid 선언해서 mid 값을 가져옴
    public void setMid(String mid) {
        this.mid = mid;
    }
    //반환하지 않는 공개 setMid 선언해서 매개변수 mid 에 입력받은 값을 멤버변수 mid 다시저장
}
