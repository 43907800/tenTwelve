package com.tentwelve.manage_article.controller;

import com.tentwelve.api.article.ArticleChannelControllerApi;
import com.tentwelve.api.article.ArticleColumnControllerApi;
import com.tentwelve.api.base.BaseLabelControllerApi;
import com.tentwelve.model.response.QueryResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tentwelve.entity.article.ArticleChannel;
import com.tentwelve.manage_article.service.ArticleChannelService;



/**
 * 频道
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 18:45:16
 */
@RestController
@RequestMapping("article/articlechannel")
public class ArticleChannelController implements ArticleChannelControllerApi {
    @Autowired
    private ArticleChannelService articleChannelService;


    /**
    *  分页查询
    * @param size 页面大小
    * @param current 当前页
    * @param  articleChannel
    * @return
    */
    @Override
    @RequestMapping(method = RequestMethod.GET)
    public QueryResponseResult queryPage(@RequestParam(defaultValue = "10") Integer size ,@RequestParam
            (defaultValue="1") Integer current, ArticleChannel articleChannel) {
        return articleChannelService.queryPage( size, current, articleChannel);
    }


}
