package pack.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data  // 롬복 : getter/setter 생성
public class SangpumBean {  // 용도 : formBean
	private String sang;  //input.html과 이름 동일하게 작성
	private int su, dan;
	
	public String getSang() {  // 롬복 안먹음
		return sang;
	}
	public void setSang(String sang) {
		this.sang = sang;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public int getDan() {
		return dan;
	}
	public void setDan(int dan) {
		this.dan = dan;
	}
	
	
}
