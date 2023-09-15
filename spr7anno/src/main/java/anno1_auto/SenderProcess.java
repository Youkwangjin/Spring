package anno1_auto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Component // 단순하게 객체를 생성 
@Service("senderProcess") // 가독성을 위해 (비지니스 로직을 위해 사용되는 클래스 구나 라고 생각하면 된다. 내부적으로 @Component 벌어진다.)
public class SenderProcess {
	
// type(Sender)에 의한 매핑 (프로젝트에서 찾고 매핑해준다.) 클래스의 포함관계 (상속 x)
//	@Autowired
//	private Sender sender;
	
	/*
	@Autowired // 메서드에 자동으로 Sender 타입 객체를 매핑해준다(생성자를 사용할 수도 있다)
	// sender 타입 객체를 찾는다.
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	*/
	
	// 자동으로 매핑(객체 만드는건 아니다.)
	@Autowired
	@Qualifier("sender2") //  @Autowired와 함께 사용하여 정확히 어떤 bean을 사용할지 지정하여 특정 의존 객체를 주입할 수 있도록 한다.
	
	// 클래스의 포함관계 
	private SenderInter inter; // SenderInter는 Sender의 부모 
	
 
	
	
//	public Sender getSender() {
//		return sender;
//	}
//	
//	public void displayData() {
//		sender.show();
//	}
	
	
	public SenderInter getInter() {
		return inter;
	}
	
	public void displayData() {
		inter.show();
	}
}
