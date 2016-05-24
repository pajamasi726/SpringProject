package com.mvc.board.db;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mvc.board.DAO.MemberDAO;
import com.mvc.board.DTO.MemberDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest {

	
	@Inject
	private MemberDAO  dao;
	
	@Test
	public void testTime()
	{
		System.out.println(dao.getTime());
	}
	
	@Test
	public void testInsertMember()
	{
		MemberDTO dto = new MemberDTO();
		
		dto.setUserid("user00");
		dto.setUserpw("user00");
		dto.setUsername("pajamasi");
		dto.setEmail("pajamasi@naver.com");
		
		dao.insertMember(dto);
	}
}
