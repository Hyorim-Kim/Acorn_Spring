package pack.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import pack.resource.SqlMapConfig;


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
}