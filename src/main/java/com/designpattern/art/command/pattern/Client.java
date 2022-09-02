package com.designpattern.art.command.pattern;

public class Client {
    public static void main(String[] args) {
        Menu menu = new Menu("主菜单");

        MenuItem openMenuItem, createMenuItem, editMenuItem;
        openMenuItem = new MenuItem("打开菜单项");
        createMenuItem = new MenuItem("创建菜单项");
        editMenuItem = new MenuItem("编辑菜单项");

        Command openCommand, createCommand, editCommand;
        openCommand = new OpenCommand();
        createCommand = new CreateCommand();
        editCommand = new EditCommand();

        openMenuItem.setCommand(openCommand);
        createMenuItem.setCommand(createCommand);
        editMenuItem.setCommand(editCommand);

        menu.addMenuItem(openMenuItem);
        menu.addMenuItem(createMenuItem);
        menu.addMenuItem(editMenuItem);

        openMenuItem.onClick();
        editMenuItem.onClick();
    }
}
