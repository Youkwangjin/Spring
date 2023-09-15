package anno2_resource;

import org.springframework.stereotype.Component;

@Component // 객체 생성 (XML 파일에 가서 스캔해줘야 된다.(알려주기)
public class Abc1 {
	private String irum;
	
	public void setIrum(String irum) {
		this.irum = irum;
	}
	
	public String getIrum() {
		return irum;
	}

}
