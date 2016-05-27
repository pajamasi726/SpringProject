package com.mvc.board.db;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mvc.board.BoardController;
import com.mvc.board.DAO.MemberDAO;
import com.mvc.board.DTO.MemberDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
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
		
		dto.setUserid("user01");
		dto.setUserpw("user01");
		dto.setUsername("pajamasi");
		dto.setEmail("pajamasi@naver.com");
		
		dao.insertMember(dto);
	}

}
