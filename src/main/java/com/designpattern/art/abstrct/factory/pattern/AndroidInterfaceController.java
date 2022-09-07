package com.designpattern.art.abstrct.factory.pattern;

// 具体Android系统界面控制类：具体界面控制类
public class AndroidInterfaceController extends AbstractInterfaceController {
    @Override
    public void interfaceControl() {
        System.out.println("Android系统界面控制");
    }
}
