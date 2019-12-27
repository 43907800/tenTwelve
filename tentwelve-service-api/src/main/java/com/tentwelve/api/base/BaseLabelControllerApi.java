package com.tentwelve.api.base;

import com.tentwelve.entity.base.BaseLabel;
import com.tentwelve.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Author: Yinn
 * @Date:Create: in 2019/12/23 2:44 下午
 * @Description:
 */

@Api(value="文章标签操作接口",description = "提供文章标签CRUD")
public interface BaseLabelControllerApi {

    @ApiOperation("分页查询")
    public QueryResponseResult queryPage(Integer size, Integer current, BaseLabel baseLabel) ;


}
