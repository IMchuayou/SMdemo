package com.example.demo;

import com.example.demo.bean.Department;
import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void testInsert(){
        User user = new User();
        user.setAge(11);
        user.setEmail("2500@1.com");
        user.setName("chen");

        Department department = new Department();
        department.setName("研发部");
        userService.insert(user,department);
    };

}
