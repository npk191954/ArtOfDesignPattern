package com.designpattern.art.factory.method.pattern;

public class Client {
    public static void main(String[] args) {
        ImageReaderFactory imageReaderFactory;
        ImageReader imageReader;

        imageReaderFactory = new GifImageReaderFactory();
        imageReader = imageReaderFactory.createImageReader();
        imageReader.readImage();

        imageReaderFactory = new JpgImageReaderFactory();
        imageReader = imageReaderFactory.createImageReader();
        imageReader.readImage();
    }
}
