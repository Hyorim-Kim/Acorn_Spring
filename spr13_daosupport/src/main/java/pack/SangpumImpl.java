package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

// Spring framework이 지원하는 JdbcDaoSupport를 사용
@Repository // 가독성을 위해서
public class SangpumImpl extends JdbcDaoSupport implements SangpumInter {
	@Autowired
	public SangpumImpl(DataSource dataSource) {
		setDataSource(dataSource); // constructor injection 생성자주입
	}

	@Override
	public List<SangpumDto> selectList() {
		RowMapper rowMapper = new SanpumRowMapper();
		return getJdbcTemplate().query("select * from sangdata", rowMapper);
	}

	// 내부 클래스
	class SanpumRowMapper implements RowMapper {
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