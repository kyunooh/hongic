package org.jellydiss.hongic.configuration;


import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisConfig {
	
	public static String resource = "org/jellydiss/hongic/configuration/myBatisConfig.xml";
	
	private static SqlSessionFactory sqlSessionFactory = null;
	
	
	public static SqlSessionFactory getSqlSessionFactory() {
		if(sqlSessionFactory == null){
			initSqlSessionFactory();
		}
		return sqlSessionFactory;
	}
	
	private static void initSqlSessionFactory() {
		try{
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
	
}
