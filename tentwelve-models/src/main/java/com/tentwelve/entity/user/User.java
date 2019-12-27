package com.tentwelve.entity.user;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 19:00:15
 */
@Data
@TableName("tb_user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
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
	 * 昵称
	 */
	private String nickname;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 出生年月日
	 */
	private Date birthday;
	/**
	 * 头像
	 */
	private String avatar;
	/**
	 * E-Mail
	 */
	private String email;
	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 注册日期
	 */
	private Date regdate;
	/**
	 * 修改日期
	 */
	private Date updatedate;
	/**
	 * 最后登陆日期
	 */
	private Date lastdate;
	/**
	 * 在线时长（分钟）
	 */
	private Long online;
	/**
	 * 兴趣
	 */
	private String interest;
	/**
	 * 个性
	 */
	private String personality;
	/**
	 * 粉丝数
	 */
	private Integer fanscount;
	/**
	 * 关注数
	 */
	private Integer followcount;

}
