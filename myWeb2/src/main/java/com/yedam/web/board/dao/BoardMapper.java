package com.yedam.web.board.dao;

import java.util.List;

public interface BoardMapper {
	
	int insert(Board board);
	List<Board> find(BoardSearch board);
	Board findById(String no);
	int delete(String no);
	int update(Board board);
	
	int findTotal(Board board);
}
