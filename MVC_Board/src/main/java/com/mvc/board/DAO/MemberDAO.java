package com.mvc.board.DAO;

import com.mvc.board.DTO.MemberDTO;

public interface MemberDAO {
	
	public String getTime();
	
	public void insertMember(MemberDTO dto);

}
