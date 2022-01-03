package com.yedam.web.user.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.web.user.dao.ListCommand;

@Controller
public class MemberListComtroller {

	@RequestMapping("members")
	public String members(ListCommand vo, Model model) {
		System.out.println(vo);
		model.addAttribute("from", vo.getFrom());
		model.addAttribute("to", vo.getTo());
		return "member/list";
	}
}
