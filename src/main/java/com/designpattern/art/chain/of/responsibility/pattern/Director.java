package com.designpattern.art.chain.of.responsibility.pattern;

// 主任审批者类：具体处理者类
public class Director extends Approvor {

    public Director(String name) {
        super(name);
    }

    @Override
    public void processApproval(LeaveApproval leaveApproval) {
        if (leaveApproval.getLeaveDays() < 3) {
            System.out.println(name + "审批假条：通过");
        } else {
            successor.processApproval(leaveApproval);
        }
    }
}
