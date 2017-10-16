package com.soul.wk.dutychain.domain;

public abstract class Request {

    protected String requestContent;
    protected int requestNum;


    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public int getRequestNum() {
        return requestNum;
    }

    public void setRequestNum(int requestNum) {
        this.requestNum = requestNum;
    }

    public abstract String getType();
}
