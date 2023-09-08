package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// 전통적인 방법 (다형성) 
		HelloMaven helloMaven = new HelloMaven();
		// HelloMaven 객체는 HelloInter를 인터페이스를 구현하고 있는데 HelloInter의 추상메서드 sayHello 선언을 함으로서
		// 구체적으로 구현해줘야 한다.
		helloMaven.sayHello("홍길동");
		
		System.out.println();
		
		// --------------------------------------------------------------------------------
		// Spring을 사용 : IOC - 제어의 역전 : 객체관리를 Spring이 한다.
		// ApplicationContext를 스프링 컨테이너라고도 한다.
		// ApplicationContext는 XML 파일에서 객체를 생성, 관리, 검색하는 역할을 담당한다.
		ApplicationContext context = new ClassPathXmlApplicationContext("init.xml"); 
		System.out.println(context); 
		// HelloInter 으로 넘어오니 형변환
		// 왜? : 스프링에서 빈을 등록할 때 인터페이스를 사용하여 빈을 정의하는 경우가 많다. 
		// 따라서 스프링 컨테이너는 빈을 생성할 때 해당 클래스의 인터페이스 타입으로 관리한다. 
		// getBean 메서드는 빈 객체를 검색하고 가져오는 역할을 하니 HelloMaven 객체 내의 sayHello 검색하고 메서드를 호출한다.	
		HelloInter inter  = (HelloInter)context.getBean("hello"); 
		inter.sayHello("한국인"); 
	}
}
