package anno1_auto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sender") // 여기서 "sender"가 객체 참조변수 이름
@Scope("singleton") // bean의 생존 범위 기본 값 (안적어주면 기본으로 값을 가진다.) prototype, request, session
// Sender객체가 싱글톤 타입으로 만들어진다. (우선 순위는 XML가 1등 그 다음 Annotation 이다.)
// Sender sender = new Sender();
public class Sender implements SenderInter{
	public void show() {
		System.out.println("show method 수행");
	}

}
