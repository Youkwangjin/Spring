package pack.model;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;
import pack.resource.SqlMapConfig;

@Repository // 가독성을 위해서 

// Spring 프레임워크에서 지원하는 JdbcDaoSupport룰 사용
public class SangpumImpl implements SangpumInter{
	private SqlSessionFactory factory = SqlMapConfig.getSqlSession();
	
	
	@Override
	public List<SangpumDto> selectList() {
		SqlSession session = factory.openSession();
		List<SangpumDto> list = null;
		
		try {
			list = session.selectList("selectDataAll");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(session != null) session.close();
		}
		return list;
	}
}
