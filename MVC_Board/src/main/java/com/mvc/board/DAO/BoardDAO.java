package com.mvc.board.DAO;

import java.util.List;

import com.mvc.board.DTO.BoardDTO;

public interface BoardDAO {
	
	// �Խñ� ����
	public void create(BoardDTO dto) throws Exception;

	// �Խñ� �б�
	public BoardDTO read(Integer bno)throws Exception;
	
	// �Խñ� ���� 
	public void update(BoardDTO dto)throws Exception;
	
	// �Խñ� ����
	public void delete(Integer bno)throws Exception;
	
	// ��ü ����Ʈ
	public List<BoardDTO>listAll()throws Exception;
}
