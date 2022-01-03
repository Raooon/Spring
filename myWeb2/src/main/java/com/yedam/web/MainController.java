package com.yedam.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//pojo 컨테이너에 빈 등록.
@Controller
public class MainController {

	@RequestMapping("/main")
	public String main( @RequestParam(value="id", required = false, defaultValue = "admin") String id,
						Model model, 
						HttpServletRequest request) {
		model.addAttribute("dept", "개발");
		model.addAttribute("id", id);
		request.setAttribute("name","길동");
		
		/*
		 * @RequestParam이 request.getParameter를 대신한다. 
		 * String id = request.getParameter("id"); 
		 * if(id2 == null) { id = "초기값";}
		 */
		return "main";
	}
	
}
