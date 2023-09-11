package pack.model;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DataMapperInterface {
	@Select("select jikwon_no, jikwon_name, jikwon_jik, buser_name, jikwon_pay from jikwon inner join buser on buser_no = buser_num")
	List<JikwonDto> selectAll();
	
	@Select("SELECT jikwon_no, jikwon_name, jikwon_jik, buser_name, jikwon_pay FROM jikwon INNER JOIN buser ON buser_num = buser_no WHERE jikwon_name LIKE CONCAT(#{svalue}, '%')")
	List<JikwonDto> selectSearch(String svalue);

	 
}
