package com.designpattern.art.singleton.pattern;

public class Client {
    public static void main(String[] args) {
        Connection connectionA = ConnectionPool.getConnection();
        Connection connectionB = ConnectionPool.getConnection();
        Connection connectionC = ConnectionPool.getConnection();
        connectionA.doQuery();
        connectionB.doQuery();
        connectionC.doQuery();
    }
}
