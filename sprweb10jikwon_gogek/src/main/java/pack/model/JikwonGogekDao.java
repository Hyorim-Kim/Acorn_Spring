package pack.model;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JikwonGogekDao {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired  // qualifier와 함께 사용해야할 때가 있음
	private DataMappingInterface mappingInterface;
	
	public List<JikwonDto> selectAll(){  // selectAll: 일반메소드 이름
		List<JikwonDto> jlist = mappingInterface.selectAll();  // selectAll: 추상메소드 이름
		logger.info("읽은 자료 수 : " + jlist.size());
		return jlist;
	}
	
	public List<GogekDto> selectGogek(String jikwon_no){  // selectAll: 일반메소드 이름
		List<GogekDto> glist = mappingInterface.selectGogek(jikwon_no);  // selectAll: 추상메소드 이름
		logger.info("읽은 자료 수 : " + glist.size());
		return glist;
	}
}
