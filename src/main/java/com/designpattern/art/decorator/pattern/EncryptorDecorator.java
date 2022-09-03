package com.designpattern.art.decorator.pattern;

// 字符串加密装饰类：抽象装饰类
public class EncryptorDecorator extends StringEncryptor {
    private StringEncryptor stringEncryptor;

    public EncryptorDecorator(StringEncryptor stringEncrypt) {
        this.stringEncryptor = stringEncrypt;
    }

    @Override
    public String encrypt(String strStr) {
        return stringEncryptor.encrypt(strStr);
    }
}
