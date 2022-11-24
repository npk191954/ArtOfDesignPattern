package com.designpattern.art.flyweight.pattern;

public class Client {
    public static void main(String[] args) {
        MultimediaFlyweight image, animation1, animation2, video;
        PosSize posSize;
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        flyweightFactory.addFlyweight("xiaolonglv.png", "图片内容", "image");
        flyweightFactory.addFlyweight("张无忌.gif", "动片内容", "animation");
        flyweightFactory.addFlyweight("段誉.rmvb", "视频内容", "video");

        image = flyweightFactory.getFlyweight("xiaolonglv.png");
        animation1 = flyweightFactory.getFlyweight("张无忌.gif");
        animation2 = flyweightFactory.getFlyweight("张无忌.gif");
        video = flyweightFactory.getFlyweight("段誉.rmvb");

        posSize = new PosSize();
        posSize.setLineNumber(100);
        posSize.setHeight(500);
        posSize.setWidth(800);
        image.display(posSize);

        posSize.setLineNumber(200);
        animation1.display(posSize);

        posSize.setLineNumber(300);
        animation2.display(posSize);

        posSize.setLineNumber(400);
        video.display(posSize);
    }
}
