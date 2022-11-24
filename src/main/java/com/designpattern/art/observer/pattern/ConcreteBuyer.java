package com.designpattern.art.observer.pattern;

// 具体买家类：具体观察者类
public class ConcreteBuyer extends Buyer {

    public ConcreteBuyer(String name) {
        super(name);
    }

    @Override
    public void focus(Stock stock) {
        System.out.println(this.name + "关注的" + stock.getName()+ "的股价发生变化，现价" + stock.getPrice());
    }
}
