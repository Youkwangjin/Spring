package pack;

import java.util.Scanner;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

// 관심사항 로직

@Component // 관심사항을 객체로 만들었다.
@Aspect
public class Myadvice {
	// startProcess() pointcut 대상 메서드 설정해주기
	@Around("execution(public void startProcess())") 
	public Object abc(ProceedingJoinPoint joinPoint) throws Throwable{
		
		System.out.println("AOP 시작");
		
		System.out.println("id 입력 : ");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		if(!id.equals("aa")) {
			System.out.println("id가 불일치 : 핵심로직 수행을 거부합니다.");
			return null;
		}
		
		// startProcess()가 여기서 수행된다. pointcut 대상 메서드로 지정된 startProcess()를 실행
		Object object = joinPoint.proceed();
		
		System.out.println("AOP 끝");
		return object;
	}
}
