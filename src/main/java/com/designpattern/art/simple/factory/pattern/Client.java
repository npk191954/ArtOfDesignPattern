package com.designpattern.art.simple.factory.pattern;

public class Client {
    public static void main(String[] args) {
        Shape circle, square, triangle;

        circle = ShapeFactory.createShape("circle");
        circle.draw();
        circle.erase();
        System.out.println();

        square = ShapeFactory.createShape("square");
        square.draw();
        square.erase();
        System.out.println();

        triangle = ShapeFactory.createShape("triangle");
        triangle.draw();
        triangle.erase();
        System.out.println();
    }
}
