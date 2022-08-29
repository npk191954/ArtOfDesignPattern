package com.designpattern.art.bridge.pattern;

// 数据库读取类：具体适配者
public class MysqlDbReader extends DbReader {
    @Override
    public void doReadDb() {
        System.out.println("从Mysql数据库获取数据");
    }
}
