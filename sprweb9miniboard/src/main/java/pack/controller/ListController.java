package pack.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pack.model.Board;
import pack.model.BoardDao;

@Controller
public class ListController {
	@Autowired
	private BoardDao boardDao;
	
	@RequestMapping("list")
	public String list(Model model) {
		ArrayList<Board> list = (ArrayList<Board>)boardDao.list();
		model.addAttribute("list", list);  // model에 담음
		return "list";  // view file list.html(server) 호출
		// templates: server side, tomcat 간섭(java 포함)
		// static: client side, 평범한 html
	}
}
