package com.tentwelve.api.article;

import com.tentwelve.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.tentwelve.entity.article.ArticleChannel;



/**
 * 频道
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 18:45:16
 */

@Api(value="频道操作接口",description = "提供频道CRUD")
public interface ArticleChannelControllerApi {

    @ApiOperation("分页查询")
    public QueryResponseResult queryPage(Integer size, Integer current, ArticleChannel articleChannel) ;


}
