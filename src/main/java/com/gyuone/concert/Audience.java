package com.gyuone.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	@Pointcut("execution(* com.gyuone.concert.Performance.perform(..))")
	public void performance() {}
	
	
//  @Before("execution(* com.gyuone.concert.Performance.perform(..))")
//	@Before("performance()")
//	public void silenceCellPhones() {
//		System.out.println("휴대폰은 꺼주세요!");
//	}
	
//	@Before("execution(* com.gyuone.concert.Performance.perform(..))")
//	@Before("performance()")
//	public void takeSeats() {
//		System.out.println("모두 자리에 앉아주세요!");
//	}
	
//	@AfterReturning("execution(* com.gyuone.concert.Performance.perform(..))")
//	@AfterReturning("performance()")
//	public void applause() {
//		System.out.println("박수~~~~~ 짝짝짝!!");
//	}
	
//	@AfterThrowing("execution(* com.gyuone.concert.Performance.perform(..))")
//	@AfterThrowing("performance()")
//	public void demandRefund() {
//		System.out.println("환불해달라~~~~~~");
//	}
	
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp) {
		try {
			System.out.println("휴대폰은 꺼주세요!");
			System.out.println("모두 자리에 앉아주세요!");
			jp.proceed();
			System.out.println("박수~~~~~ 짝짝짝!!");
		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println("환불해달라~~~~~~");
		}
	}
	
}
