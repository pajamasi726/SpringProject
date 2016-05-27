package com.mvc.board.DAO;

import java.util.List;

import com.mvc.board.DTO.BoardDTO;
import com.mvc.board.DTO.Criteria;

public interface BoardDAO {
	
	// 게시글 생성
	public void create(BoardDTO dto) throws Exception;

	// 게시글 읽기
	public BoardDTO read(Integer bno)throws Exception;
	
	// 게시글 수정 
	public void update(BoardDTO dto)throws Exception;
	
	// 게시글 삭제
	public void delete(Integer bno)throws Exception;
	
	// 전체 리스트
	public List<BoardDTO>listAll()throws Exception;
	
	// 페이지 처리
	public List<BoardDTO> listPage(int Page)throws Exception;
	
	// 페이지 처리
	public List<BoardDTO> listCriteriaPage(Criteria cri)throws Exception;
}
