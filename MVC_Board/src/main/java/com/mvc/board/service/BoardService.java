package com.mvc.board.service;

import java.util.List;

import com.mvc.board.DTO.BoardDTO;
import com.mvc.board.DTO.Criteria;

public interface BoardService {
	// 게시글 생성
	public void create(BoardDTO dto) throws Exception;

	// 게시글 읽기
	public BoardDTO read(Integer bno) throws Exception;

	// 게시글 수정
	public void update(BoardDTO dto) throws Exception;

	// 게시글 삭제
	public void delete(Integer bno) throws Exception;

	// 전체 리스트
	public List<BoardDTO> listAll() throws Exception;
	
	public List<BoardDTO> listCriteria(Criteria cri)throws Exception;
}
