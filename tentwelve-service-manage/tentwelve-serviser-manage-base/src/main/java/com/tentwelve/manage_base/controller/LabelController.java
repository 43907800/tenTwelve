package com.tentwelve.manage_base.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tentwelve.api.base.LabelControllerApi;
import com.tentwelve.entity.base.Label;
import com.tentwelve.model.response.QueryResponseResult;
import com.tentwelve.model.response.ResponseResult;
import com.tentwelve.manage_base.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 标签
 *
 * @author Yinn
 * @email Yinn
 * @date 2019-12-24 16:22:19
 */
@RestController
@RequestMapping("base/label")
public class LabelController implements LabelControllerApi {
    @Autowired
    private LabelService labelService;


    @Override
    @GetMapping("/queryPage")
    public QueryResponseResult queryPage(@RequestParam Integer size,@RequestParam Integer current, Label label) {
        return labelService.queryPage( size, current, label);
    }

}
