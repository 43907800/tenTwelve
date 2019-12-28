package com.tentwelve.entity.base;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 城市
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 18:00:21
 */
@Data
@TableName("tb_base_city")
public class BaseCity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId(type = IdType.ID_WORKER_STR)
	private String id;
	/**
	 * 城市名称
	 */
	private String name;
	/**
	 * 是否热门
	 */
	private String ishot;

}
