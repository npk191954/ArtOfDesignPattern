package com.designpattern.art.command.pattern;

// 具体公告板系统界面类：具体接收者类
public class BoardScreen {
    public void open() {
        System.out.println("公告板系统界面打开");
    }

    public void create() {
        System.out.println("公告板系统界面创建");
    }

    public void edit() {
        System.out.println("公告板系统界面编辑");
    }
}
