package com.yedam.web.board.dao;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class BoardSearch extends Board{
	int first;
	int last;
	String keyword;
	String gubun;
	@DateTimeFormat(pattern="yyyy-MM-dd") LocalDate from;
	@DateTimeFormat(pattern="yyyy-MM-dd") LocalDate to;
	
}
