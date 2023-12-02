package com.sky;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.sky.entity.User;
import com.sky.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//t
@SpringBootTest
class EducationSystemApplicationTests {
    @Autowired
    UserService userService;

    @Test
    void getByUserName() {
        String username = "admin";
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(username!= null, User::getUsername,username);
        userService.getOne(queryWrapper);
    }

    @Test
    void pageTest(){

    }
}
