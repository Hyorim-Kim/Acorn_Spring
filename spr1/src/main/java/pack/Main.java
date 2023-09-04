package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// 전통적 방법
		HelloMaven helloMaven = new HelloMaven();
		helloMaven.sayHello("홍길동");
		
		System.out.println();
		// spring을 사용 : IOC - 제어의 역전 : 객체관리를 spring이 함
		// 자식의 객체를 스프링이 만들고 외부(스프링)에서 만든 객체를 주소 치환해서 가져옴(dependency injection (DI)
		ApplicationContext context = new ClassPathXmlApplicationContext("init.xml");  // xml 찾아감
		HelloInter inter = (HelloInter)context.getBean("hello");  // init.xml에서 bean을 읽음
		inter.sayHello("한국인");
	}

}
