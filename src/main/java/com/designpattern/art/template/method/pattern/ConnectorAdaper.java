package com.designpattern.art.template.method.pattern;

// SQL连接适配器类：具体适配器类
public class ConnectorAdaper extends SqlConnector{
    private JdbcOdbcDriver jdbcOdbcDriver;

    public ConnectorAdaper() {
        this.jdbcOdbcDriver = new JdbcOdbcDriver();
    }

    @Override
    public void doConnect() {
        System.out.println("使用 JDBC-ODBC Driver 连接数据库");
    }
}
