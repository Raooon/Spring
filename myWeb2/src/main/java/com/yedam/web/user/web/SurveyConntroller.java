package com.yedam.web.user.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.yedam.web.user.dao.Question;
import com.yedam.web.user.dao.Survey;

@Controller
public class SurveyConntroller {
	
	// 설문조사 페이지
	@GetMapping("survey")
	public String surveyForm(Model model) {
		// 나중에는 문제를 db에서 가지고 온다.
		Question q1 = new Question("당신의 역할은", Arrays.asList("server", "front", "fullstack"));
		Question q2 = new Question("개발도구는", Arrays.asList("eclipse", "intellij", "subime"));
		Question q3 = new Question("하고싶은 말은", null);
		
		List<Question> questions = Arrays.asList(q1,q2,q3);
		
		model.addAttribute("questions", questions);
		return "register/surveyForm";
	}

	// 설문 응답 처리
	@PostMapping("survey")
	public String survey(@ModelAttribute("svy") Survey su) {
		System.out.println(su);
		return "register/submitted";
	}
}
