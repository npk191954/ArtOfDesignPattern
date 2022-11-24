package com.designpattern.art.prototype.pattern.shallow.clone;

public class Client {
    public static void main(String[] args) {
        Customer customer;
        Address address;

        customer = new Customer("张无忌");
        address = new Address();
        address.setProvince("省份一");
        address.setCity("城市一");
        address.setStreet("街道一");
        customer.setAddress(address);
        System.out.println(customer.getName() + "的地址：" + customer.getAddress().getProvince()
                + customer.getAddress().getCity() + customer.getAddress().getStreet());

        Customer customer2;
        customer2 = customer.clone();
        System.out.println(customer2.getName() + "的地址：" + customer2.getAddress().getProvince()
                + customer2.getAddress().getCity() + customer2.getAddress().getStreet());
    }
}
