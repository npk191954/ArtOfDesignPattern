package com.designpattern.art.abstrct.factory.pattern;

public class Client {
    public static void main(String[] args) {
        AbstractOperationController operationController;
        AbstractInterfaceController interfaceController;
        AbstractControlFactory factory;

        factory = new AndroidControlFactory();
        operationController = factory.createOperationController();
        interfaceController = factory.createInterfaceController();
        operationController.operationControl();
        interfaceController.interfaceControl();
        System.out.println();

        factory = new IosControlFactory();
        operationController = factory.createOperationController();
        interfaceController = factory.createInterfaceController();
        operationController.operationControl();
        interfaceController.interfaceControl();
    }
}
