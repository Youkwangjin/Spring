package pack.model;

// 자식 : 인터페이스를 구현(implements) 해야한다. (추상메서드를 자세히 설정해야한다.)
public class MoneyCalc implements MoneyInter {

	@Override
	public int[] calcMoney(int money) {
		// money가 45678 값이 들어온다고 가정하자
		int[] result = new int[5];
		result[0] = money / 10000; // 몫만 구하기	
		result[1] = money % 10000 / 1000;
		result[2] = money % 10000 % 1000 / 100 ;
		result[3] = money % 10000 % 1000 % 100 / 10 ;
		result[4] = money % 10000 % 1000 % 100 % 10 ;
		
		return result;
	}

}
