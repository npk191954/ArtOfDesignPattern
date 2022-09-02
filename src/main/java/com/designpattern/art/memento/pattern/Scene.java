package com.designpattern.art.memento.pattern;

// 具体场景类：具体原发器类
public class Scene {
    private String name;
    private Integer level;

    public Scene(String name, Integer level) {
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

    public void display() {
        System.out.println("位置为：" + this.name + ", 等级为：" + this.level);
    }

    public SceneMemento save() {
        return new SceneMemento(this.name, this.level);
    }

    public void restore(SceneMemento sceneMemento) {
        this.name = sceneMemento.getName();
        this.level = sceneMemento.getLevel();
    }
}
