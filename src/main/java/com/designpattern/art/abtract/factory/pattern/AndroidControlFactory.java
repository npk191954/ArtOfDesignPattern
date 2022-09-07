package com.designpattern.art.abtract.factory.pattern;

// 具体Android系统控制工厂类：具体工厂角色类
public class AndroidControlFactory extends AbstractControlFactory {
    @Override
    public AbstractOperationController createOperationController() {
        return new AndroidOperationController();
    }

    @Override
    public AbstractInterfaceController createInterfaceController() {
        return new AndroidInterfaceController();
    }
}
