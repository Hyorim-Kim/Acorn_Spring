package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pack.model.BoardDao;

@Controller
public class UpdateController {
	@Autowired
	private BoardDao boardDao;
	
	@RequestMapping("update")
	public String update(BoardBean bean) {
		// boardbean - detail.html 이름 맞춰야 넘어감
		boolean b = boardDao.update(bean);
		if(b) 
			return "redirect:/list";
		else
			return "error";		
	}
}
