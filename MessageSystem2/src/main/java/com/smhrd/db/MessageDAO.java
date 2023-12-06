package com.smhrd.db;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class MessageDAO {

	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getFactory();
	
	// 메시지 전체 삭제
	public int deleteMessageAll(String email) {
		
		SqlSession session = sqlSessionFactory.openSession(true);
		int cnt = session.delete("deleteMessageAll", email);
		session.close();		
		
		return cnt;
	}
}
