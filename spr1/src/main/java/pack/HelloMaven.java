package pack;

// 인터페이스의 구현 : 인터페이스에 정의된 추상 메서드를 완성하는것 쉽게 말해서 추상메서드 몸통 { } 만들기(미완성 설계도 완성하기)
public class HelloMaven implements HelloInter{
	// 인터페이스에 정의된 추상메서드를 '모두' 구현해야 한다. 
	
	
	// 반환값이 없고 단순히 메세지를 출력한다. 
	// HelloInter를 인터페이스를 구현하고 있는데 HelloInter의 추상메서드 sayHello 선언을 함으로서
	// 구체적으로 구현해줘야 한다.
	@Override
	public void sayHello(String name) {
		System.out.println("안녕하세요 " + name + "님");
	
	}
}
