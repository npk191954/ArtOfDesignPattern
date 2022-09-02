package com.designpattern.art.interpreter.pattern;

// 目标数据库表达式类：终结表达式类
public class ToNode extends AbstractNode{
    private String to;

    public ToNode(String to) {
        this.to = to;
    }

    @Override
    public String interpret() {
        return "TO " + to;
    }
}
