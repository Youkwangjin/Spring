package pack.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import pack.resource.SqlMapConfig;

// spring framework이 지원하는 JdbcDaoSupport를 사용
@Repository
public class SangpumImpl implements SangpumInter {
	private SqlSessionFactory factory = SqlMapConfig.getSqlSession();
	
   @Override
   public List<SangpumDto> selectList() {
	  SqlSession session = factory.openSession();
	  List<SangpumDto> list = null;
	  
	  try {
		list = session.selectList("selectDataAll");
	} catch (Exception e) {
		System.out.println("selectList err : " + e);
	} finally {
		if(session != null) session.close();
	}
	  
      return list;
   }

	@Override
	public List<SangpumDto> selectList2() {
		SqlSession session2 = factory.openSession();
		List<SangpumDto> list2 = null;
		
		  try {
				list2 = session2.selectList("selectDataAll2");
			} catch (Exception e) {
				System.out.println("selectList err : " + e);
			} finally {
				if(session2 != null) session2.close();
			}
		
		return list2;
	}

	@Override
	public List<SangpumDto> selectList3() {
		SqlSession session3 = factory.openSession();
		List<SangpumDto> list3 = null;
		  try {
				list3 = session3.selectList("selectDataAll3");
			} catch (Exception e) {
				System.out.println("selectList err : " + e);
			} finally {
				if(session3 != null) session3.close();
			}
		return list3;
		
	}
}