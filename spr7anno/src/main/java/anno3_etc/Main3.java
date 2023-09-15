package anno3_etc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main3 {

   public static void main(String[] args) { 
      // Spring에서 bean은 Spring loc 컨테이너에서 관리하는 객체이다.
      // Spring loc(Application context) 는 bean을 관리하는 객체이다.
      // getBean 메서드는 빈 객체를 검색하고 가져오는 역할
      
      ApplicationContext context = new ClassPathXmlApplicationContext("anno3.xml");
      MyProcess myProcess = (MyProcess)context.getBean("myProcess");
      myProcess.showResult();
   }

}

