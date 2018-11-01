package org.bill99.playdemo.exception;

import org.bill99.playdemo.enums.MyEnum;

public class MyException extends RuntimeException {

    public MyException(MyEnum myEnum){
        super(myEnum.getMsg());
    }

}
