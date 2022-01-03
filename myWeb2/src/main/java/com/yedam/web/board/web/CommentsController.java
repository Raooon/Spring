package com.yedam.web.board.web;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.web.board.dao.Comments;
import com.yedam.web.board.service.CommentsService;

@RestController
public class CommentsController {

	@Autowired CommentsService service;
	
	// 조회
	@GetMapping("/comments/{boardNo}")
	public List<Comments> find(@PathVariable String boardNo, Comments comments) {
		comments.setBoardNo(boardNo);
		
		return service.find(comments);
	}
	
	// 등록
	@PostMapping("/comments")
	public Comments insert(Comments comments) {
		service.insert(comments);
		// ajax라 비동기이기 때문에 추가한 단건만 조회하더라도 전체목록에 단건이 추가된 것처럼 보일 수 있게된다.
		return service.findById(comments);	// 등록일자
	}
	// 수정
	@PutMapping("/comments")
	public Comments update(@RequestBody Comments comments) {
		service.update(comments);
		return service.findById(comments);
	}
	
	// 삭제
	@DeleteMapping("/comments/{seq}")
	public Map delete(@PathVariable String seq) {
		int cnt = service.delete(seq);
		return Collections.singletonMap("result", cnt);
	}
}
