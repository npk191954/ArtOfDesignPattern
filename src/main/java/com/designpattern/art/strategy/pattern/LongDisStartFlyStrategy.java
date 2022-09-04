package com.designpattern.art.strategy.pattern;

// 长距离起飞策略类：具体策略类
public class LongDisStartFlyStrategy extends AbstractStartFlyStrategy{
    @Override
    public void startFly() {
        System.out.println("长距离起飞");
    }
}
