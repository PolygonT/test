package com.domain;

public class Boy extends Person{
    private String detail;
    private String grade;

    public Boy() {
    }

    public Boy(String detail, String grade) {
        this.detail = detail;
        this.grade = grade;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "boy{" +
                "detail='" + detail + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
