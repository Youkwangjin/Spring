package pack.model;

import org.springframework.stereotype.Component;

@Component
public class SangpumDto {
	private String jikwon_no, jikwon_name, buser_num, jikwon_ibsail, buser_no, buser_name, jikwon_pay;
	private String ibsa, inwon;

	public String getInwon() {
		return inwon;
	}

	public String getJikwon_pay() {
		return jikwon_pay;
	}

	public void setJikwon_pay(String jikwon_pay) {
		this.jikwon_pay = jikwon_pay;
	}

	public void setInwon(String inwon) {
		this.inwon = inwon;
	}

	public String getIbsa() {
		return ibsa;
	}

	public String getJikwon_no() {
		return jikwon_no;
	}

	public void setJikwon_no(String jikwon_no) {
		this.jikwon_no = jikwon_no;
	}

	public String getBuser_no() {
		return buser_no;
	}

	public void setBuser_no(String buser_no) {
		this.buser_no = buser_no;
	}

	public String getBuser_name() {
		return buser_name;
	}

	public void setBuser_name(String buser_name) {
		this.buser_name = buser_name;
	}

	public void setIbsa(String ibsa) {
		this.ibsa = ibsa;
	}

	public String getJikwon_name() {
		return jikwon_name;
	}

	public void setJikwon_name(String jikwon_name) {
		this.jikwon_name = jikwon_name;
	}

	public String getBuser_num() {
		return buser_num;
	}

	public void setBuser_num(String buser_num) {
		this.buser_num = buser_num;
	}

	public String getJikwon_ibsail() {
		return jikwon_ibsail;
	}

	public void setJikwon_ibsail(String jikwon_ibsail) {
		this.jikwon_ibsail = jikwon_ibsail;
	}




}
