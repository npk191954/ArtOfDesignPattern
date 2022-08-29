package com.designpattern.art.bridge.pattern;

// 抽象文件转换类：抽象类
public abstract class AbstractFileTransformer {

    protected DbReadImplementor impl;

    public abstract void fileTransform();
}


