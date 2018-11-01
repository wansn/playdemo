package org.bill99.playdemo.enums;

public enum MyEnum {
    NOTFOUND_ERROR("输入参数有误");

    private String msg;

    MyEnum(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
