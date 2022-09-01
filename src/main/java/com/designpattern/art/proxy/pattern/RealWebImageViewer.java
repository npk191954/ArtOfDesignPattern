package com.designpattern.art.proxy.pattern;

// 真实网页图片查看器类：真实主题角色类
public class RealWebImageViewer implements WebImageViewer {
    @Override
    public void downloadImages(String webPageUrl) {
        System.out.println("开始下载网页里的全部真实图片");
    }
}
