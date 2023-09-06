package pack;

import java.util.Scanner;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect  // 관심사항을 객체로 만들었음
public class MyAdvice {
	@Around("execution(public void startProcess())")
	public Object abc(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("AOP 시작");
		
		System.out.print("id 입력 : ");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		if(!id.equals("aa")) {
			System.out.println("id 불일치! 핵심로직 수행을 거부합니다");
			return null;
		}
		
		Object object = joinPoint.proceed();  // pointcut 대상 메소드로 지정된 startProcess()를 실행
		
		System.out.println("AOP 끝");
		return object;
	}
}
