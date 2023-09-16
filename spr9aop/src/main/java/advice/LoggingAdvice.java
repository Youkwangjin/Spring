package advice;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// 관심사항(Aspect) 관련 클래스 : Advice 
public class LoggingAdvice implements MethodInterceptor{ // 나는 핵심로직에 끼워 넣을거야 라는 의미

	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// 핵심로직 특정 메서드에 삽입되어 동작할 코드를 기술 (JSP 의 include를 생각하면 이해하기 쉽다)
		
		// 핵심로직 특정 메서드 실행 전에 처리할 코드
		System.out.println(new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date()));
		String methodName = invocation.getMethod().getName(); // 저장된 특정 매서드의 이름 얻기
		System.out.println("핵심 로직 대상 메서드명은 : " + methodName);
		
		
		// 핵심로직 특정 메서드가 수행된다. 
		Object object = invocation.proceed();
		
		// 핵심로직 특정 메서드 실행 후 처리할 코드
		System.out.println(methodName + " 수행 후 마무리 작업 처리 ");
		
		return object;
	} 

}
