package com.smhrd.db;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

 /*  * * * * * * *경로 수정 가능!!!! 나머지 코드는 고치지 말자!!!!* * * * * * *  */
public class SqlSessionManager {
	
	public static SqlSessionFactory sqlSessionFactory;

	
	// 생성자와 같은 역할 // new 키워드로 생성되는게 아니라 코드가 실행될 때 가장 먼저 실행됨!!
	// new SqlSessionManager() --> 이 때 실행되는 게 생성자
	// static{} 가장 먼저 실행되는 코드 예) Arrays.toString();
	static {
		// 1. Mybatis 환경설정 파일 경로 선언
		String resource = "com/smhrd/db/mybatis-config.xml";
		
		// 2. 읽을 수 있는 통로 하나 선언
		InputStream inputStream;
		try {
			// 3. 파일을 읽어서 inputStream 생성
			inputStream = Resources.getResourceAsStream(resource);
			
			// 4. DBCP (==sqlSessionFactory) 생성
			// connection == sqlSession
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}//try-catch
		
	}//static
	
	public static SqlSessionFactory getFactory() {
		return sqlSessionFactory;
	}
	
}
