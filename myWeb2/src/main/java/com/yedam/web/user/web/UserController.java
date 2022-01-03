package com.yedam.web.user.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yedam.web.user.dao.User;

@Controller
public class UserController {

	@GetMapping("step1")
	public String step1() {
		return "register/step1"; 
	}
	
	@PostMapping("step2")
	public String step2(@RequestParam(required = false, defaultValue = "false")boolean agree) {
		if(agree)
			return "register/step2";
		else
			return "redirect:step1"; 
					// redirect는 파일을 찾아가는 것이 아닌 Mapping URL step1을 찾아간다.
	}
	
	@PostMapping("step3")
	public String step3(User user, Model model) {
		if(user.getPassword().equals(user.getCheckPassword())) 
			// password와 checkpassword가 일치한다면
			return "register/step3";
		else
			// 패스워드가 일치하지 않으면 step2
			model.addAttribute("msg", "패스워드 불일치");
			
			//굳이 담지않더라도 model에 커맨드 객체가 자동적으로 들어간다.
			//return "redirect:step2";  <-- get일 때 사용가능하다. 
			return "register/step2";
	}
}
