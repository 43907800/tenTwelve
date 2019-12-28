package com.tentwelve.manage_user;

import com.tentwelve.entity.base.BaseLabel;
import com.tentwelve.entity.user.User;
import com.tentwelve.manage_user.service.UserService;
import com.tentwelve.model.response.ResponseResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Yinn
 * @Date:Create: in 2019/12/28 10:33 下午
 * @Description:
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserTest {

    @Autowired
    UserService userService;

    @Test
    public void save(){
        User user = new User();
        user.setNickname("张三");
        user.setLoginname("zhangsan");
        ResponseResult save = userService.save(user);
    }
}
