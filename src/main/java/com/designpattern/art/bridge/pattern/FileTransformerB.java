package com.designpattern.art.bridge.pattern;

//B格式文件转换器 ：扩充抽象类
public class FileTransformerB extends AbstractFileTransformer {

    public FileTransformerB(DbReadImplementor dbReadImplementor) {
        this.impl= dbReadImplementor;
    }

    @Override
    public void fileTransform() {
        impl.readDb();
        System.out.println("开始转换为对应格式B的文件");
    }
}
