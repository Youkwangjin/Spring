package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArrangeMain {

	public static void main(String[] args) {
		// Spring이 생성한 객체를 ApplicationContext를 통해서 호출 후 실행
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:arrange.xml");
		System.out.println(context);
		
		/*
        // singleton 확인
		MessageImpl impl1 = new MessageImpl("tom");
		impl1.sayHi();

		MessageImpl impl2 = new MessageImpl("oscar");
		impl2.sayHi();
		
		System.out.println("객체 주소 : " + impl1.toString() + " " + impl2);
		// pack.MessageImpl@7e6f74c pack.MessageImpl@dd05255 : 객체가 별도로 생성 
		
		System.out.println("--------------------------");
		//스프링 방법 (싱글톤이 기본이다 !! 꼭 기억하자.)
		MessageImpl spr_impl1 = (MessageImpl)context.getBean("msgImpl");
		spr_impl1.sayHi();
		
		MessageImpl spr_impl2 = (MessageImpl)context.getBean("msgImpl");
		spr_impl2.sayHi();
		System.out.println("객체 주소(Spring) : " + spr_impl1.toString() 
		                    + " " + spr_impl2);
		// pack.MessageImpl@6a78afa0 pack.MessageImpl@6a78afa0 두 변수의 주소가 동일하다.
		//--------------------------------------------------------------------------
		 */
		
		
		
		System.out.println("\n다형성 캐스팅 관련 ......");
		System.out.println();
		
		MessageImpl spr_impl3 = (MessageImpl)context.getBean("msgImpl");
		spr_impl3.sayHi();
		System.out.println();
		// MessageImpl의 super 클래스 사용
		MessageInter inter1 = (MessageInter)context.getBean("msgImpl");
		inter1.sayHi();
		
		System.out.println();
		
		// 다형성 개념
		MessageInter inter2 = (MessageImpl)context.getBean("msgImpl");
		inter2.sayHi();
	}

}
