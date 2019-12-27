package com.tentwelve.api.user;

import com.tentwelve.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.tentwelve.entity.user.UserAdmin;



/**
 * 管理员
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 19:00:14
 */

@Api(value="管理员操作接口",description = "提供管理员CRUD")
public interface UserAdminControllerApi {

    @ApiOperation("分页查询")
    public QueryResponseResult queryPage(Integer size, Integer current, UserAdmin userAdmin) ;


}
