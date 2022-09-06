package com.designpattern.art.flyweight.pattern;

// 抽象多媒体享元类：抽象享元类
public abstract class MultimediaFlyweight {
    private String name;
    protected String resource;

    public MultimediaFlyweight(String name, String resource) {
        this.name = name;
        this.resource = resource;
    }

    public String getName() {
        return name;
    }

    public abstract String getResource();

    public void display(PosSize posSize) {
        System.out.println("展示" + this.name + "，位置行数：" + posSize.getLineNumber()
                + ", 大小：高" + posSize.getHeight() + "，宽" + posSize.getWidth());
    }
}
