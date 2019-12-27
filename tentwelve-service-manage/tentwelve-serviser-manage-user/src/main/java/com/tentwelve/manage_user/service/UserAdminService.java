package com.tentwelve.manage_user.service;

import com.tentwelve.entity.user.UserAdmin;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tentwelve.manage_user.mapper.UserAdminMapper;
import com.tentwelve.model.response.CommonCode;
import com.tentwelve.model.response.QueryResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 管理员
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 19:00:14
 */
@Service
public class UserAdminService {

    @Autowired
    private UserAdminMapper userAdminMapper;


    public QueryResponseResult queryPage(Integer size, Integer current,UserAdmin userAdmin){
        IPage<UserAdmin> userAdminIPage = userAdminMapper.selectPage(new Page(current,size), new QueryWrapper<>(userAdmin));
        return new QueryResponseResult(CommonCode.SUCCESS,userAdminIPage) ;
    }

}

