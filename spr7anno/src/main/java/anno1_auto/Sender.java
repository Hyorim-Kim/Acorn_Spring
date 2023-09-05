package anno1_auto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sender")  // sender 타입의 객체를 만드는 annotation
// @Component  // Sender sender = new Sender() : 싱글톤 객체 생성
// @Component("mysender")
// 우선순위는 xml, 없으면 annotation으로 우선순위 넘어감 -> 객체 생성
@Scope("singleton")  // bean의 생존범위 기본 값  "prototype", "request", "session"

public class Sender implements SenderInter{
	public void show() {
		System.out.println("show method 수행~~~");
	}
}
