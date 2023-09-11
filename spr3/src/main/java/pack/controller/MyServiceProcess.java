package pack.controller;

import java.util.Scanner;

import pack.model.MoneyInter;

// 자식 (부모의 추상메서드를 구현해야 한다.)
public class MyServiceProcess implements MyServiceInter{
	// 클래스의 포함관계 : 한 클래스(MyServiceProcess)의 멤버변수로 다른 클래스 타입의 참조변수를 선언하는 것 (has a 관계)
	// (다형성을 위해 사용)
    private MoneyInter inter;
    private int re[];
    
    
    public MyServiceProcess(MoneyInter inter) {
    	// 지역변수와 전역변수의 변수명이 같기 때문에 this를 통해 구별할 수 있다. 
		this.inter = inter;
	}
    
	@Override
	public void inputMoney() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("금액 입력 : ");
			int myMoney = scanner.nextInt();
			re = inter.calcMoney(myMoney);
		} catch (Exception e) {
			System.out.println("inputMoney err : " + e.getMessage());
		}
		
	}

	@Override
	public void showMoney() {
		StringBuffer sb = new StringBuffer();
		sb.append("만원 : " + re[0] + "\n");
		sb.append("천원 : " + re[1] + "\n");
		sb.append("백원 : " + re[2] + "\n");
		sb.append("십원 : " + re[3] + "\n");
		sb.append("일원 : " + re[4] + "\n");		
		System.out.println(sb.toString());
	}
}
