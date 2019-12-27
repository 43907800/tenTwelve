package com.tentwelve.manage_user.mapper;

import com.tentwelve.entity.user.UserAdmin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 管理员
 * 
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 19:00:14
 */
@Mapper
public interface UserAdminMapper extends BaseMapper<UserAdmin> {
	
}
