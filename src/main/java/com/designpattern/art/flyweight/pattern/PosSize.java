package com.designpattern.art.flyweight.pattern;

// 具体位置大小类：外部状态类
public class PosSize {
    private Integer lineNumber;
    private Integer height;
    private Integer width;

    public Integer getLineNumber() {
        return lineNumber;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
}
