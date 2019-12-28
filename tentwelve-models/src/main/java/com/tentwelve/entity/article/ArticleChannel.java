package com.tentwelve.entity.article;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 频道
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 18:45:16
 */
@Data
@TableName("tb_article_channel")
public class ArticleChannel implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId(type = IdType.ID_WORKER_STR)
	private String id;
	/**
	 * 频道名称
	 */
	private String name;
	/**
	 * 状态
	 */
	private String state;

}
