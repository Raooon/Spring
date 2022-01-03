package com.yedam.web.board.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.web.board.dao.Board;
import com.yedam.web.board.dao.BoardMapper;
import com.yedam.web.board.dao.BoardSearch;
import com.yedam.web.board.service.BoardService;
import com.yedam.web.common.Paging;

@Controller
@RequestMapping("/board/")
public class BoardController {
	
	@Autowired BoardService service;
	@Autowired BoardMapper mapper;
	
	@RequestMapping("list")
	//@PostMapping("/list")		--> 405 에러 발생
	// 브라우저에 입력 -> servlet-context 
	public String list(Model model, @ModelAttribute("search")BoardSearch board, Paging paging) {
//		return "board/list";
		// -> WEB-INF/views/ + board/list + .jsp
		
		paging.setPageUnit(5);
		paging.setTotalRecord(mapper.findTotal(board));
		board.setFirst(paging.getFirst());
		board.setLast(paging.getLast());
		model.addAttribute("list", service.find(board));
		//model.addAttribute("paging", paging);
		return "tiles/board/list";
	}
	
	// 등록페이지로 가는 요청
	// @RequestMapping(value = "insert", method = RequestMethod.GET)
	@GetMapping("insert")
	public String insertForm() {
		return "tiles/board/insert";	// forward
	}
	
	// 등록처리 (커맨드 객체 : 파라미터를 받는 객체)
	@PostMapping("insert")
	public String insertProc(Board board) {
		//db insert
		service.insert(board);
//		System.out.println(board);
		//response.sendRedirect("")
//		return "/board/list";
		return "redirect:list";
				
		// redirect는 requestMapping을 찾아간다.
		
		// 				forward vs redirect
		// URL 변화여부 		X			O
		// 객체 재사용 여부		O			X
	}
	
	//상세보기
	@RequestMapping("detail/{no}")
	public String select(Model model, @PathVariable String no, HttpServletRequest request) {
//		System.out.println(no);
		model.addAttribute("board", service.findById(no));
//		System.out.println(request.getContextPath()); 
		
		return "tiles/board/detail";
	}
	
	// 삭제처리
	@PostMapping("delete")
	public String delete(Board board, HttpServletRequest request) {
		System.out.println(board.no);
		service.delete(board.no);
		return "redirect:list";
	}
	
	// 수정처리
	@PostMapping("update")
	public String update(Board board, HttpServletRequest request) {
		System.out.println(board);
		service.update(board);
		/* return "tiles/board/list"; */
		return "redirect:list";
	}
}
