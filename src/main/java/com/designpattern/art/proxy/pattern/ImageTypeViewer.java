package com.designpattern.art.proxy.pattern;

import java.util.*;

// 图片类型查看器具体类：具体类
public class ImageTypeViewer {
    private String webPageUrl;
    private Map<String, String> nameUrlPair;
    private Map<String, String> nameTypePair;

    public String getWebPageUrl() {
        return webPageUrl;
    }

    public void setWebPageUrl(String webPageUrl) {
        this.webPageUrl = webPageUrl;
    }

    public Map<String, String> getNameUrlPair() {
        return nameUrlPair;
    }

    public void setNameUrlPair(Map<String, String> nameUrlPair) {
        this.nameUrlPair = nameUrlPair;
    }

    public Map<String, String> getNameTypePair() {
        return nameTypePair;
    }

    public void setNameTypePair(Map<String, String> nameTypePair) {
        this.nameTypePair = nameTypePair;
    }

    public ImageTypeViewer(String webPageUrl) {
        this.webPageUrl = webPageUrl;
    }

    public void getImageUrls() {
        System.out.println("获取网页中的所有图片名称和对应图片地址");
        Map<String, String> nameUrlPair = new HashMap<String, String>();
        nameUrlPair.put("xiaolonglv.png", "http://imagesource.com/static/xiaolonglv.png");
        this.nameUrlPair = nameUrlPair;
    }

    public void getProxyImages() {
        System.out.println("获取图片名称对应的图片类型，并显示对应类型图片");
        Map<String, String> nameTypePair = new HashMap<String, String>();
        nameUrlPair.forEach((key, value) -> {
            String imageType = key.substring(key.lastIndexOf("."));
            nameTypePair.put(key, imageType);
        });
    }
}
