package com.designpattern.art.factory.method.pattern;

// JPG图片读取器工厂类：具体工厂角色类
public class JpgImageReaderFactory implements ImageReaderFactory{
    @Override
    public ImageReader createImageReader() {
        return new JpgImageReader();
    }
}
