package com.designpattern.art.bridge.pattern;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Client {

    public static void main(String[] args) {
        AbstractFileTransformer fileTransformer;
        DbReadImplementor dbReadImplementor;
        DbReader dbReader;
        DbReadAdapter dbReadAdapter;

        dbReader = new MysqlDbReader();
        dbReadAdapter = new DbReadAdapter();
        dbReadAdapter.setDbReader(dbReader);
        dbReadImplementor = dbReadAdapter;
        fileTransformer = new FileTransformerA(dbReadImplementor);
        fileTransformer.fileTransform();
    }
}

