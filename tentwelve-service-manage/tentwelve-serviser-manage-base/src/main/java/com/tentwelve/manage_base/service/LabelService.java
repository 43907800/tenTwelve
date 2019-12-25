package com.tentwelve.manage_base.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tentwelve.framework.entity.base.Label;
import com.tentwelve.manage_base.mapper.Labelmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Yinn
 * @Date:Create: in 2019/12/24 4:28 下午
 * @Description:
 */

@Service
public class LabelService {

    @Autowired
    Labelmapper labelmapper;

    public List<Label> findAll(){
        return labelmapper.selectList(new QueryWrapper<>());
    }
}
