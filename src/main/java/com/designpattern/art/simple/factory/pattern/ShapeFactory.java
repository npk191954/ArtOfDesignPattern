package com.designpattern.art.simple.factory.pattern;

// 具体形状工厂类：具体工厂角色类
public class ShapeFactory {
    public static Shape createShape(String type) {
        if (type == "circle") {
            return new Circle();
        } else if (type == "square") {
            return new Square();
        } else if (type == "triangle") {
            return new Triangle();
        }
        return null;
    }
}
