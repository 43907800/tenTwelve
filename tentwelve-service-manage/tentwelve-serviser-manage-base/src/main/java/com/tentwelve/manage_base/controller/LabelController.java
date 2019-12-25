package com.tentwelve.manage_base.controller;

import com.tentwelve.api.base.LabelControllerApi;
import com.tentwelve.framework.entity.base.Label;
import com.tentwelve.framework.model.response.ResponseResult;
import com.tentwelve.manage_base.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    @GetMapping("findall")
    public List<Label> findAll() {
        return labelService.findAll();
    }

}
