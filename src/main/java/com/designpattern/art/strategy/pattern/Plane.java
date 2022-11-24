package com.designpattern.art.strategy.pattern;

// 具体飞机类：具体环境类
public class Plane {
    private String name;
    private AbstractStartFlyStrategy startFlyStrategy;
    private AbstractNormalFlyStrategy normalFlyStrategy;

    public Plane(String name) {
        this.name = name;
    }

    public void setStartFlyStrategy(AbstractStartFlyStrategy startFlyStrategy) {
        this.startFlyStrategy = startFlyStrategy;
    }

    public void setNormalFlyStrategy(AbstractNormalFlyStrategy normalFlyStrategy) {
        this.normalFlyStrategy = normalFlyStrategy;
    }

    public void takeOff() {
        System.out.println(this.name + "起飞：");
        this.startFlyStrategy.startFly();
    }

    public void fly() {
        System.out.println(this.name + "飞行：");
        this.normalFlyStrategy.normalFly();
    }
}
