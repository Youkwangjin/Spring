package pack.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalcMain {

	public static void main(String[] args) {
		// MoneyCalc 객체를 설정 
		ApplicationContext context = new ClassPathXmlApplicationContext("myinit.xml");
		
		// getBean 메서드는 빈 객체를 검색하고 가져오는 역할 따라서 myService 의 MyServiceProcess객체를 가져온다.
		// 가져온 객체를 inter안에 담는다.
		MyServiceInter inter =(MyServiceInter)context.getBean("myService"); 
		inter.inputMoney();
		inter.showMoney();
	}

}
