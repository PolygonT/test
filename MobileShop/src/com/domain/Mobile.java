package com.domain;

public class Mobile {
    private String mobile_version;
    private String mobile_name;
    private String mobile_made;
    private Double mobile_price;
    private String mobile_mess;
    private String mobile_pic;//存储图片路径
    private Integer id;

    public String getMobile_version() {
        return mobile_version;
    }

    public void setMobile_version(String mobile_version) {
        this.mobile_version = mobile_version;
    }

    public String getMobile_name() {
        return mobile_name;
    }

    public void setMobile_name(String mobile_name) {
        this.mobile_name = mobile_name;
    }

    public String getMobile_made() {
        return mobile_made;
    }

    public void setMobile_made(String mobile_made) {
        this.mobile_made = mobile_made;
    }

    public Double getMobile_price() {
        return mobile_price;
    }

    public void setMobile_price(Double mobile_price) {
        this.mobile_price = mobile_price;
    }

    public String getMobile_mess() {
        return mobile_mess;
    }

    public void setMobile_mess(String mobile_mess) {
        this.mobile_mess = mobile_mess;
    }

    public String getMobile_pic() {
        return mobile_pic;
    }

    public void setMobile_pic(String mobile_pic) {
        this.mobile_pic = mobile_pic;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "mobile_version='" + mobile_version + '\'' +
                '}';
    }
}
