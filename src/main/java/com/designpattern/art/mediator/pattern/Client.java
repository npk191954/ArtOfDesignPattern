package com.designpattern.art.mediator.pattern;

public class Client {
    public static void main(String[] args) {
        WindowMediator windowMediator;
        windowMediator = new WindowMediator();

        TextPane textPane = new TextPane();
        ListPane listPane = new ListPane();
        GraphicPane graphicPane = new GraphicPane();

        textPane.setMediator(windowMediator);
        listPane.setMediator(windowMediator);
        graphicPane.setMediator(windowMediator);

        windowMediator.textPane = textPane;
        windowMediator.listPane = listPane;
        windowMediator.graphicPane = graphicPane;

        textPane.changed();
        System.out.println("");
        graphicPane.changed();
    }
}
