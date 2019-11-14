package com.haojie.vo;

import lombok.Data;

/**
 * @author ：单击开始
 * @description：view object 视图对象
 * @date ：Created in 2019/11/14 10:46
 */
@Data
public class ResponseVO<T> {

    private Integer code;
    private String msg;
    private T data;

    public static <T> ResponseVO success(T data){
        ResponseVO<T> responseVO = new ResponseVO<>();
        responseVO.setCode(CodeMsg.SUCCESS.getCode());
        responseVO.setMsg(CodeMsg.SUCCESS.getMsg());
        responseVO.setData(data);
        return responseVO;
    }

    public static <T> ResponseVO error(CodeMsg codeMsg){
        ResponseVO<T> responseVO = new ResponseVO<>();
        responseVO.setCode(codeMsg.getCode());
        responseVO.setMsg(codeMsg.getMsg());
        return responseVO;
    }
}
