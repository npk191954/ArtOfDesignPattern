package com.designpattern.art.strategy.pattern;

// 超音速飞行策略类：具体策略类
public class SuperSonicNormalFlyStrategy extends AbstractNormalFlyStrategy{
    @Override
    public void normalFly() {
        System.out.println("超音速飞行");
    }
}
