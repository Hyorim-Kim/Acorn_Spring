package advice;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// 관심사항(Aspect) 관련 클래스 : Advice
public class LoggingAdvice implements MethodInterceptor {  // Interceptor: 핵심로직에 끼어들기, 추상메소드
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// 핵심로직 특정 메소드에 삽입되어 동작할 코드 기술
		
		// 핵심로직 특정 메소드 실행 전에 처리할 코드
		System.out.println(new SimpleDateFormat("yyyy년 MM월 dd일").format(new java.util.Date()));
		String methodName = invocation.getMethod().getName();  // 지정된 특정 메소드의 이름 얻기
		System.out.println("핵심로직 대상 메소드명은 " + methodName);
		
		Object object = invocation.proceed();  // 핵심로직 특정 메소드가 수행됨
		
		// 핵심로직 특정 메소드 실행 후 처리할 코드
		System.out.println(methodName + " 수행 후 마무리 작업 처리");
		
		return object;
	}
}
