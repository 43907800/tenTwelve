package com.tentwelve.entity.base;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 标签
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-24 16:22:19
 */
@Data
@TableName("tb_base_label")
public class Label implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 标签ID
	 */
	@TableId
	private String id;
	/**
	 * 标签名称
	 */
	private String labelname;
	/**
	 * 状态
	 */
	private String state;
	/**
	 * 使用数量
	 */
	private Long count;
	/**
	 * 是否推荐
	 */
	private String recommend;
	/**
	 * 粉丝数
	 */
	private Long fans;

}
