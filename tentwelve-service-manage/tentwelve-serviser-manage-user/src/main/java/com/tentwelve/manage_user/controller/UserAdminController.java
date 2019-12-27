package com.tentwelve.manage_user.controller;

import com.tentwelve.api.user.UserAdminControllerApi;
import com.tentwelve.model.response.QueryResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tentwelve.entity.user.UserAdmin;
import com.tentwelve.manage_user.service.UserAdminService;



/**
 * 管理员
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 19:00:14
 */
@RestController
@RequestMapping("user/useradmin")
public class UserAdminController implements UserAdminControllerApi {
    @Autowired
    private UserAdminService userAdminService;


    /**
    *  分页查询
    * @param size 页面大小
    * @param current 当前页
    * @param  userAdmin
    * @return
    */
    @Override
    @RequestMapping(method = RequestMethod.GET)
    public QueryResponseResult queryPage(@RequestParam(defaultValue = "10") Integer size ,@RequestParam
            (defaultValue="1") Integer current, UserAdmin userAdmin) {
        return userAdminService.queryPage( size, current, userAdmin);
    }


}
