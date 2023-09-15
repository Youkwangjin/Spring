package anno2_resource;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("ap") // AbcProcess ap = new AbcProcess();
public class AbcProcess {
	
	// 이름에 의한 매핑, @Resource 어노테이션을 사용하여 빈 간의 의존성을 주입한다. 
	@Resource(name="abc1")
	
	// 클래스의 포함관계 
	private Abc1 abc1;
	
	@Resource(name="kbs") // @Component("kbs") = name="kbs"
	
	// 클래스의 포함관계 왜? Abc2클래스 안에 있는 setter, getter 메서드를 사용하려고 포함한다. 
	private Abc2 abc2;
	
	public void showData() {
		abc1.setIrum("몽고집");
		abc2.setNai(23);
		
		String ss = "결과 : 이름은 " + abc1.getIrum();
		ss += ", 나이는 " + abc2.getNai();
		System.out.println(ss);
		
	}
	
}
