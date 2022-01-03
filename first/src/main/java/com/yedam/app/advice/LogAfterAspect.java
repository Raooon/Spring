package com.yedam.app.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAfterAspect {
	@AfterReturning(pointcut = "LogAspect.allpointcut()", returning = "returning")
	public void logAfter(JoinPoint jp, Object returning) {
		String name = jp.getSignature().getName();
		System.out.printf("[after] %s %s\n", name, returning);
	}
}
