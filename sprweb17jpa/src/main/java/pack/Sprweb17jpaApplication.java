package pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.Query;

import pack.model.ProductCrudRepository;
import pack.model.ProductVo;

@SpringBootApplication
public class Sprweb17jpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sprweb17jpaApplication.class, args)
		 	.getBean(Sprweb17jpaApplication.class).myExcute();
	}
	
	
	@Autowired
	ProductCrudRepository repository;


	private void myExcute() {
		System.out.println("독립 프로그램으로 실행");
		
		//insertData();
		
		//deleteData();
		
		selectData();
	}
	
	private void insertData() {
		// 엔티티 생성
		ProductVo productVo = new ProductVo();
		productVo.setSang("지우개4");
		productVo.setSu(20);
		productVo.setDan(4000);
		productVo = repository.save(productVo);  // insert
		System.out.println("등록된 데이터 : " + productVo);
		
		productVo.setCode(5);
		productVo.setSang("마우스");
		productVo.setSu(6);
		productVo = repository.save(productVo);  // update
		System.out.println("등록된 데이터 : " + productVo);
	}
	
	private void deleteData() {
		repository.deleteById(6);
	}
	
	private void selectData() {
		System.out.println("전체 레코드 읽기");
		List<ProductVo> list = repository.findAll();
		
		for(ProductVo vo:list) {
			System.out.println(vo.getCode() + " " + vo.getSang() + " " + vo.getSu() + " " + vo.getDan());
		}
		
		System.out.println("부분 레코드 읽기");
		ProductVo vo = repository.findById(1).get();
		System.out.println(vo.getCode() + " " + vo.getSang() + " " + vo.getSu() + " " + vo.getDan());
		
		System.out.println("JPQL(Java Persistence Query Language)");
		List<ProductVo> list2 = (List<ProductVo>)repository.findAllData();
		for(ProductVo vo2:list2) {
			System.out.println(vo2.getCode() + " " + vo2.getSang() + " " + vo2.getSu() + " " + vo2.getDan());
		}
		
		ProductVo vo3 = repository.findByCode(1);
		System.out.println(vo3.getCode() + " " + vo3.getSang() + " " + vo3.getSu() + " " + vo3.getDan());
		
		System.out.println();
		List<ProductVo> list3 = repository.findData(2, "우산");
		for(ProductVo vo4:list3) {
			System.out.println(vo4.getCode() + " " + vo4.getSang() + " " + vo4.getSu() + " " + vo4.getDan());
		}		
	}
}
