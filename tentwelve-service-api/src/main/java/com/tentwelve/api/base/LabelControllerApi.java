package com.tentwelve.api.base;

import com.tentwelve.model.response.QueryResponseResult;
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

    @ApiOperation("分页查询")
    public QueryResponseResult selectPage();


}
