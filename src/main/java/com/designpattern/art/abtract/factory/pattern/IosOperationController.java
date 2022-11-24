package com.designpattern.art.abtract.factory.pattern;

// 具体Ios系统操作控制类：具体产品角色类
public class IosOperationController extends AbstractOperationController {
    @Override
    public void operationControl() {
        System.out.println("Ios系统操作控制");
    }
}
