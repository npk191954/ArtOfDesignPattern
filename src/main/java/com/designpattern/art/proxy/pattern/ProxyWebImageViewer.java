package com.designpattern.art.proxy.pattern;

// 代理网页图片查看器类：代理主题角色类
public class ProxyWebImageViewer implements WebImageViewer{
    private RealWebImageViewer realWebImageViewer;
    private ImageTypeViewer imageTypeViewer;

    @Override
    public void downloadImages(String webPageUrl) {
        imageTypeViewer = new ImageTypeViewer(webPageUrl);
        realWebImageViewer =new RealWebImageViewer();

        new Thread(new Runnable() {
            @Override
            public void run() {
                imageTypeViewer.getImageUrls();
                imageTypeViewer.getProxyImages();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                realWebImageViewer.downloadImages(webPageUrl);
            }
        }).start();
    }
}
