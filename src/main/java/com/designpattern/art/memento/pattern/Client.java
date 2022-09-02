package com.designpattern.art.memento.pattern;

public class Client {
    public static void main(String[] args) {
        Scene scene;
        MementoCaretaker mementoCaretaker;
        scene = new Scene("场景一", 5);
        mementoCaretaker = new MementoCaretaker();

        scene.display();
        mementoCaretaker.setMemento(scene.save());
        scene.setName("场景二");
        scene.setLevel(6);
        scene.display();
        scene.restore(mementoCaretaker.getMemento());
        scene.display();
    }
}
