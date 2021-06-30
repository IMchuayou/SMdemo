package com.example.demo.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Department {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;
}
