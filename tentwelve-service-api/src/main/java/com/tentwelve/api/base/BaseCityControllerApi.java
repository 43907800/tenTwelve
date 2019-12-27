package com.tentwelve.api.base;

import com.tentwelve.entity.base.BaseCity;
import com.tentwelve.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Author: Yinn
 * @Date:Create: in 2019/12/27 6:05 下午
 * @Description:
 */

@Api(value="热门城市",description = "提供热门城市CRUD")
public interface BaseCityControllerApi {

    @ApiOperation("分页查询")
    public QueryResponseResult queryPage(Integer size, Integer current, BaseCity baseCity) ;

}
