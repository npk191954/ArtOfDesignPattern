package com.designpattern.art.factory.method.pattern;

// JPG图片读取器类：具体产品角色类
public class JpgImageReader extends ImageReader{
    @Override
    public void readImage() {
        System.out.println("读取JPG图片");
    }
}
