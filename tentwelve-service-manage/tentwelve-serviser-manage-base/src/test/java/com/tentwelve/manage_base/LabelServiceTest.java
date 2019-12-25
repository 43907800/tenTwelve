package com.tentwelve.manage_base;

import com.tentwelve.framework.entity.base.Label;
import com.tentwelve.manage_base.service.LabelService;
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
    public void testFindAll(){
        List<Label> all = LabelService.findAll();
        System.out.println(all);
    }

}
