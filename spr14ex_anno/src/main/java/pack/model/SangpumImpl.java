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
		  SangpumInter inter = (SangpumInter) session.getMapper(SangpumInter.class);
		 // @Select(selectList)입력한 SQL 쿼리를 실행하여 모든 직원 정보를 가져오는거임
		  list = inter.selectList();
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
			  SangpumInter inter = (SangpumInter) session2.getMapper(SangpumInter.class);
				 // @Select(selectList)입력한 SQL 쿼리를 실행하여 모든 직원 정보를 가져오는거임
			  list2 = inter.selectList2();
			} catch (Exception e) {
				System.out.println("selectList2 err : " + e);
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
			  // @Select(selectList)입력한 SQL 쿼리를 실행 정보를 가져오는거임 (annotation 방법)
			  SangpumInter inter = (SangpumInter) session3.getMapper(SangpumInter.class);
				 
			  list3 = inter.selectList3();
			} catch (Exception e) {
				System.out.println("selectList3 err : " + e);
			} finally {
				if(session3 != null) session3.close();
			}
		return list3;
		
	}
}