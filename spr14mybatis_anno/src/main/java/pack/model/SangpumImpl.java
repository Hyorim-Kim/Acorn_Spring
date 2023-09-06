package pack.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

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
			//xml 일 때
			//list = session.selectList("selectDataAll");
			
			//MyBatis annotation 일 때
			SqlMapperInter inter = (SqlMapperInter)session.getMapper(SqlMapperInter.class);
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
			//list2 = session.selectList("selectDataAll2");
			//MyBatis annotation 일 때
			SqlMapperInter inter = (SqlMapperInter)session2.getMapper(SqlMapperInter.class);
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
			//list3 = session3.selectList("selectDataAll3");
			//MyBatis annotation 일 때
			SqlMapperInter inter = (SqlMapperInter)session3.getMapper(SqlMapperInter.class);
			list3 = inter.selectList3();
		} catch (Exception e) {
			System.out.println("selectList3 err : " + e);
		} finally {
			if(session3 != null) session3.close();
		}
		
		return list3;
	}
}