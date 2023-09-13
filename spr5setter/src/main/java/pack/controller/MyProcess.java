package pack.controller;

import pack.model.CalcInter;

public class MyProcess {
	private String name; // 초기값 :  NULL
	private int su; //초기값 :  0
	
	// 다형성 사용
	private CalcInter calcInter;

	// 외부 Spring을 통해 값을 넣는다. setter로 값이 들어온다 
	public void setName(String name) {
		this.name = name;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public void setCalcInter(CalcInter calcInter) {
		this.calcInter = calcInter;
	}
	
	public String displayData() {
		int [] results = calcInter.numberCalc(su); 
		String ss = "";
		
		for (int i = 0; i < results.length; i++) {
			ss += su + "*" + (i + 1) + "=" + results[i] + "\n"; 
		}
		return "작성자 : " + name + "\n" + su + "단 결과 : \n" + ss;
	}
	
	/*
	@Override
	public String toString() {
		int[] results = calcInter.numberCalc(su);
		String ss = "";

		for (int i = 0; i < results.length; i++) {
			ss += su + "*" + (i + 1) + "=" + results[i] + "\n";
		}
		return "작성자 : " + name + "\n" + su + "단 결과 : \n" + ss;
	}
	*/ 
	

}
