package com.designpattern.art.simple.factory.pattern;

// 具体正方形类：具体产品角色类
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制正方形");
    }

    @Override
    public void erase() {
        System.out.println("擦除正方形");
    }
}
