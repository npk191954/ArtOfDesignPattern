package com.designpattern.art.interpreter.pattern;

public class Client {
    public static void main(String[] args) {
        String instruction = "COPY VIEW FROM dbA TO dbB";
        InstructionHandler instructionHandler = new InstructionHandler();
        instructionHandler.handle(instruction);
        instructionHandler.output();

        instruction = "MOVE TABLE Student FROM dbA TO dbB";
        instructionHandler.handle(instruction);
        instructionHandler.output();
    }
}
