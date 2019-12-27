package com.tentwelve.manage_article.service;

import com.tentwelve.entity.article.ArticleColumn;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tentwelve.manage_article.mapper.ArticleColumnMapper;
import com.tentwelve.model.response.CommonCode;
import com.tentwelve.model.response.QueryResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 专栏
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 18:45:16
 */
@Service
public class ArticleColumnService {

    @Autowired
    private ArticleColumnMapper articleColumnMapper;


    public QueryResponseResult queryPage(Integer size, Integer current,ArticleColumn articleColumn){
        IPage<ArticleColumn> articleColumnIPage = articleColumnMapper.selectPage(new Page(current,size), new QueryWrapper<>(articleColumn));
        return new QueryResponseResult(CommonCode.SUCCESS,articleColumnIPage) ;
    }

}

