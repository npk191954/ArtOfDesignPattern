package com.designpattern.art.command.pattern;

// 抽象操作命令类：抽象命令类
public abstract class Command {
    protected BoardScreen boardScreen = new BoardScreen();

    public abstract void execute();
}
