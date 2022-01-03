package com.yedam.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration({"/config/common-context.xml"})
public class TvUserClient {

	@Autowired TV tv;	//Injection(주입) 컨테이너에서 인터페이스 구현클래스를 찾아서
	@Test
	public void getTv() {
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}
