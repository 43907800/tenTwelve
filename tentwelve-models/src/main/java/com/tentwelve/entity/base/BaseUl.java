package com.tentwelve.entity.base;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-25 19:11:19
 */
@Data
@TableName("tb_base_ul")
public class BaseUl implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String userid;
	/**
	 * 
	 */
	private String labelid;

}
