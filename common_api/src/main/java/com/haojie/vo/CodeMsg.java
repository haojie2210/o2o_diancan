package com.haojie.vo;

import lombok.Data;
import lombok.Getter;

@Getter
public enum CodeMsg {
    SUCCESS(0,"成功"),
    INTERNAL_ERROR(500,"服务器内部出错"),
    PRODUCT_NOT_EXIST(10001,"商品不存在"),
    order_closed(20001,"交易已关闭"),
    login_fail(30001,"用户名和密码输入错误")
    ;
    private Integer code;
    private String msg;

    private CodeMsg(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }
}
