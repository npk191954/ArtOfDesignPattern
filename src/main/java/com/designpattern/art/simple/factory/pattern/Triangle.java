package com.designpattern.art.simple.factory.pattern;

// 具体三角形类：具体产品角色类
public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }

    @Override
    public void erase() {
        System.out.println("擦除三角形");
    }
}
