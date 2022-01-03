package com.yedam.web.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.web.board.dao.Comments;
import com.yedam.web.board.dao.CommentsMapper;
import com.yedam.web.board.service.CommentsService;

@Service
public class CommentsServiceImpl implements CommentsService{
	
	@Autowired CommentsMapper mapper;

	@Override
	public List<Comments> find(Comments comments) {
		return mapper.find(comments);
	}

	@Override
	public Comments findById(Comments comments) {
		return mapper.findById(comments);
	}

	@Override
	public int insert(Comments comments) {
		return mapper.insert(comments);
	}

	@Override
	public int update(Comments comments) {
		return mapper.update(comments);
	}

	@Override
	public int delete(String seq) {
		return mapper.delete(seq);
	}

}
