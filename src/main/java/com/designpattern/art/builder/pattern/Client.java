package com.designpattern.art.builder.pattern;

public class Client {
    public static void main(String[] args) {
        Director director;
        PlayScreenBuilder fullScreenBuilder, miniModeBuilder, memoryModeBuilder;

        System.out.println("完整模式界面显示：");
        fullScreenBuilder = new FullModeBuilder();
        director = new Director();
        director.construct(fullScreenBuilder);
        System.out.println();

        System.out.println("精简模式界面显示：");
        miniModeBuilder = new MiniModeBuilder();
        director.construct(miniModeBuilder);
        System.out.println();

        System.out.println("记忆模式界面显示：");
        memoryModeBuilder = new MemoryModeBuilder();
        director.construct(memoryModeBuilder);
    }
}
