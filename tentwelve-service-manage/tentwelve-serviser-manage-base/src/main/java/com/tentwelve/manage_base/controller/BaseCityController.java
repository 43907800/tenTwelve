package com.tentwelve.manage_base.controller;

import java.util.Arrays;
import java.util.Map;

import com.tentwelve.api.base.BaseCityControllerApi;
import com.tentwelve.model.response.QueryResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tentwelve.entity.base.BaseCity;
import com.tentwelve.manage_base.service.BaseCityService;



/**
 * 城市
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 18:00:21
 */
@RestController
@RequestMapping("base/basecity")
public class BaseCityController implements BaseCityControllerApi {
    @Autowired
    private BaseCityService baseCityService;


    /**
    *  分页查询
    * @param size 页面大小
    * @param current 当前页
    * @param  baseCity
    * @return
    */
    @Override
    @RequestMapping(method = RequestMethod.GET)
    public QueryResponseResult queryPage(@RequestParam(defaultValue = "10") Integer size , @RequestParam
            (defaultValue="1") Integer current, BaseCity baseCity) {
        return baseCityService.queryPage( size, current, baseCity);
    }


}
