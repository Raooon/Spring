package com.yedam.web.user.dao;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor		// 모든 인수를 가지는 생성자를 생성
@NoArgsConstructor		// 기본생성자 생성
public class Question {
	String title;
	List<String> options;
}
