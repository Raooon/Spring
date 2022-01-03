package com.yedam.app.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ExeTimeAspect {
	@Around("LogAspect.allpointcut()")
	public Object measure(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.nanoTime();
		
		System.out.println("[around] 실행전");
		Object result = pjp.proceed(); //서비스메서드 호출
		
		long finish = System.nanoTime();
		System.out.println("[around] 실행시간 :" + (finish - start));
		return result;
	}
}
