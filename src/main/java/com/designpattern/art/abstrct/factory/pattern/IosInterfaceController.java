package com.designpattern.art.abstrct.factory.pattern;

// 具体Ios系统界面控制类：具体产品角色类
public class IosInterfaceController extends AbstractInterfaceController {
    @Override
    public void interfaceControl() {
        System.out.println("Ios系统界面控制");
    }
}
