package com.tentwelve.manage_base.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tentwelve.entity.base.Label;
import com.tentwelve.model.response.CommonCode;
import com.tentwelve.model.response.QueryResponseResult;
import com.tentwelve.manage_base.mapper.Labelmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author: Yinn
 * @Date:Create: in 2019/12/24 4:28 下午
 * @Description:
 */

@Service
public class LabelService {

    @Autowired
    Labelmapper labelmapper;

    public QueryResponseResult queryPage(Integer size, Integer current,Label label){
        IPage<Label> labelIPage = labelmapper.selectPage(new Page(current,size), new QueryWrapper<>(label));
        return new QueryResponseResult(CommonCode.SUCCESS,labelIPage) ;
    }


}
