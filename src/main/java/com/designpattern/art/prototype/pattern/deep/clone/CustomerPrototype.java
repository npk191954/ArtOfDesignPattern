package com.designpattern.art.prototype.pattern.deep.clone;

import java.io.Serializable;

// 抽象顾客原型类：抽象原型类
public abstract class CustomerPrototype implements Serializable {
    public abstract CustomerPrototype deepClone();
}
