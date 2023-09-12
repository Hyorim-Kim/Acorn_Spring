package pack.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JikwonDto {
	private String jikwon_no,jikwon_name,jikwon_jik,buser_name,manage_gogek;

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

	public String getManage_gogek() {
		return manage_gogek;
	}

	public void setManage_gogek(String manage_gogek) {
		this.manage_gogek = manage_gogek;
	}
}
