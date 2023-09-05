package pack.guest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Annotationc 연습용
		ApplicationContext context = new ClassPathXmlApplicationContext("annoBank.xml");
		
		Gogek 길동 = (Gogek)context.getBean("gogek");
		길동.selectBank("신한");
		길동.playInputMoney(2000);
		길동.playOutputMoney(1000);
		System.out.println("길동 - ");
		길동.showMoney();
		
		Gogek 국인 = (Gogek)context.getBean("gogek");
		국인.selectBank("하나");
		국인.playInputMoney(2000);
		국인.playOutputMoney(1000);
		System.out.println("국인 - ");
		국인.showMoney();
		
		// 은행이 같아서 금액이 누적됨
		Gogek 효림 = (Gogek)context.getBean("gogek");
		효림.selectBank("하나");
		효림.playInputMoney(5000);
		효림.playOutputMoney(1000);
		System.out.println("효림 - ");
		효림.showMoney();
		
		System.out.println("주소 확인 : " + 길동 + " " + 국인 + " " + 효림);
		// singleton                  53fe15ff    53fe15ff   53fe15ff
		// prototype                  6e9175d8    7d0b7e3c   15bb5034
	}
}