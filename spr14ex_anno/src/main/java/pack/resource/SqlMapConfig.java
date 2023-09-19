package pack.resource;

import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import pack.model.SangpumInter;

public class SqlMapConfig {
	public static SqlSessionFactory sqlSession; // DB의 SQL명령을 실행시킬 때 필요한 메소드를 갖고 있다.

	static {
		String resource = "pack/resource/Configuration.xml";
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			sqlSession = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
			Class[] mappers = { SangpumInter.class };
			for (Class m : mappers) {
				// SqlSessionFactory에 mapper 등록
				sqlSession.getConfiguration().addMapper(m); // 클래스의 포함관계(. 2)
			}
		} catch (Exception e) {
			System.out.println("SqlMapConfig 오류 : " + e);
		}
	}

	public static SqlSessionFactory getSqlSession() {
		return sqlSession;
	}
}