package com.yedam.web.board.dao;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Board {
	public String no;
	String title;
	String contents;
	String writer;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	LocalDate wdate;
	String replyCnt;
}
