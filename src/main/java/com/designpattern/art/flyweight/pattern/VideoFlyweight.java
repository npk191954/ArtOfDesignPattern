package com.designpattern.art.flyweight.pattern;

// 具体视频享元类：具体享元类
public class VideoFlyweight extends MultimediaFlyweight{
    public VideoFlyweight(String name, String resource) {
        super(name, resource);
    }

    @Override
    public String getResource() {
        return this.resource;
    }
}
