package com.yedam.web.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yedam.web.board.dao.Board;
import com.yedam.web.board.dao.BoardMapper;
import com.yedam.web.board.dao.BoardSearch;
import com.yedam.web.board.dao.CommentsMapper;
import com.yedam.web.board.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired BoardMapper mapper;
	@Autowired CommentsMapper commentsMapper;
	
	@Override
	public boolean insert(Board board) {
		Board bo = new Board();
		bo.setTitle(board.getTitle());
		bo.setContents(board.getContents());
		bo.setWriter(board.getWriter());
		int result = mapper.insert(bo);
		return result == 1? true : false;
	}

	@Override
	public List<Board> find(BoardSearch board) {
		return mapper.find(board);
	}

	@Override
	public Board findById(String no) {
		return mapper.findById(no);
	}

	@Override
	@Transactional
	public int delete(String no) {
		commentsMapper.deleteByBoard(no);
		return mapper.delete(no);
	}

	@Override
	public boolean update(Board board) {
		Board bo = new Board();
		bo.setTitle(board.getTitle());
		bo.setContents(board.getContents());
		bo.setNo(board.getNo());
		int result = mapper.update(bo);
		return result == 1? true : false;
	}

}
