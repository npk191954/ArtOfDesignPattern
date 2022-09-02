package com.designpattern.art.command.pattern;

// 打开公告板系统界面命令类：具体命令类
public class OpenCommand extends Command {
    @Override
    public void execute() {
        this.boardScreen.open();
    }
}
