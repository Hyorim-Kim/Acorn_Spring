package pack.controller;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component 
@Data
public class Sangpum {
	private String code, sang, price;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSang() {
		return sang;
	}

	public void setSang(String sang) {
		this.sang = sang;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
}
