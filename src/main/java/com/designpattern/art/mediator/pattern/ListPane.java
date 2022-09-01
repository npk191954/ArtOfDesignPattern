package com.designpattern.art.mediator.pattern;

// 列表窗格类：具体同事类
public class ListPane extends Pane{
    @Override
    public void update() {
        System.out.println("listPane对象新增内容");
    }

    public void select() {
        System.out.println("listPane对象选中内容");
    }
}
