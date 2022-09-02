package com.designpattern.art.command.pattern;

import java.util.ArrayList;

// 具体主菜单类：具体调用者容器类
public class Menu {
    private String title;
    private ArrayList<MenuItem> list = new ArrayList<MenuItem>();

    public Menu(String title) {
        this.title = title;
    }

    public void addMenuItem(MenuItem menuItem) {
        this.list.add(menuItem);
    }

    public void removeMenuItem(MenuItem menuItem) {
        this.list.remove(menuItem);
    }
}
