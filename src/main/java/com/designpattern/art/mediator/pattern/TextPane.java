package com.designpattern.art.mediator.pattern;

// 文本窗格类：具体同事类
public class TextPane extends Pane{
    @Override
    public void update() {
        System.out.println("textPane对象新增内容");
    }
}
