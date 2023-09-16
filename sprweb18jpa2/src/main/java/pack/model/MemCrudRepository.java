package pack.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MemCrudRepository extends JpaRepository<MemDto, Integer>{
   // 자동 증가 처리를 할 경우 아래처럼 코드를 작성
   //@Query(value="select max(p.num) from MemDto as p")
   //@Query(value="select max(p.num) from mem",nativeQuery = true)
   //int findByMaxNum();
   
   @Query(value="select m from MemDto as m where m.num=?1")
   MemDto findByNum(String num);
   
}