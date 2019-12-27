package com.tentwelve.manage_user.controller;

import com.tentwelve.api.user.UserControllerApi;
import com.tentwelve.model.response.QueryResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tentwelve.entity.user.User;
import com.tentwelve.manage_user.service.UserService;



/**
 * 用户
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 19:00:15
 */
@RestController
@RequestMapping("user/user")
public class UserController implements UserControllerApi {
    @Autowired
    private UserService userService;


    /**
    *  分页查询
    * @param size 页面大小
    * @param current 当前页
    * @param  user
    * @return
    */
    @Override
    @RequestMapping(method = RequestMethod.GET)
    public QueryResponseResult queryPage(@RequestParam(defaultValue = "10") Integer size ,@RequestParam
            (defaultValue="1") Integer current, User user) {
        return userService.queryPage( size, current, user);
    }


}
