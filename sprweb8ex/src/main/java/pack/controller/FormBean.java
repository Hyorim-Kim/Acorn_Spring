package pack.controller;

import lombok.Data;

@Data
public class FormBean {
	private String jikwon_no,jikwon_name,jikwon_jik,buser_name,jikwon_pay;
	private String searchValue;
	
	public String getJikwon_no() {
		return jikwon_no;
	}
	public void setJikwon_no(String jikwon_no) {
		this.jikwon_no = jikwon_no;
	}
	public String getJikwon_name() {
		return jikwon_name;
	}
	public void setJikwon_name(String jikwon_name) {
		this.jikwon_name = jikwon_name;
	}
	public String getJikwon_jik() {
		return jikwon_jik;
	}
	public void setJikwon_jik(String jikwon_jik) {
		this.jikwon_jik = jikwon_jik;
	}
	public String getBuser_name() {
		return buser_name;
	}
	public void setBuser_name(String buser_name) {
		this.buser_name = buser_name;
	}
	public String getJikwon_pay() {
		return jikwon_pay;
	}
	public void setJikwon_pay(String jikwon_pay) {
		this.jikwon_pay = jikwon_pay;
	}
	public String getSearchValue() {
		return searchValue;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
	
}
