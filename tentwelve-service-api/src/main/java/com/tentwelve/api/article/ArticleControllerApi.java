package com.tentwelve.api.article;

import com.tentwelve.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.tentwelve.entity.article.Article;



/**
 * 文章
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 18:45:16
 */

@Api(value="文章操作接口",description = "提供文章CRUD")
public interface ArticleControllerApi {

    @ApiOperation("分页查询")
    public QueryResponseResult queryPage(Integer size, Integer current, Article article) ;


}
