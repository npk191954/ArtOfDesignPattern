package com.designpattern.art.command.pattern;

// 创建公告板系统界面命令类：具体命令类
public class CreateCommand extends Command{
    @Override
    public void execute() {
        this.boardScreen.create();
    }
}
