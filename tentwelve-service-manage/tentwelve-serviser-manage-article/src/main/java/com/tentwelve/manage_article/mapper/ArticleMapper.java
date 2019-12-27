package com.tentwelve.manage_article.mapper;

import com.tentwelve.entity.article.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文章
 * 
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 18:45:16
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
	
}
