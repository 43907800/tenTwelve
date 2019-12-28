package com.tentwelve.entity.user;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 管理员
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 19:00:14
 */
@Data
@TableName("tb_user_admin")
public class UserAdmin implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId(type = IdType.ID_WORKER_STR)
	private String id;
	/**
	 * 登陆名称
	 */
	private String loginname;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 状态
	 */
	private String state;

}
