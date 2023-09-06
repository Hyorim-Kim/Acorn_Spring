package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pack.model.SangpumDto;
import pack.model.SangpumInter;


@Service
public class BusinessImpl implements BusinessInter {
	@Autowired
	private SangpumInter sangpumInter;

	   @Override
	   public void dataShow() {
	      List<SangpumDto> list = sangpumInter.selectList();
	      System.out.println("사번 이름 부서명 입사년");
	      for(SangpumDto s:list) {
	         System.out.println( s.getJikwon_no() + " " +s.getJikwon_name() + " " + s.getBuser_name() + " " + s.getIbsa());
	      }
	   }
	   @Override
	   public void dataShow2() {
	      List<SangpumDto> list2 = sangpumInter.selectList2();
	      System.out.println("-----------");
	      System.out.println("부서별 인원수");
	      for (SangpumDto b : list2) {
	         System.out.println(b.getBuser_name() + " " + b.getCount());
	      }
	   }
	   @Override
	   public void dataShow3() {
	      List<SangpumDto> list3 = sangpumInter.selectList3();
	      System.out.println("-----------");
	      System.out.println("부서별 최대 급여자");
	      for (SangpumDto c : list3) {
	         System.out.println(c.getBuser_name() + " : " + c.getJikwon_name() +  " (" + c.getJikwon_pay() +  ") ");
	      }
	   }

	}

