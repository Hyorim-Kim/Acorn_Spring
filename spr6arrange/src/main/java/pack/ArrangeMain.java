package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArrangeMain {

	public static void main(String[] args) {
		// Spring이 생성한 객체를 호출 후 실행
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:arrange.xml");
		
		/*
		// singleton 확인
		MessageImpl impl1 = new MessageImpl("tom");
		impl1.sayHi();
		
		MessageImpl impl2 = new MessageImpl("oscar");
		impl2.sayHi();

		System.out.println("객체 주소 : " + impl1.toString() + " 객체 주소 : " + impl2);
		// 객체가 별도로 생성됨을 알 수 있다 (주소 다름 -> singleton이 아님)
		
		System.out.println("------");
		// spring 불러오기
		MessageImpl spr_impl1 = (MessageImpl)context.getBean("msgImpl");
		spr_impl1.sayHi();
		
		MessageImpl spr_impl2 = (MessageImpl)context.getBean("msgImpl");
		spr_impl2.sayHi();
		System.out.println("객체 주소 : " + spr_impl1 + " 객체 주소 : " + spr_impl2);
		// 객체 주소(스프링) : pack.MessageImpl@6a78afa0 객체 주소 : pack.MessageImpl@6a78afa0
		// 두 변수의 주소가 동일 -> singleton이 기본
		// xml bean scope="prototype"로 변경하면 singleton X
		// -------------------------------------------------------
		*/
		
		System.out.println("다형성 캐스팅 관련 .........");
		MessageImpl spr_impl3 = (MessageImpl)context.getBean("msgImpl");
		spr_impl3.sayHi();
		
		System.out.println();  // MessageImpl의 super 클래스를 사용
		MessageInter inter1 = (MessageInter)context.getBean("msgImpl");
		inter1.sayHi();  // 부모 객체를 이용하여 자식 메소드를 호출 
		MessageInter inter2 = (MessageInter)context.getBean("msgImpl");
		inter2.sayHi();
		
	}
}
