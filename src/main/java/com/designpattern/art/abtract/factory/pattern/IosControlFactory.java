package com.designpattern.art.abtract.factory.pattern;

// 具体Ios系统控制工厂类：具体工厂角色类
public class IosControlFactory extends AbstractControlFactory {
    @Override
    public AbstractOperationController createOperationController() {
        return new IosOperationController();
    }

    @Override
    public AbstractInterfaceController createInterfaceController() {
        return new IosInterfaceController();
    }
}
