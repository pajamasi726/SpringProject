package com.mvc.board.db;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mvc.board.DAO.BoardDAO;
import com.mvc.board.DTO.BoardDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class BoardDAOTest {

	@Inject
	private BoardDAO dao;
	
	@Test
	public void testCreate() throws Exception
	{
		BoardDTO dto = new BoardDTO();
		dto.setTitle("Junit title");
		dto.setContent("Junit Content");
		dto.setWriter("junit writer");
		dao.create(dto);
	}
	
	@Test
	public void testRead() throws Exception
	{
		System.out.println("게시물의 내용 : "+dao.read(3).toString());
	}
	
	@Test
	public void testUpdate() throws Exception
	{
		BoardDTO dto = new BoardDTO();
		dto.setBno(3);
		dto.setTitle("수정한 글입니다");
		dto.setContent("수정한 내용입니다");
		
		dao.update(dto);
	}
	
	@Test
	public void testDelete() throws Exception
	{
		dao.delete(4);
	}
	
	
	
	
}
