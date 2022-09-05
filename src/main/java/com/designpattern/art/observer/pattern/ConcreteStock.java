package com.designpattern.art.observer.pattern;

// 具体股票类：具体观察目标类
public class ConcreteStock extends Stock {
    @Override
    public void nofityBuyer() {
        for (Buyer buyer : buyerList) {
            buyer.focus(this);
        }
    }
}
