package com.designpattern.art.prototype.pattern.shallow.clone;

// 具体顾客类：具体原型类
public class Customer implements Cloneable {
    private String name;
    private Address address;

    public Customer(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public Customer clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("Not support cloneable");
        }
        return (Customer) object;
    }
}
