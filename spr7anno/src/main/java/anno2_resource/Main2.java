package anno2_resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

   public static void main(String[] args) {
      // resource 연습용
      // Config 파일이 복수인 경우
	  String [] metas = new String[] {"anno2.xml"};
	  ApplicationContext context = new ClassPathXmlApplicationContext(metas[0]);
	  
	  // 스프링 컨테이너(ApplicationContext)에서 이름이 "ap"인 AbcProcess 빈을 가져온다. 
	  AbcProcess process = context.getBean("ap", AbcProcess.class);
	  process.showData();  
   }
}

