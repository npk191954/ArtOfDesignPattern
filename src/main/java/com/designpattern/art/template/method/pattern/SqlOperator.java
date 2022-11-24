package com.designpattern.art.template.method.pattern;

// SQL操作抽象类：抽象类
public abstract class SqlOperator {
    protected String sql;
    protected SqlConnector sqlConnector;

    public void setSqlConnector(SqlConnector sqlConnector) {
        this.sqlConnector = sqlConnector;
    }

    public void execute(String sql, Boolean isUpdate) {
        this.sql = sql;
        connect();
        open();
        if (isUpdate) {
            update();
        } else {
            query();
        }
        close();
    }

    public void connect() {
        this.sqlConnector.doConnect();
    }

    public abstract void open();
    public abstract void close();
    public abstract void query();
    public abstract void update();
}
