package com.designpattern.art.factory.method.pattern;

// GIF图片读取器工厂类：具体工厂角色类
public class GifImageReaderFactory implements ImageReaderFactory{

    @Override
    public ImageReader createImageReader() {
        return new GifImageReader();
    }
}
