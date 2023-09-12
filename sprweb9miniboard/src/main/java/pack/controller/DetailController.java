package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pack.model.Board;
import pack.model.BoardDao;

@Controller
public class DetailController {
	@Autowired
	private BoardDao boardDao;
	
	@GetMapping("detail")  //detail 요청
	public String detail(@RequestParam("num")String num, Model model) {
		Board board = boardDao.detail(num);  // 하나 읽어서 board에 담음
		model.addAttribute("board", board);
		return "detail";  //detail.html(templates) 호출
	}
}
