package com.mvc.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mvc.board.DAO.BoardDAO;
import com.mvc.board.DTO.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService{

	@Inject
	private BoardDAO dao;
	
	@Override
	public void create(BoardDTO dto) throws Exception {
		dao.create(dto);
	}

	@Override
	public BoardDTO read(Integer bno) throws Exception {
		return dao.read(bno);
	}

	@Override
	public void update(BoardDTO dto) throws Exception {
		dao.update(dto);
	}

	@Override
	public void delete(Integer bno) throws Exception {
		dao.delete(bno);
	}

	@Override
	public List<BoardDTO> listAll() throws Exception {
		return dao.listAll();
	}
	
}
