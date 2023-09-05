package pack;

// 두번째로 SangpumImpl 클래스를 만든다.
//이 클래스의 역할은 상품 정보를 입력받아 '총액'을 계산하고 결과를 출력하는 기능을함.

// SangpumImpl 클래스는 SangpumInter 인터페이스를 구현하는 클래스임.
// SangpumInter 인터페이스는 추상메소드임, 추상 메소드는 구현 내용 없이 선언만 해 놓는 형태 이므로 SangpumImpl 클래스로 구현해야함.
// (대충 뭔소리인지 알겠지? 사실 나도 아직 개념이 명확하지는 않아서 헷갈림 ㅋㅋ )
// 결국 여기 CalcMoney 메서드는 SangpumInter 인터페이스에서 정의된 메서드를 오버라이드할꺼임.

public class SangpumImpl implements SangpumInter {
    @Override
    public void CalcMoney(String 상품명, int 수량, int 가격) {
        int 총액 = 수량 * 가격;
        System.out.println("상품명: " + 상품명);
        System.out.println("수량: " + 수량);
        System.out.println("가격: " + 가격);
        System.out.println("총액: " + 총액);
    }
}
