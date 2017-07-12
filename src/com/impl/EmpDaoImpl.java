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
	// 继承，实现具体操作
	@Override
	public List<Emp> selectAll() {
		// 加载配置文件，创建session仓库，可以在熟练掌握之后进行代码的封装，优化代码，实现重用
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
			// 执行操作，对应映射文件具体的id--selectAll
			// session.后的方法有selectOne,insert等，对应不同的数据操作，如果是对数据原本数据有影响的操作，需要之后加上session.commit();
			list = session.selectList("com.dao.EmpDao.selectAll");
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
}