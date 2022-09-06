package com.designpattern.art.prototype.pattern.deep.clone;

public class Client {
    public static void main(String[] args) {
        ConcreteCustomer concreteCustomer;
        CustomerAddress customerAddress;

        customerAddress = new CustomerAddress();
        customerAddress.setProvince("省份二");
        customerAddress.setCity("城市二");
        customerAddress.setStreet("街道二");
        concreteCustomer = new ConcreteCustomer("张无忌");
        concreteCustomer.setCustomerAddress(customerAddress);
        System.out.println(concreteCustomer.getName() + "的地址："
                + concreteCustomer.getCustomerAddress().getProvince()
                + concreteCustomer.getCustomerAddress().getCity()
                + concreteCustomer.getCustomerAddress().getStreet());

        ConcreteCustomer concreteCustomer2 = (ConcreteCustomer)concreteCustomer.deepClone();
        System.out.println(concreteCustomer2.getName() + "的地址："
                + concreteCustomer2.getCustomerAddress().getProvince()
                + concreteCustomer2.getCustomerAddress().getCity()
                + concreteCustomer2.getCustomerAddress().getStreet());
    }
}
