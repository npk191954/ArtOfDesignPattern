package com.designpattern.art.prototype.pattern.deep.clone;

import java.io.*;

// 具体顾客类：具体原型类
public class ConcreteCustomer extends CustomerPrototype {
    private String name;
    private CustomerAddress customerAddress;

    public ConcreteCustomer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerAddress getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(CustomerAddress customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public CustomerPrototype deepClone() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            try {
                return (CustomerPrototype) ois.readObject();
            } catch (ClassNotFoundException e) {
                return null;
            }
        } catch (IOException e) {
            return null;
        }
    }
}
