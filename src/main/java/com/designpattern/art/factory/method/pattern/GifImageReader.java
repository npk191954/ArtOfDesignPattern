package com.designpattern.art.factory.method.pattern;

// GIF图片读取器类：具体产品角色类
public class GifImageReader extends ImageReader{
    @Override
    public void readImage() {
        System.out.println("读取GIF图片");
    }
}
