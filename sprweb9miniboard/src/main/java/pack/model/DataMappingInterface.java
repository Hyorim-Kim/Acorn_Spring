package pack.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import pack.controller.BoardBean;

@Mapper
public interface DataMappingInterface {
	// 추상메소드의 이름은 mapper.xml의 id명과 일치시킨다.
	
	List<Board> selectList();
	List<Board> selectSearch(BoardBean bean);
	Board selectOne(String num);  // 상세보기를 위해 자료하나 읽음
	
	// mapper의 id명과 일치
	int insert(BoardBean bean);
	void updateReadcnt(String num);  // 조회수 증가
	int update(BoardBean bean);
	int delete(String num);
}
