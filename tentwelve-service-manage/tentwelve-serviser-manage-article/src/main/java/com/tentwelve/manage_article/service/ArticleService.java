package com.tentwelve.manage_article.service;

import com.tentwelve.entity.article.Article;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tentwelve.manage_article.mapper.ArticleMapper;
import com.tentwelve.model.response.CommonCode;
import com.tentwelve.model.response.QueryResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 文章
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 18:45:16
 */
@Service
public class ArticleService {

    @Autowired
    private ArticleMapper articleMapper;


    public QueryResponseResult queryPage(Integer size, Integer current,Article article){
        IPage<Article> articleIPage = articleMapper.selectPage(new Page(current,size), new QueryWrapper<>(article));
        return new QueryResponseResult(CommonCode.SUCCESS,articleIPage) ;
    }

}

