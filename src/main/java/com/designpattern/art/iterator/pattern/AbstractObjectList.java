package com.designpattern.art.iterator.pattern;

import java.util.List;

// 抽象对象列表类：抽象聚合类
public abstract class AbstractObjectList {
    private List<Object> objectList;

    public AbstractObjectList(List<Object> objects) {
        this.objectList = objects;
    }

    public void addObject(Object object) {
        this.objectList.add(object);
    }

    public void removeObject(Object object) {
        this.objectList.remove(object);
    }

    public List<Object> getObjects() {
        return objectList;
    }

    public abstract PageIterator createPageIterator();
}
