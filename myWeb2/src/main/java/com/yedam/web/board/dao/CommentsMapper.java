package com.yedam.web.board.dao;

import java.util.List;

public interface CommentsMapper {

	List<Comments> find(Comments comments);
	Comments findById(Comments comments);
	int insert(Comments comments);
	int update(Comments comments);
	int deleteByBoard(String boardNo);
	int delete(String seq);
	
}
