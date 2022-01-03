package com.yedam.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // 컨테이너 빈등록 = <bean>
@Scope("prototype")
public class SamsungTV implements TV {

	Speaker speaker;
	
	public SamsungTV() {
		System.out.println("삼성 티비 기본생성자");
	}
	public SamsungTV(Speaker speaker) {
		super();
		this.speaker = speaker;
		System.out.println("삼성 스피커 기본생성자");
	}
	
	// setter위에 선호
	@Autowired // DI 컨테이너에서 빈을 찾아서 주입 = property
	@Qualifier("sony")	// component 여러개 사용시 어떤거 사용할지 선택
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	@Override
	public void powerOn() {
		System.out.println("SamsungTV powerOn");
	}
	@Override
	public void powerOff() {
		System.out.println("SamsungTV powerDown");
	}
	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}	
}
