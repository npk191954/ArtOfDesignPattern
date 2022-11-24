package com.designpattern.art.prototype.pattern.shallow.clone;

// 具体地址类：具体克隆原型成员类
public class Address {
    private String province;
    private String city;
    private String street;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
