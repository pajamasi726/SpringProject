package com.mvc.board.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mvc.board.DTO.BoardDTO;
import com.mvc.board.DTO.Criteria;

@Repository
public class BoardDAOImpl implements BoardDAO{

	@Inject
	private SqlSession session;
	
	private final static String namespace = "com.mvc.mapper.boardMappers";
	
	@Override
	public void create(BoardDTO dto) throws Exception {
		session.insert(namespace+".create", dto);
	}

	@Override
	public BoardDTO read(Integer bno) throws Exception {
		return session.selectOne(namespace+".read", bno);
	}

	@Override
	public void update(BoardDTO dto) throws Exception {
		session.update(namespace+".update",dto);
	}

	@Override
	public void delete(Integer bno) throws Exception {
		session.delete(namespace+".delete", bno);
	}

	@Override
	public List<BoardDTO> listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}

	@Override
	public List<BoardDTO> listPage(int page) throws Exception {
		
		if(page < 0)
			page = 1;
	
		page = (page -1 ) * 10;
		
		return session.selectList(namespace+".listPage",page);
	}
	
	@Override
	public List<BoardDTO> listCriteriaPage(Criteria cri) throws Exception {
		
		return session.selectList(namespace+".listPage", cri);
	}

}
