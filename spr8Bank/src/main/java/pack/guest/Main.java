package pack.guest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

   public static void main(String[] args) {

      
      // Spring에서 bean은 Spring loc 컨테이너에서 관리하는 객체이다.
      // Spring loc(Application context) 는 bean을 관리하는 객체이다.
      // getBean 메서드는 빈 객체를 검색하고 가져오는 역할
          
      ApplicationContext context = new ClassPathXmlApplicationContext("annobank.xml");
      
      Gogek kwangjin = (Gogek)context.getBean("gogek");
      kwangjin.selectBank("신한");
      kwangjin.playInputMoney(2000); // 2000원 입금
      kwangjin.playOutputMoney(1000); // 1000원 출금
      System.out.println("광진 ");
      kwangjin.showMoney();
      
      Gogek 국인 = (Gogek)context.getBean("gogek");
      국인.selectBank("하나");
      국인.playInputMoney(2000); // 2000원 입금
      국인.playOutputMoney(1000); // 1000원 출금
      System.out.println("국인 ");
      국인.showMoney();
      
      Gogek 서호 = (Gogek)context.getBean("gogek");
      서호.selectBank("하나");
      서호.playInputMoney(5000); // 2000원 입금
      서호.playOutputMoney(1000); // 1000원 출금
      System.out.println("서호 ");
      서호.showMoney();
      
      System.out.println("주소 확인 : " + kwangjin + " " + 국인 + " " + 서호);
      // singleton						@5b1669c0 	@5b1669c0 	@5b1669c0
      // prototype						@4b741d6d 	@2eae8e6e 	@8f2ef19

   }

}

