package com.yedam.web.board.service;

import java.util.List;

import com.yedam.web.board.dao.Comments;

public interface CommentsService {

	List<Comments> find(Comments comments);
	Comments findById(Comments comments);
	int insert(Comments comments);
	int update(Comments comments);
	int delete(String seq);
}
