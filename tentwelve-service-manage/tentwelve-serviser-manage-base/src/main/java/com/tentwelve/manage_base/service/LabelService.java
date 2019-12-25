package com.tentwelve.manage_base.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.Query;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tentwelve.entity.base.Label;
import com.tentwelve.model.response.CommonCode;
import com.tentwelve.model.response.QueryResponseResult;
import com.tentwelve.model.response.QueryResult;
import com.tentwelve.model.response.ResponseResult;
import com.tentwelve.manage_base.mapper.Labelmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: Yinn
 * @Date:Create: in 2019/12/24 4:28 下午
 * @Description:
 */

@Service
public class LabelService {

    @Autowired
    Labelmapper labelmapper;

    public QueryResponseResult selectPage(Page<Label> page){
      //  return labelmapper.selectList(new QueryWrapper<>());
        IPage<Label> labelIPage = labelmapper.selectPage(page, new QueryWrapper<>());
        QueryResult queryResult = new QueryResult();
        queryResult.setList(labelIPage.getRecords());
        return new QueryResponseResult(CommonCode.SUCCESS,queryResult) ;
    }


}
