package com.designpattern.art.command.pattern;

// 编辑公告板系统界面命令类：具体命令类
public class EditCommand extends Command{
    @Override
    public void execute() {
        this.boardScreen.edit();
    }
}
