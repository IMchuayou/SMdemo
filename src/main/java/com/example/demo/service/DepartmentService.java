package com.example.demo.service;

import com.example.demo.bean.Department;
import com.example.demo.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapper mapper;

    @Transactional
    public void insert(Department department){
        mapper.insert(department);
    }
}
