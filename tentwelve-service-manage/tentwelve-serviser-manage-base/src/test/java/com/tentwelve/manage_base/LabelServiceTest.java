package com.tentwelve.manage_base;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tentwelve.entity.base.Label;
import com.tentwelve.manage_base.service.LabelService;
import com.tentwelve.model.response.QueryResponseResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author Administrator
 * @version 1.0
 * @create 2018-09-12 18:11
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class LabelServiceTest {

    @Autowired
    LabelService LabelService;

    @Test
    public void selectPage(){
        Page page = new Page();
        page.setSize(2);
        page.setCurrent(2);
        QueryResponseResult result = LabelService.selectPage(page);
        System.out.println(result);
    }

}
