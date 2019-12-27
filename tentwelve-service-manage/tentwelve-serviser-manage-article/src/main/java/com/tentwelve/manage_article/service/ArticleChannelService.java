package com.tentwelve.manage_article.service;

import com.tentwelve.entity.article.ArticleChannel;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tentwelve.manage_article.mapper.ArticleChannelMapper;
import com.tentwelve.model.response.CommonCode;
import com.tentwelve.model.response.QueryResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 频道
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 18:45:16
 */
@Service
public class ArticleChannelService {

    @Autowired
    private ArticleChannelMapper articleChannelMapper;


    public QueryResponseResult queryPage(Integer size, Integer current,ArticleChannel articleChannel){
        IPage<ArticleChannel> articleChannelIPage = articleChannelMapper.selectPage(new Page(current,size), new QueryWrapper<>(articleChannel));
        return new QueryResponseResult(CommonCode.SUCCESS,articleChannelIPage) ;
    }

}

