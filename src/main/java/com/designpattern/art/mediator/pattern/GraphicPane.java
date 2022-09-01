package com.designpattern.art.mediator.pattern;

// 图形窗格类：具体同事类
public class GraphicPane extends Pane{
    @Override
    public void update() {
        System.out.println("graphicPane对象新增内容");
    }

    public void draw() {
        System.out.println("graphicPane对象绘制内容");
    }
}
