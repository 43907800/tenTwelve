package com.tentwelve.manage_user.service;

import com.tentwelve.entity.user.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tentwelve.manage_user.mapper.UserMapper;
import com.tentwelve.model.response.CommonCode;
import com.tentwelve.model.response.QueryResponseResult;
import com.tentwelve.model.response.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 用户
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 19:00:15
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public QueryResponseResult queryPage(Integer size, Integer current,User user){
        IPage<User> userIPage = userMapper.selectPage(new Page(current,size), new QueryWrapper<>(user));
        return new QueryResponseResult(CommonCode.SUCCESS,userIPage) ;
    }

    public ResponseResult save(User user) {
        int insert = userMapper.insert(user);
        if (insert== 0) return new ResponseResult(CommonCode.FAIL);
        return new ResponseResult(CommonCode.SUCCESS);
    }
}

