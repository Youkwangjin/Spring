package pack.model;


// 자식 (부모에서 선언한 추상메서드를 자세히 구현(implements) 해야한다. 
public class Gugudan implements CalcInter {
	
	@Override
	public int[] numberCalc(int su) {
		int [] cal = new int[9];
		for(int i = 0; i < 9; i++) {
			cal[i] = su * (i + 1);
		}
		return cal;
	}

}
