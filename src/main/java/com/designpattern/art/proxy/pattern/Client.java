package com.designpattern.art.proxy.pattern;

public class Client {
    public static void main(String[] args) {
        WebImageViewer proxyWebImageViewer;
        String webPageUrl = "http://imagesource.com/static/1";
        proxyWebImageViewer = new ProxyWebImageViewer();
        proxyWebImageViewer.downloadImages(webPageUrl);
    }
}
