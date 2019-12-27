package com.tentwelve.manage_base;

import com.tentwelve.manage_base.service.BaseLabelService;
import com.tentwelve.model.response.QueryResponseResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class LabelServiceTest {

    @Autowired
    BaseLabelService LabelService;

    @Test
    public void selectPage(){
        QueryResponseResult result = LabelService.queryPage(2,2,null);
        System.out.println(result);
    }

}
