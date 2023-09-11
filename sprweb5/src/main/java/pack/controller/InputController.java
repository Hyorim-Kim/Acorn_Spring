package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import pack.model.SangpumBean;
import pack.model.SangpumModel;

@Controller
public class InputController {	
	// 모델에 있는 클래스를 포함관계로 끌고옴
	@Autowired
	private SangpumModel sangpumModel;
	
	@GetMapping("insdata")
	public String submitCall() {
		return "redirect:http://localhost/input.html";  // redirect
	}
	
	// 동일한 방법이지만 post 방법이면 아래 코드가 실행됨
	@PostMapping("insdata")
	public String submit(SangpumBean bean, Model model) {
		String imsi = sangpumModel.sangProcess(bean);
		model.addAttribute("sangdata", imsi);  // imsi는 sangProcess가 넘겨줌, sangdata:sangpumModel에서 넘어옴
		return "result2";  // forward(기본)
	}
}
