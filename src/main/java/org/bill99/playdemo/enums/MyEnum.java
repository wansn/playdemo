package org.bill99.playdemo.enums;

public enum MyEnum {
    INVALIDPARA_ERROR("输入参数有误"),
    NOTFOUND_ERROR("查询为空");

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
