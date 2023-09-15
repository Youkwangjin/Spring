package anno3_other;

import org.springframework.stereotype.Component;

@Component
public class DataInfo {
	private String name = "한국인";
	private String part = "개발";
	public String job = "프로그래머";
	
	
	// 초기화를 해줬으니 set메서드는 만들지 않는다. 왜? set메서는 값을 설정해주는 메서드 이기 때문이다. 
	public String getName() {
		return name;
	}
	
	public String getPart() {
		return part;
	}
}
