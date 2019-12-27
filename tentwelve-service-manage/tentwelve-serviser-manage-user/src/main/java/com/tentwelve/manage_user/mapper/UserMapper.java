package com.tentwelve.manage_user.mapper;

import com.tentwelve.entity.user.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 * 
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 19:00:15
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
	
}
