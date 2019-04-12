package com.sahara.demo_test;

import com.sahara.dao.UserMapper;
import com.sahara.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        String name = "Bob";
        String gender = "male";
        userMapper.addUser(name, gender);
        User user = userMapper.findUserByName(name);
        System.out.println(user.getName()+" "+user.getGender());
    }
}
