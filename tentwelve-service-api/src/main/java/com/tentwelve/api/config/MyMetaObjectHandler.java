package com.tentwelve.api.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: Yinn
 * @Date:Create: in 2019/12/28 10:26 下午
 * @Description:   创建 修改时间 自动填充功能
 */

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("regdate", new Date(), metaObject);//  注册时间
        this.setFieldValByName("createtime", new Date(), metaObject);//  注册时间
        this.setFieldValByName("updatedate", new Date(), metaObject);// 修改时间

    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updatedate", new Date(), metaObject); // 修改时间

    }
}
