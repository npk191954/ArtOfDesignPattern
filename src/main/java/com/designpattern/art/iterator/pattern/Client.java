package com.designpattern.art.iterator.pattern;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        AbstractObjectList concreteObjectList;
        PageIterator concretePageIterator;
        List<Object> objects = new ArrayList<Object>();
        objects.add("ab");
        objects.add("cd");
        objects.add("ef");
        objects.add("gh");
        objects.add("ij");
        objects.add("kl");
        concreteObjectList = new ConcreteObjectList(objects);
        concretePageIterator = concreteObjectList.createPageIterator();

        while (!concretePageIterator.isLastPage()) {
            System.out.println("下一页：");
            List<Object> objPage = concretePageIterator.getNextPage();
            System.out.println(objPage);
            concretePageIterator.nextPage();
        }
        System.out.println();

        while (!concretePageIterator.isFirstPage()) {
            System.out.println("上一页：");
            List<Object> objPage = concretePageIterator.getPreviousPage();
            System.out.println(objPage);
            concretePageIterator.previousPage();
        }
    }
}
