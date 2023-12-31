package pack;

//AOP는 Aspect Oriented Programming의 약자로 관점 지향 프로그래밍이라고 불린다. 
//관점 지향은 쉽게 말해 어떤 로직을 기준으로 핵심적인 관점, 부가적인 관점으로 나누어서 보고 그 관점을 기준으로 각각 모듈화하겠다는 것이다. 
//여기서 모듈화란 어떤 공통된 로직이나 기능을 하나의 단위로 묶는 것을 말한다. 
//예로들어 핵심적인 관점은 결국 우리가 적용하고자 하는 핵심 비즈니스 로직이 된다. 
//또한 부가적인 관점은 핵심 로직을 실행하기 위해서 행해지는 데이터베이스 연결, 로깅, 파일 입출력 등을 예로 들 수 있다.

// 핵심 로직 클래스 : AOP 입장에서는 Target이다.
public class MessageImpl implements MessageInter{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void sayHi() {
		System.out.println("안녕 " + name + "님 핵심 로직 처리 중");
		// 처리 다소 길다는 가정하에 시간끌기
		int t = 0;
		while(t < 5) {
			try {
				Thread.sleep(1000);
				System.out.println(".");
				t++;
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("sayHi 처리 완료");
			System.out.println("-------------");
		}
	}

}
