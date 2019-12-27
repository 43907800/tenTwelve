package com.tentwelve.model.response;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Author: Yinn
 * @Date:Create: in 2019/12/23 10:55 上午
 * @Description:
 */

@Data
@ToString
public class QueryResponseResult<T> extends ResponseResult {

    Object data;

    public QueryResponseResult(ResultCode resultCode,QueryResult queryResult){
        super(resultCode);
        this.data = queryResult;
    }

    /**
     * 返回一个对象
     * @param resultCode 返回 代码
     * @param data 数据
     */
    public QueryResponseResult(ResultCode resultCode,Object data){
        super(resultCode);
        this.data = data;
    }

    /**
     * 返回分页数据
     * @param resultCode 返回 代码
     * @param page 分页对象
     */
    public QueryResponseResult(ResultCode resultCode, Page<T> page){
        super(resultCode);
        QueryResult<T> queryResult = new QueryResult<>();
        queryResult.setList(page.getRecords());
        queryResult.setTotal(page.getTotal());
        queryResult.setCurrent(page.getCurrent());
        queryResult.setPages(page.getPages());
        queryResult.setSize(page.getSize());
        this.data = queryResult;
    }

    /**
     * 返回list 集合数据
     * @param resultCode 返回 代码
     * @param list 数据
     */
    public QueryResponseResult(ResultCode resultCode, List<T> list){
        super(resultCode);
        QueryResult<T> queryResult = new QueryResult<>();
        queryResult.setList(list);
        this.data = queryResult;
    }

}
