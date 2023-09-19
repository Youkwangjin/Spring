package pack;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository // 가독성을 위해서 

// Spring 프레임워크에서 지원하는 JdbcDaoSupport룰 사용
public class SangpumImpl extends JdbcDaoSupport implements SangpumInter{
	

	@Autowired // 생성자 주입 
	public SangpumImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}
	

	@Override
	public List<SangpumDto> selectList() {
		RowMapper rowMapper = new SangpumRowMapper();
		return getJdbcTemplate().query("select * from sandata", rowMapper);

	}
	
	// 내부 클래스
	class SangpumRowMapper implements RowMapper {
		@Override
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
	        System.out.println("rowNum : " + rowNum);
	         SangpumDto dto = new SangpumDto();
	         dto.setCode(rs.getString("code"));
	         dto.setSang(rs.getString("sang"));
	         dto.setSu(rs.getString("su"));
	         dto.setDan(rs.getString("dan"));
	         
	         return dto;
	         
			
		}
	}
		

}
