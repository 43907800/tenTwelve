package com.tentwelve.manage_base.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tentwelve.entity.base.BaseCity;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tentwelve.manage_base.mapper.BaseCityMapper;
import com.tentwelve.model.response.CommonCode;
import com.tentwelve.model.response.QueryResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 城市
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 18:00:21
 */
@Service
public class BaseCityService {

    @Autowired
    private BaseCityMapper baseCityMapper;


    public QueryResponseResult queryPage(Integer size, Integer current, BaseCity baseCity){
        IPage<BaseCity> baseCityIPage = baseCityMapper.selectPage(new Page(current,size), new QueryWrapper<>(baseCity));
        return new QueryResponseResult(CommonCode.SUCCESS,baseCityIPage) ;
    }

}

