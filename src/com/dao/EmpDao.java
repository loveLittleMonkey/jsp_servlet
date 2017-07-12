package com.dao;

import java.util.List;

import com.entity.Emp;

public interface EmpDao {
    //创建全选数据库的数据，返回值类型是以List储存的Emp对象的集合
    public List<Emp> selectAll();
}