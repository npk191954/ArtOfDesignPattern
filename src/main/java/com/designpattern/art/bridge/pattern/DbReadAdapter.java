package com.designpattern.art.bridge.pattern;

// 数据库读取适配器：适配器类
public class DbReadAdapter extends DbReadImplementor {

    private DbReader dbReader;

    public void setDbReader(DbReader dbReader) {
        this.dbReader = dbReader;
    }

    @Override
    public void readDb() {
        dbReader.doReadDb();
    }
}
