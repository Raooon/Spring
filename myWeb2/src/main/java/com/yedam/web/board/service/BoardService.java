package com.yedam.web.board.service;

import java.util.List;

import com.yedam.web.board.dao.Board;
import com.yedam.web.board.dao.BoardSearch;

public interface BoardService {
	
	boolean insert(Board board);
	List<Board> find(BoardSearch board);
	Board findById(String no);
	int delete(String no);
	boolean update(Board board);
}
