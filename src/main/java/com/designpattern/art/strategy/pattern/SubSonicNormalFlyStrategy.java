package com.designpattern.art.strategy.pattern;

// 亚音速飞行策略类：具体策略类
public class SubSonicNormalFlyStrategy extends AbstractNormalFlyStrategy{
    @Override
    public void normalFly() {
        System.out.println("亚音速飞行");
    }
}
