package com.tentwelve.manage_article.controller;

import com.tentwelve.api.article.ArticleControllerApi;
import com.tentwelve.api.base.BaseLabelControllerApi;
import com.tentwelve.model.response.QueryResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tentwelve.entity.article.Article;
import com.tentwelve.manage_article.service.ArticleService;



/**
 * 文章
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 18:45:16
 */
@RestController
@RequestMapping("article/article")
public class ArticleController  implements ArticleControllerApi {
    @Autowired
    private ArticleService articleService;


    /**
    *  分页查询
    * @param size 页面大小
    * @param current 当前页
    * @param  article
    * @return
    */
    @Override
    @RequestMapping(method = RequestMethod.GET)
    public QueryResponseResult queryPage(@RequestParam(defaultValue = "10") Integer size ,@RequestParam
            (defaultValue="1") Integer current, Article article) {
        return articleService.queryPage( size, current, article);
    }


}
