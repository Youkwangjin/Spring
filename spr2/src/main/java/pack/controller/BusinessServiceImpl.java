package pack.controller;

import pack.model.DataDao;

// 자식 : 인터페이스를 구현(implements)해야 한다. (추상메서드를 자세히 구현)
public class BusinessServiceImpl  implements BusinessService{
	// 클래스의 포함관계 : 한 클래스(BusinessServiceImpl)의 멤버변수로 다른 클래스(DataDao) 타입의 참조변수를 선언
	private DataDao dataDao;
	
//	public BusinessServiceImpl() {
	
//	}
	
	public BusinessServiceImpl(DataDao dataDao) { // 파라미터가 있는 생성자
		// 생성자를 통해 DB처리용 영역 클래스의 객체 주소를 치환(injection)한다. 
		this.dataDao = dataDao;
	}
	
	public void selectProcess() {
		// DB와 연결해 자료를 읽는 DataDaoImpl 클래스의 selectData 메서드 실행용
		dataDao.selectData();
	}

}
