package pack.controller;

import pack.model.DataDao;

public class BusinessServiceImpl implements BusinessService {
	private DataDao dataDao;
	
	/*
	public BusinessServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	*/
	
	public BusinessServiceImpl(DataDao dataDao) {  // parameter가 있는 생성자 (init.xml의 BusinessServiceImpl는 parameter가 없는 생성자를 호출) - init 수정
		// 생성자를 통해 DB 처리용 영역 클래스의 객체주소를 치환(injection)
		this.dataDao = dataDao;
	}
	
	@Override
	public void selectProcess() {
		// DB와 연결해 자료를 읽는 DataDaoImpl 클래스의 selectData 메소드 실행
		dataDao.selectData();
	}
}
