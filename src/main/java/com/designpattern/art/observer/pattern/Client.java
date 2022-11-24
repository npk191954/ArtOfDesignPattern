package com.designpattern.art.observer.pattern;

public class Client {
    public static void main(String[] args) {
        Stock concreteStock;
        concreteStock = new ConcreteStock();
        concreteStock.setName("股票一");
        concreteStock.setPrice(10.53);

        Buyer concreteBuyer1, concreteBuyer2;
        concreteBuyer1 = new ConcreteBuyer("股民一");
        concreteBuyer2 = new ConcreteBuyer("股民二");

        concreteStock.addBuyer(concreteBuyer1);
        concreteStock.addBuyer(concreteBuyer2);
        concreteStock.changePrice(11.00);
        concreteStock.changePrice(12.00);
    }
}
