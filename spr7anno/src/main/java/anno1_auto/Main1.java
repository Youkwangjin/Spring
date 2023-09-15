package anno1_auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main1 {

   public static void main(String[] args) {
      // Autowired 연습용
      
      // Spring에서 bean은 Spring loc 컨테이너에서 관리하는 객체이다.
      // Spring loc(Application context) 는 bean을 관리하는 객체이다.
      // getBean 메서드는 빈 객체를 검색하고 가져오는 역할
      
      
      ApplicationContext context = new ClassPathXmlApplicationContext("anno1.xml");
      
      
      SenderProcess process = (SenderProcess)context.getBean("senderProcess"); 
      // 형병환 하기 싫은 경우
      // SenderProcess process = context.getBean("SenderProcess", SenderProcess.class);
      process.displayData();
      process.getInter().show();
      


   }

}

