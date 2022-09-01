package com.designpattern.art.mediator.pattern;

// 窗口中介者类：具体中介者类
public class WindowMediator extends Mediator{
    public TextPane textPane;
    public ListPane listPane;
    public GraphicPane graphicPane;

    @Override
    public void paneChanged(Pane pane) {
        if (pane == this.textPane) {
            listPane.select();
            graphicPane.draw();
        }
        if (pane == this.listPane) {
            textPane.update();
            graphicPane.update();
        }
        if (pane == this.graphicPane) {
            textPane.update();
            listPane.update();
        }
    }
}
