package com.designpattern.art.abstrct.factory.pattern;

// 抽象系统控制工厂类：抽象工厂角色类
public abstract class AbstractControlFactory {
    public abstract AbstractOperationController createOperationController();
    public abstract AbstractInterfaceController createInterfaceController();
}
