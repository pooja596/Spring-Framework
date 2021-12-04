package com.learner.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("allGettersInBasePackage()")
	public void loggingAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint.getTarget());
		/*
		 * System.out.println(joinPoint.getKind());
		 * System.out.println(joinPoint.getArgs());
		 */
		System.out.println("Logging advice run. Get method called");
	}
	
	@Before("allCircleMethods()")
	public void secondloggingAdvice() {
		System.out.println("Logging advice 2 run.");
	}
	
	@After("allCircleMethods()")
	public void afterloggingAdvice() {
		System.out.println("afterloggingAdvice run.");
	}
	
	@AfterReturning(pointcut = "execution(public * com.learner.model.Circle.setNameAndReturn(..))" , returning = "name")
	public void afterReturningloggingAdvice(String name) {
		System.out.println("afterReturningloggingAdvice run. " + name);
	}
	
	@AfterThrowing(pointcut = "execution(public * com.learner.model.Circle.setRadiousAndThrowException(..))" , throwing = "exception")
	public void exceptionAdvice(Exception exception) {
		System.out.println("exceptionAdvice run. " + exception);
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
	
	@Pointcut("within(com.learner.model..*)")
	public void allCircleMethods() {
	}	

}
