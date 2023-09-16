package pack.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemBean {
	private int num;
	private String name;
	private String addr;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
