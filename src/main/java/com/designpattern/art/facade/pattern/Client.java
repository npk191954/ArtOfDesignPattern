package com.designpattern.art.facade.pattern;

public class Client {

    public static void main(String[] args) {
        CopyFacade copyFacade = new CopyFacade();
        copyFacade.oneKeyCopy();
    }
}
