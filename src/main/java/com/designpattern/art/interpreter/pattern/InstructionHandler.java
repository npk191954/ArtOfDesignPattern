package com.designpattern.art.interpreter.pattern;

// 指令处理具体类
public class InstructionHandler {
    private AbstractNode node;

    public void handle(String instruction) {
        AbstractNode actionNode, fromNode, toNode, expressionNode;
        int fromIndex = instruction.indexOf(" FROM ");
        int toIndex = instruction.indexOf(" TO ");
        String action = instruction.substring(0, fromIndex);
        String from = instruction.substring(fromIndex + 6, toIndex);
        String to = instruction.substring(toIndex + 4);
        actionNode = new ActionNode(action);
        fromNode = new FromNode(from);
        toNode = new ToNode(to);
        expressionNode = new ExpressionNode(actionNode, fromNode, toNode);
        this.node = expressionNode;
    }

    public void output() {
        String result = node.interpret();
        System.out.println(result);
    }
}
