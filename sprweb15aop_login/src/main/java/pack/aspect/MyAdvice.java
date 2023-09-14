package pack.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
@Aspect
public class MyAdvice {
	@Autowired
	private LoginClass loginClass;
	
	@Around("execution(* jikProcess*(..))")  // 현재 프로세스에서 jikProcess로 시작, (..):argument 0개 이상
	public Object aopPorcess(ProceedingJoinPoint joinPoint) throws Throwable{
		HttpServletRequest request = null;
		HttpServletResponse response = null;
		
		for(Object obj:joinPoint.getArgs()) {
			if(obj instanceof HttpServletRequest) {
				request = (HttpServletRequest)obj;  // request가 null에서 벗어남
			}
			if(obj instanceof HttpServletResponse) {
				response = (HttpServletResponse)obj;
			}
		}
		
		if(loginClass.loginCheck(request, response)) {
			// login에 성공(false)하면 이 부분 만나지 않음, 바로 proceed
			return null;
		}
		
		Object object = joinPoint.proceed();
		return object;
	}
}
