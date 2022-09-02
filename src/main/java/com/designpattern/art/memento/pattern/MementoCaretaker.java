package com.designpattern.art.memento.pattern;

// 具体场景备忘录负责人类：具体负责人类
public class MementoCaretaker {
    private SceneMemento memento;

    public SceneMemento getMemento() {
        return memento;
    }

    public void setMemento(SceneMemento memento) {
        this.memento = memento;
    }
}
