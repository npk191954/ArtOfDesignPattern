package com.designpattern.art.decorator.pattern;

//  字符串逆向加密类：具体装饰类
public class ReversalEncryptorDecorator extends EncryptorDecorator {
    public ReversalEncryptorDecorator(StringEncryptor stringEncrypt) {
        super(stringEncrypt);
    }

    @Override
    public String encrypt(String strStr) {
        String encryptStr = super.encrypt(strStr);
        StringBuilder result = new StringBuilder(encryptStr);
        return result.reverse().toString();
    }
}
