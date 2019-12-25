package com.tentwelve.entity.base.response;

import com.tentwelve.framework.model.response.ResultCode;
import lombok.ToString;

/**
 * @Author: Yinn
 * @Date:Create: in 2019/12/23 2:31 下午
 * @Description:
 */

@ToString
public enum BaseCode  implements ResultCode {
    // 自定义异常信息抛出

    LABEL_ADD_EXISTSNAME(false,24001,"标签名称已经存在！");

    //操作代码
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;
    private BaseCode(boolean success, int code, String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }

    @Override
    public boolean success() {
        return success;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
