package com.smhrd.db;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.model.MemberVO;


public class DAO {

	// 연결 객체를 빌려줄 수 있는 sqlSessionFactory 선언
	
	private SqlSessionFactory factory = SqlSessionManager.getFactory();
	
	public int join(MemberVO vo) {
		
		// 1. 연결객체 생성하기(사실 빌려오는거임ㅇㅇ)
		// openSession(true) --> autocommit / (false) --> commit 코드 작성
		SqlSession sqlsession = factory.openSession(true); // 쿠키와 세션 그거 아님 
		
		// 2. 연결객체 사용하기
		// row -> table에 영향을 받은 행의 개수
		int row = sqlsession.insert("join", vo);
		
		// 3. 연결객체 다시 반납하기
		sqlsession.close();
		
		// 4. 결과값(row) 반환하기
		return row;
	}

	
	
	public MemberVO login(MemberVO vo) {
		// 1. 연결객체 빌려오기
		SqlSession sqlSession = factory.openSession(); // 커밋필요 없기 때문에 매개변수 필요ㄴㄴ
		
		
		// 2. 연결객체 사용하기		
		// String c = sqlSession.selectOne("check", vo);
		
		// < > : 제네릭기법 : 클래스 내부에서 사용하게 될 자료형을 다른 클래스(바깥쪽)에서 지정해주는 기법 
		// 제네릭 기법 : 어떤 자료형이 들어와도 ㄱㅊㄱㅊ
		// 오브젝트 : 자료형 지정됨
		MemberVO result = sqlSession.selectOne("login", vo);
		
		
		// 3. 연결객체 반납하기
		sqlSession.close();
		
		
		// 4. 결과 반환하기
		return result; //????

	}

//	public int login(MemberVO vo2) {
//		SqlSession sqlsession = factory.openSession(true); // 쿠키와 세션 그거 아님 
//		int row = sqlsession.selectOne("check", vo2);
//		sqlsession.close();
//		return row;
//	}

}
