package com.yedam.web.user.dao;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class ListCommand {

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate from;		//Date
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate to;
	
	
}
