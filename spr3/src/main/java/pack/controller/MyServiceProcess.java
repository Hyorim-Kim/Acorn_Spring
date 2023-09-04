package pack.controller;

import java.util.Scanner;

import pack.model.MoneyInter;

public class MyServiceProcess implements MyServiceInter {
	private MoneyInter inter;
	private int re[];  // 멤버필드
	
	public MyServiceProcess(MoneyInter inter) {  // MoneyCal의 부모인 MoneyInter를 parameter로 지정
		this.inter = inter; // this.inter:전역, inter:지역
	}	
	
	@Override
	public void inputMoney() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("금액 입력:");
			int myMoney = scanner.nextInt();
			re = inter.calcMoney(myMoney);			
		} catch (Exception e) {
			System.out.println("inputMoney err:" + e.getMessage());
		}
		
	}
	
	@Override
	public void showMoney() {  // 출력
		StringBuffer sb = new StringBuffer();
		sb.append("만원 : " + re[0] + "\n");
		sb.append("천원 : " + re[1] + "\n");
		sb.append("백원 : " + re[2] + "\n");
		sb.append("십원 : " + re[3] + "\n");
		sb.append("일원 : " + re[4] + "\n");
		System.out.println(sb.toString());  // 문자열 출력은 StringBuffer를 사용하는 것이 효과적
		
	}
}
