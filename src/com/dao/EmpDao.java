package com.dao;

import java.util.List;

import com.entity.Emp;

public interface EmpDao {
    //����ȫѡ���ݿ�����ݣ�����ֵ��������List�����Emp����ļ���
    public List<Emp> selectAll();
}