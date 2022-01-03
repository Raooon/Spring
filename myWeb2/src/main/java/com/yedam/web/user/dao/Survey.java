package com.yedam.web.user.dao;

import java.util.List;

import lombok.Data;

@Data
public class Survey {

	List<String> response;
	// 여러개의 문항에 대한 답변을 리스트로 관리한다.
	Respondent respondent;
}
