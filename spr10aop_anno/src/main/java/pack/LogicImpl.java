package pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("logicImpl")
public class LogicImpl implements LogicInter{
	
	@Autowired // 클래스의 포함관계 (ArticleDao 객체의 주소를 치환한다 ) //selectAll() 메서드를 호출하기 위해 사용
	private ArticleInter articleInter;
	
	public LogicImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void select_process1() {
		System.out.println("select_process1 수행");
		articleInter.selectAll();
		
	}

	@Override
	public void select_process2() {
		System.out.println("select_process2 수행");
		System.out.println("AOP 만세");
		System.out.println("AOP는 관심사항을 모듈로 만들어 인터샙트를 가능하게 한다. 탈부착이 자유롭다.");
		
	}
	
}
