package com.designpattern.art.template.method.pattern;

public class Client {
    public static void main(String[] args) {
        SqlOperator sqlOperator;
        SqlConnector sqlConnector;
        sqlOperator = new ConcreteSqlOperator();
        sqlConnector = new ConnectorAdaper();
        sqlOperator.setSqlConnector(sqlConnector);
        sqlOperator.execute("SELECT * FROM tableA", false);
        System.out.println();
        sqlOperator.execute("UPDATE tableA SET 'status' = 1", true);
    }
}
