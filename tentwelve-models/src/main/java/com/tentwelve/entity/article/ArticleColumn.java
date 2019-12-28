package com.tentwelve.entity.article;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 专栏
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 18:45:16
 */
@Data
@TableName("tb_article_column")
public class ArticleColumn implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId(type = IdType.ID_WORKER_STR)
	private String id;
	/**
	 * 专栏名称
	 */
	private String name;
	/**
	 * 专栏简介
	 */
	private String summary;
	/**
	 * 用户ID
	 */
	private String userid;
	/**
	 * 申请日期
	 */
	@TableField(fill = FieldFill.INSERT)
	private Date createtime;
	/**
	 * 审核日期
	 */
	private Date checktime;
	/**
	 * 状态
	 */
	private String state;

}
