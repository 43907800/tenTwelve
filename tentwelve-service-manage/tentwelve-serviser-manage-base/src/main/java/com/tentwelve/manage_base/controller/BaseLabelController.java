package com.tentwelve.manage_base.controller;



import com.tentwelve.api.base.BaseLabelControllerApi;
import com.tentwelve.model.response.QueryResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tentwelve.entity.base.BaseLabel;
import com.tentwelve.manage_base.service.BaseLabelService;



/**
 * 标签
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-27 18:00:21
 */
@RestController
@RequestMapping("base/baselabel")
public class BaseLabelController implements BaseLabelControllerApi {
    @Autowired
    private BaseLabelService baseLabelService;


    /**
    *  分页查询
    * @param size 页面大小
    * @param current 当前页
    * @param  baseLabel
    * @return
    */
    @Override
    @RequestMapping(method = RequestMethod.GET)
    public QueryResponseResult queryPage(@RequestParam(defaultValue = "10") Integer size , @RequestParam
            (defaultValue="1") Integer current, BaseLabel baseLabel) {
        return baseLabelService.queryPage( size, current, baseLabel);
    }


}
