package com.designpattern.art.flyweight.pattern;

// 具体动画享元类：具体享元类
public class AnimationFlyweight extends MultimediaFlyweight{
    public AnimationFlyweight(String name, String resource) {
        super(name, resource);
    }

    @Override
    public String getResource() {
        return this.resource;
    }
}
