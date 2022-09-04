package com.designpattern.art.template.method.pattern;

// 具体SQL操作类：具体子类
public class ConcreteSqlOperator extends SqlOperator{
    @Override
    public void open() {
        System.out.println("打开数据库");
    }

    @Override
    public void close() {
        System.out.println("关闭数据库");
    }

    @Override
    public void query() {
        System.out.println("查询数据库：" + this.sql);
    }

    @Override
    public void update() {
        System.out.println("更新数据库：" + this.sql);
    }
}
