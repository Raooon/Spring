package com.yedam.web.board.dao;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class Comments {
	String seq;
	String name;
	String content;
	String boardNo;
	@DateTimeFormat(pattern = "yyyy-MM-dd")		// 파라미터를 필드에 담는 용도
	@JsonFormat(pattern = "yyyy-MM-dd")	//결과 json
	Date regdate;
}
