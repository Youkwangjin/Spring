package anno3_etc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service // MyProcess myProcess = new MyProcess();
@ComponentScan("anno3_other") // XML 의존적이지 않는 사용방법 <context:component-scan base-package="anno3_other" /> 같은 의미
public class MyProcess {
	
	// spEL(Spring Expression Language) 방법 : 동적으로 표현식을 해석한다. 양식 : #{표현식}
	@Value("#{dataInfo.name}") // #{dataInfo.name}는 DataInfo 클래스의 getName() 호출 세미클론은 주면 안된다.
	private String name;
	private String part;
	
	@Value("#{dataInfo.job}")
	private String myJob;
	
	@Value("1,2,3,4,5") 
	private int arr[];
	
	
	
	public MyProcess() {
		
	}
	
	@Autowired
	//public MyProcess(@Value("총무부") String part) { // 우선순위는 환경설정(XML) 파일보다 낮다!! 
	public MyProcess(@Value("#{dataInfo.part}") String part) {
		this.part = part;
	}
	
	public void showResult() {
		System.out.println("part : " + part);
		System.out.println("name : " + name);
		System.out.println("job : " + myJob);
		System.out.println(arr[0] + arr[3]);
	}
	

}
