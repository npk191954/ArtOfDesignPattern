package com.designpattern.art.strategy.pattern;

// 垂直起飞策略类：具体策略类
public class VerticalStartFlyStrategy extends AbstractStartFlyStrategy{
    @Override
    public void startFly() {
        System.out.println("垂直起飞");
    }
}
