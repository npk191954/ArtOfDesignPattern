package com.designpattern.art.flyweight.pattern;

// 具体图片享元类：具体享元类
public class ImageFlyweight extends MultimediaFlyweight{
    public ImageFlyweight(String name, String resource) {
        super(name, resource);
    }

    @Override
    public String getResource() {
        return this.resource;
    }
}
