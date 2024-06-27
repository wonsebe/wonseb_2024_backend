package day16.model.dto;

import day16.model.dao.MemberDao;

public class MemberDto { //이동객체
    //1.멤버변수 <--- DB필드와 동일

    private int mno;
    private String pmwd;
    private String mname;
    private String mphone;
    private String mdate;
    private String mid;

    public MemberDto(){}

    public MemberDto(String mid, String pmwd, String mname, String mphone,  String mdate, int mno) {
        this.mid = mid;
        this.pmwd = pmwd;
        this.mname = mname;
        this.mphone = mphone;
        this.mdate=mdate;
        this.mno = mno;

    }

    public MemberDto(String mid, String pmwd, String mname, String mphone) {
        this.mid = mid;
        this.mphone = mphone;
        this.mname = mname;
        this.pmwd = pmwd;
    }

    @Override //멤버변수 값 확인하려고-출력
    public String toString() {
        return "MemberDto{" +
                "mno=" + mno +
                ", pmwd='" + pmwd + '\'' +
                ", mname='" + mname + '\'' +
                ", mphone='" + mphone + '\'' +
                ", mdate='" + mdate + '\'' +
                ", mid='" + mid + '\'' +
                '}';
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public String getPmwd() {
        return pmwd;
    }

    public void setPmwd(String pmwd) {
        this.pmwd = pmwd;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate) {
        this.mdate = mdate;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }
}
