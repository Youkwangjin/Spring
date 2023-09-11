package pack.controller;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pack.model.DataDao;
import pack.model.DataDaoImpl;
 
public class Main {
	
	public static void main(String[] args) {
		// 전통적인 방법, DB 처리용

		// 다형성 개념(부모 타입 참초변수로 자손 타입의 인스턴스(객체) 참조)
		// DataDao 참조변수 dataDao는 DataDaoImpl객체를 가리킨다. (다형성 개념)
		// 그러면 DataDao는 DataDaoImpl 객체의 클래스에 선언된 메서드를 호출할 수 있다.
		// DataDaoImpl 클래스의 객체를 생성하고 daoImpl 변수에 할당한다. 이것은 DataDaoImpl 클래스의 인스턴스를 생성하는 것
		// daoImpl 변수를 dataDao 변수에 할당합니다. 이것은 dataDao 변수도 daoImpl과 동일한 객체를 참조
		DataDao daoImpl = new DataDaoImpl(); 
		DataDao dataDao = daoImpl;
		// dataDao와 daoImpl 변수는 모두 DataDao 인터페이스 타입으로 선언되었는데, 
		// DataDaoImpl 클래스가 DataDao 인터페이스를 구현(implements)했기 때문에 가능한 것이다. 
		daoImpl.selectData();
		System.out.println("-------------------------");
		dataDao.selectData();
		System.out.println("-------------------------");
		
		// 비즈니스 처리용
		
		// parameter 값이 있는 생성자 호출
		BusinessServiceImpl businessServiceImpl = new BusinessServiceImpl(dataDao);
		businessServiceImpl.selectProcess();
		System.out.println("-------------------------");
		// 다형성 개념 
		BusinessService businessService = businessServiceImpl;
		businessService.selectProcess();
		
		System.out.println("-------------------------");
		
		// Spring 방법 : 환경설정(Configuration) 파일(XML)을 이용한다.
		// 모든 객체 설정을 자바로 부터 분리, 외부화 할 수 있다. 
		// Spring은 설정파일에서 (예를 들어 init.xml) 설정된 내용을 읽어 Application에서 필요한 기능을 처리한다.
		// XML 기반으로 작성하지만 자바 클래스로도 작성할 수도 있다.
		// Root tag는 <beans>다.
		// <beans> tag는 주입할 객체로 설정파일에 설정한다.
		// <beans> 의 속성으로 id : 객체변수명(중복 불가), name : 복수의 이름 지정 가능
		
		
		// ------ XML 파일로 설정된 방식 -------------
		// ApplicationContext context = new ClassPathXmlApplicationContext("classpath:init.xml");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("init.xml");
		
		/* init.xml을 다른 경로에 넣은 경우 예시
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:pack/controller/init.xml");
		*/
		BusinessService businessService2 = (BusinessService)context.getBean("businessServiceImpl");
		businessService2.selectProcess();
		
		System.out.println("-------------------------");
		
		// ------ 자바 클래스 파일로 설정된 방식 -------------		
		AnnotationConfigApplicationContext context_an = new AnnotationConfigApplicationContext(Config.class);
		BusinessService businessService_an =  (BusinessService)context_an.getBean("businessServiceImpl");
		businessService_an.selectProcess();
	}
}
