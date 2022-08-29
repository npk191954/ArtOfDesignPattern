//package com.designpattern.art;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class Main {
//
//    public static void main(String[] args) {
//        // SpringApplication.run(DesignPatternArtApplication.class, args);
//        AbstractFileTransformer fileTransformer;
//        DbReadImplementor dbReadImplementor;
//        DbReader dbReader;
//        DbReadAdapter dbReadAdapter;
//
//        dbReader = new MysqlDbReader();
//        dbReadAdapter = new DbReadAdapter();
//        dbReadAdapter.setDbReader(dbReader);
//        dbReadImplementor = dbReadAdapter;
//        fileTransformer = new FileTransformerA(dbReadImplementor);
//        fileTransformer.fileTransform();
//
//    }
//
//}
