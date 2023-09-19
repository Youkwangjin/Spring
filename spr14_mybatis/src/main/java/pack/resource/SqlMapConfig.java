package pack.resource;

import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlMapConfig {
	// mybatis 에서는 DB에 연동하는 Connection객체를 SqlSession이라 부른다.
	// SqlSessionFactory은 sqlSession이라는 객체를 만들어 내는 존재이다. 
	public static SqlSessionFactory sqlSession; 
	
	static {
		// 데이터베이스 연결 정보, SQL 쿼리문, 매핑 등의 설정한 Configuration.xml의 경로를 설정하고 불러온다. 
		String resource = "pack/resource/Configuration.xml";
		// SqlSessionFactory를 생성하는 과정에서 예외가 발생할 수 있기 때문에 try ~ catch문 사용
		try {
			// 경로를 설정한 파일들을 읽기 위해서 Reader객체에 담아둔다. 
			Reader reader = Resources.getResourceAsReader(resource);
			// "pack/resource/Configuration.xml" 읽어서 sqlSession 객체에 부여
			sqlSession = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			System.out.println("SqlMapConfig 오류 : " + e);
		}
	}
    
	// 이 메서드를 통해 다른 클래스에서도 SqlSessionFactory 객체를 얻을 수 있다. 
	public static SqlSessionFactory getSqlSession() { // static이니 new 키워드를 안쓴다. 
		return sqlSession;
	}
}