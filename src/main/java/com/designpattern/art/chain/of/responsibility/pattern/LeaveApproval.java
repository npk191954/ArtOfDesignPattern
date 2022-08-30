package com.designpattern.art.chain.of.responsibility.pattern;

import java.util.Date;

// 假条审批请求类
public class LeaveApproval {
    // 请假姓名
    private String name;
    // 请假日期
    private Date startDate;
    // 请假天数
    private Integer leaveDays;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Integer getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(Integer leaveDays) {
        this.leaveDays = leaveDays;
    }
}
