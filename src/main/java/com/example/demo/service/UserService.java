package com.example.demo.service;

import com.example.demo.bean.Department;
import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserService {

    @Autowired
    UserMapper mapper;

    @Autowired
    DepartmentService departmentService;

    @Transactional
    public void  insert(User user, Department department){
         mapper.insert(user);

        departmentService.insert(department);

    }

}
