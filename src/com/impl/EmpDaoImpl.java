package com.impl;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dao.EmpDao;
import com.entity.Emp;

public class EmpDaoImpl implements EmpDao {
	// �̳У�ʵ�־������
	@Override
	public List<Emp> selectAll() {
		// ���������ļ�������session�ֿ⣬��������������֮����д���ķ�װ���Ż����룬ʵ������
		String resource = "mybatis-config.xml";
		Reader reader = null;
		SqlSessionFactory factory = null;
		SqlSession session = null;
		List<Emp> list = new ArrayList<Emp>();
		try {
			reader = Resources.getResourceAsReader(resource);
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			factory = builder.build(reader);
			session = factory.openSession();
			// ִ�в�������Ӧӳ���ļ������id--selectAll
			// session.��ķ�����selectOne,insert�ȣ���Ӧ��ͬ�����ݲ���������Ƕ�����ԭ��������Ӱ��Ĳ�������Ҫ֮�����session.commit();
			list = session.selectList("com.dao.EmpDao.selectAll");
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
}