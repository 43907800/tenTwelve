package com.tentwelve.framework.exception;

import com.tentwelve.framework.model.response.ResultCode;

/**
 * @Author: Yinn
 * @Date:Create: in 2019/12/23 10:52 上午
 * @Description:
 */
public class CustomException extends RuntimeException {

    //错误代码
    ResultCode resultCode;

    public CustomException(ResultCode resultCode){
        this.resultCode = resultCode;
    }
    public ResultCode getResultCode(){
        return resultCode;
    }


}
