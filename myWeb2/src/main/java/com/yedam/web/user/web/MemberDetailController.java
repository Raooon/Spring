package com.yedam.web.user.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MemberDetailController {
	
//	@GetMapping("members/{id}/{email}")		//?id=park&email=
	@GetMapping("members/{id}")
	public String detail(@PathVariable Long id, 
//						 @PathVariable String email,
						 Model model) throws Exception {
		model.addAttribute("id", id);
		if(id<10) {
			throw new MemberNotFoundException();	//Exception
		} else if(id < 20) {
			throw new TypeMismatchException();
		}
//		model.addAttribute("email", email);
		return "member/detail";
	}
	
	/*
	 * @ExceptionHandler(MemberNotFoundException.class) public String
	 * memberNotFoundException() { return "member/noMember"; }
	 * 
	 * @ExceptionHandler(TypeMismatchException.class) public String
	 * TypeMismatchException() { return "member/invalidate"; }
	 */
	// Exception Controller를 모아둘 수 있다. : ControllerAdvice
}
