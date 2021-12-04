package com.learner.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("allGettersInBasePackage()")
	public void loggingAdvice() {
		System.out.println("Logging advice run. Get method called");
	}

	/*
	 * Below point cut will be applied on all methods of Circle class inside
	 * com.learner.model package having name starting with 'get' 
	 * Modifier returnType packageName.ClassName having getAnyNameMethod 
	 * public * com.learner.model.Circle.get*()
	 */
	@Pointcut("execution(public * com.learner.model.Circle.get*())")
	public void allGettersInBasePackage() {
	}

}
