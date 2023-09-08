package pack;

// 인터페이스(interface)는 추상 메서드의 집합이다. 오로지 추상 메소드와 상수만을 포함할 수 있다. 
// 구현된 것이 전혀 없는 설계도이다. (모든 멤버가 public)
// 인터페이스의 조상은 인터페이스만 가능(클래스에 비해 Object이 최고 조상이 아니다)
public interface HelloInter {
	// 추상메서드는 선언부만 작성하고 구현부는 하지 않은 채로 남겨 둔 것이 추상메서드
	// 왜? 메서드의 내용이 상속받는 클래스에 따라 달라질 수 있기 때문이다.
	void sayHello(String name); // 추상 메서드 public abstract 는 생략 가능 
	//...
}
