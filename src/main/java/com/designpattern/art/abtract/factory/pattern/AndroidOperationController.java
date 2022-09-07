package com.designpattern.art.abtract.factory.pattern;

// 具体Android系统操作控制类：具体产品角色类
public class AndroidOperationController extends AbstractOperationController{
    @Override
    public void operationControl() {
        System.out.println("Android系统操作控制");
    }
}
