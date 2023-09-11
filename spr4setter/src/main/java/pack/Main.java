package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		
		// Spring 방식
		// ShowData 객체와 MyProcessService 객체 즉, 2개의 객체를 불러온다. 
		ApplicationContext context = new ClassPathXmlApplicationContext("myinit.xml");
		
		// 빈을 가져올 때 형변환을 수행한 이유는 getBean 메서드의 반환 타입이 기본적으로 Object이기 때문이다.
		// 따라서 빈을 가져올 때 해당 빈의 실제 타입(MyProcessService)으로 형변환을 해야한다.
		// service 인스턴스는 MyProcessService 클래스의 메서드를 호출
		MyProcessService service = (MyProcessService)context.getBean("myProcess");
		// bean에서 set메서드에 값을 넣어줬기 때문에 NULL이 뜨지 않고 출력이 된다. 
		service.displayData();

	}

}
