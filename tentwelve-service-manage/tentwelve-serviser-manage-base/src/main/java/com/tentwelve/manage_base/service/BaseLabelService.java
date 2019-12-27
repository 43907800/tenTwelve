package com.tentwelve.manage_base.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tentwelve.entity.base.BaseLabel;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tentwelve.manage_base.mapper.BaseLabelMapper;
import com.tentwelve.model.response.CommonCode;
import com.tentwelve.model.response.QueryResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 标签
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 18:00:21
 */
@Service
public class BaseLabelService {

    @Autowired
    private BaseLabelMapper baseLabelMapper;


    public QueryResponseResult queryPage(Integer size, Integer current, BaseLabel baseLabel){
        IPage<BaseLabel> baseLabelIPage = baseLabelMapper.selectPage(new Page(current,size), new QueryWrapper<>(baseLabel));
        return new QueryResponseResult(CommonCode.SUCCESS,baseLabelIPage) ;
    }

}

