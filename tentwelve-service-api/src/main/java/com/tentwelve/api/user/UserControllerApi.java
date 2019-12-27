package com.tentwelve.api.user;

import com.tentwelve.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.tentwelve.entity.user.User;



/**
 * 用户
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 19:00:15
 */

@Api(value="用户操作接口",description = "提供用户CRUD")
public interface UserControllerApi {

    @ApiOperation("分页查询")
    public QueryResponseResult queryPage(Integer size, Integer current, User user) ;


}
