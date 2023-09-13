package pack;

import etc.OutDataInter;

// MessageInter 타입 클래스중 하나
public class MessageImpl implements MessageInter {
	private String name1, name2; // 생성자를 통해 외부에서 값을 주입(넘겨받는다)
	private int year;
	private MyInfo myInfo; // 클래스의 포함 관계 : 한 클래스의 멤버변수로 다른 클래스 타입의 참조변수를 선언
	private String spec; // property를 통해 외부에서 값을 주입하기 위해 사용
	private OutDataInter inter;
	
	
	
	// constructor injection (주입)
	public MessageImpl(String name1, String name2, int year, MyInfo myInfo) {
		this.name1 = name1;
		this.name2 = name2;
		this.year = year;
		this.myInfo = myInfo;
	}
	
	// Setter injection (주입)
	public void setSpec(String spec) {
		this.spec = spec;
	}
	
	// Setter injection (주입) 
	public void setMyInfo(MyInfo myInfo) {
		this.myInfo = myInfo;
	}
	
	
	public void setInter(OutDataInter inter) {
		this.inter = inter;
	}

	@Override
	public void sayHi() {
		// 현재 클래스 멤버를 출력용 메서드이다.
		String msg = name1 + " 별명은 " + name2 + " ";
		msg += (year + 23) + "년" + " "; 
		msg += ", " + myInfo.myData(); 
		
		msg += "\n보유기술 : " + spec;
		msg += ", " + myInfo.myData();
		System.out.println(msg);
		
		// msg를 파일로 출력
		inter.outFile(msg);
		
	}
}
