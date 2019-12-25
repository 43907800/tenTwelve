package com.tentwelve.framework.entity.base;

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
 * @date 2019-12-24 16:22:19
 */
@Data
@TableName("tb_base_city")
public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
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
