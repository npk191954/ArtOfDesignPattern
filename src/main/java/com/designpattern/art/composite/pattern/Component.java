package com.designpattern.art.composite.pattern;

// 抽象组件类：抽象构件类
public abstract class Component {
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract Component getChild(int i);
    public abstract void display();
}
