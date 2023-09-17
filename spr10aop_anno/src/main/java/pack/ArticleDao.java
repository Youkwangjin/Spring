package pack;

import org.springframework.stereotype.Repository;

// 객체를 생성하면서 DB자료를 처리하는 클래스있음 알려주는게 Repository

@Repository
public class ArticleDao implements ArticleInter{

	@Override
	public void selectAll() {
		System.out.println("상품 자료 전체 출력 성공");
		
	}

}
