package com.designpattern.art.composite.pattern;

public class Client {
    public static void main(String[] args) {
        Component button, textBox, window, pane;

        window = new Container("窗体");
        pane = new Container("中间面板");

        button = new Button("按钮一");
        textBox = new TextBox("文本框一");

        pane.add(button);
        pane.add(textBox);
        window.add(pane);

        window.display();
    }
}
