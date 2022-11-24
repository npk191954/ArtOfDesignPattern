package com.designpattern.art.memento.pattern;

// 具体场景备忘录类：具体备忘录类
public class SceneMemento {
    private String name;
    private Integer level;

    public SceneMemento(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
