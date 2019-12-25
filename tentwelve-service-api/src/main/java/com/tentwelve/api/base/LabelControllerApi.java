package com.tentwelve.api.base;

import com.tentwelve.framework.entity.base.Label;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

/**
 * @Author: Yinn
 * @Date:Create: in 2019/12/23 2:44 下午
 * @Description:
 */

@Api(value="文章标签操作接口",description = "提供文章标签CRUD")
public interface LabelControllerApi {

    @ApiOperation("查询全部")
    public List<Label> findAll();


}
