package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aopinit.xml");
		LogicInter inter = (LogicInter)context.getBean("logicImpl");
		inter.select_process1();
		inter.select_process2();
	}

}
