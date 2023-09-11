package pack.model;

// 자식 (여기서는 추상메서드를 구현해야한다.)
public class DataDaoImpl implements DataDao{

	@Override
	public void selectData() {
		System.out.println("DB와 연결한 후 selectData 수행");
		
	}

}
