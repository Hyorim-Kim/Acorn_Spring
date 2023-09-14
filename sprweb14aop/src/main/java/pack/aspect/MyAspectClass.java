package pack.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspectClass {
	@Autowired
	private SecurityClass class1;
	
	@Around("execution(public String businessMsg()) or execution(public String processMsg())")  // proceed의 대상
	public Object aspProcess(ProceedingJoinPoint joinPoint) throws Throwable{
		class1.mySecurity();  // 핵심 메소드 전에 수행
		
		Object object = joinPoint.proceed();  // 핵심 메소드 수행
		
		return object;
	}
}
