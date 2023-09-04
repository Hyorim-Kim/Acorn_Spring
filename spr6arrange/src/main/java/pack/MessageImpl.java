package pack;

// MessageInter 타입 클래스 중 하나
public class MessageImpl implements MessageInter {
	private String name1, name2;  // 생성자를 통해 외부에서 값을 주입(injection)
	private int year;
	private MyInfo myInfo;
	
	public MessageImpl(String name1, String name2, int year, MyInfo myInfo) {  // constructor injection(DI)
		this.name1 = name1;  // 생성자를 통해 값이 들어옴
		this.name2 = name2;
		this.year = year;
		this.myInfo = myInfo;
	}
	
	@Override
	public void sayHi() {
		// 현재 클래스 멤버들 출력용 메소드
		String msg = name1 + " 별명은 " + name2;
		msg += (year + 23) + "년";
		msg += ", " + myInfo.myData();
		
		System.out.println(msg);
	}	
}
