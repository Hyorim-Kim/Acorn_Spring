package pack.controller;

import pack.model.CalcInter;

public class MyProcess {
	private String name;
	private int su;
	//private Gugudan gugudan;  // 다형성 X
	private CalcInter calcInter;  // 구구단의 부모클래스 사용, 클래스의 포함관계
	
	public void setName(String name) {  // 외부에서 스프링을 통해 값을 입력
		this.name = name;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public void setCalcInter(CalcInter calcInter) {
		this.calcInter = calcInter;
	}
	
	
	// 출력
	//public String displayData() {
	@Override
	public String toString() {
		int[] result = calcInter.numberCalc(su);
		String ss = "";
		
		for (int i = 0; i < result.length; i++) {
			ss += su + "*" + (i + 1) + "=" + result[i] + "\n";
		}
		return "작성자:" + name + "\n" + su + "단 결과 : \n" + ss;
	}
}
