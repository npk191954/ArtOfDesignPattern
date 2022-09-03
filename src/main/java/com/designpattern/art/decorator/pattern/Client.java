package com.designpattern.art.decorator.pattern;

public class Client {
    public static void main(String[] args) {
        StringEncryptor stringEncryptor, modStringEncryptor, reversalStringEncryptor;

        stringEncryptor = new ShiftStringEncryptor();
        String encryptStr = stringEncryptor.encrypt("secretPassword");
        System.out.println(encryptStr);

        reversalStringEncryptor = new ReversalEncryptorDecorator(stringEncryptor);
        encryptStr = reversalStringEncryptor.encrypt("secretPassword");
        System.out.println(encryptStr);

        modStringEncryptor = new ModEncryptorDecorator(reversalStringEncryptor);
        encryptStr = modStringEncryptor.encrypt("secretPassword");
        System.out.println(encryptStr);
    }
}
