package com.tentwelve.model.response;

import lombok.Data;
import lombok.ToString;

/**
 * @Author: Yinn
 * @Date:Create: in 2019/12/23 10:55 上午
 * @Description:
 */

@Data
@ToString
public class QueryResponseResult extends ResponseResult {

    QueryResult queryResult;

    public QueryResponseResult(ResultCode resultCode,QueryResult queryResult){
        super(resultCode);
        this.queryResult = queryResult;
    }

}
