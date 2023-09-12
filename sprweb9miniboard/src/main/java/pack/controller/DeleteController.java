package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pack.model.BoardDao;

@Controller
public class DeleteController {
	@Autowired
	private BoardDao boardDao;
	
	@RequestMapping("delete")
	public String update(@RequestParam("num")String num) {  // 여러개 중 num만 받음
		// boardbean - detail.html 이름 맞춰야 넘어감
		boolean b = boardDao.delete(num);
		if(b) 
			return "redirect:/list";  // 삭제 후 목록보기
		else
			return "error";		
	}
}
