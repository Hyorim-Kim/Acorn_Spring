package pack.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalcMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("myinit.xml");  // ClassPathXmlApplicationContext : xml에 만든 객체를 읽어 불러올 때
		
		MyServiceInter inter = (MyServiceInter)context.getBean("myService");  // 자식의 주소는 부모 객체주소에 치환될 수 있다.
		inter.inputMoney();
		inter.showMoney();
	}

}
