package com.designpattern.art.simple.factory.pattern;

// 具体圆形类：具体产品角色类
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }

    @Override
    public void erase() {
        System.out.println("擦除圆形");
    }
}
