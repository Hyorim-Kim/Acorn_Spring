package pack;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

// 관심사항을 담은 클래스 : Aspect를 담은 Advice용 클래스
@Component
@Aspect
public class ProfileAdvice {
   
// LogicInter 에 있는 추상메서드와 selectAll 메서드
   @Around("execution(* * ..*LogicInter*.*(..)) or execution(public void selectAll())")   
   public Object kbs(ProceedingJoinPoint joinPoint) throws Throwable{
      
      // 핵심로직 특정 메서드의 이름을 얻을 수 있다. 
      String methodName = joinPoint.getSignature().toString();
      //String methodName = joinPoint.getSignature().getName();
      System.out.println(methodName + "시작 전 작업 .....");
     
     // 핵심로직 특정 메서드가 수행 
      Object object = joinPoint.proceed();
      System.out.println(methodName + "처리 후 작업 .....");
      
      return object;
   }
}