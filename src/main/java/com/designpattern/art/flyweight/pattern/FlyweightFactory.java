package com.designpattern.art.flyweight.pattern;

import java.util.Hashtable;

// 多媒体享元工厂类：具体享元工厂类
public class FlyweightFactory {
    private Hashtable flyweights = new Hashtable();

    public MultimediaFlyweight getFlyweight(String key) {
        if (flyweights.containsKey(key)) {
            return (MultimediaFlyweight) flyweights.get(key);
        }
        return null;
    }

    public void addFlyweight(String key, String resource, String type) {
        if (!this.flyweights.containsKey(key)) {
            MultimediaFlyweight flyweight = null;
            if (type == "image") {
                flyweight = new ImageFlyweight(key, resource);
            }
            if (type == "animation") {
                flyweight = new AnimationFlyweight(key, resource);
            }
            if (type == "video") {
                flyweight = new VideoFlyweight(key, resource);
            }
            this.flyweights.put(key, flyweight);
        }
    }
}
