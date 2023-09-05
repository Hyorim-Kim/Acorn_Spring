package pack;

// 먼저 SangpumInter 인터페이스를 만든다
// SangpumInter는 계산 로직을 정의(?)하는 인터페이스임.
public interface SangpumInter {
    void CalcMoney(String 상품명, int 수량, int 가격);
}

// CalcMoney 메서드는 총 3개의 세 개의 '매개변수'를 받음(상품명, 수량, 가격)
// CalcMoney 메서드는 상품명, 수량, 가격을 입력받아 계산 결과(총액은 수량 * 가격임 )를 출력하는 역할을함.

// 예를 들어, CalcMoney("신발", 5, 2000)을 호출하면
/*
상품명: 신발
수량: 5
가격: 2000
총액: 10000
이렇게 호출되게 하려고 생각하면서 만듬
*/