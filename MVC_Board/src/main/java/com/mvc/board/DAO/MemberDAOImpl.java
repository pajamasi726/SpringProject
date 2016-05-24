package com.mvc.board.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.board.DTO.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Autowired
	private SqlSession sqlSession;
	
	// memberMapper.xml�� �ۼ��� ���ӽ����̽��� ���� �ش� .
	private static final String namespace = "com.mvc.mapper.memberMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime");
	}

	@Override
	public void insertMember(MemberDTO dto) {
		sqlSession.insert(namespace+".insertMember", dto);
	}

}
