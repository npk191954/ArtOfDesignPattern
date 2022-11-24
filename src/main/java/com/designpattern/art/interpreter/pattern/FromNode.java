package com.designpattern.art.interpreter.pattern;

// 源数据库表达式类：终结表达式类
public class FromNode extends AbstractNode{
    private String from;

    public FromNode(String from) {
        this.from = from;
    }

    @Override
    public String interpret() {
        return  "FROM " + from;
    }
}
