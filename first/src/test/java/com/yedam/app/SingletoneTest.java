package com.yedam.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration({"/config/*-context.xml"})
public class SingletoneTest {

	@Autowired TV tv1; // TV를 상속받은 구현 클래스 가져옴
	@Autowired TV tv2; 
	@Test
	public void test() {
		System.out.println(tv1 == tv2);
		tv1.volumeUp();
	}
}
