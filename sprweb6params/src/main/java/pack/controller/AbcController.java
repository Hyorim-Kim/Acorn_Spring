package pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

// 클라이언트 요청 처리
@Controller
public class AbcController {
	@GetMapping(value="kbs/login", params="type=admin")  // params의 타입이 admin이면 아래 코드 만남
	public String kbs(Model model) {
		model.addAttribute("message", "관리자");
		return "list";  // forwarding - templates가 받음 ***
	}
	
	@GetMapping(value="kbs/login", params="type=user")  // params의 타입이 user면 아래 코드 만남
	public String mbc(Model model) {
		model.addAttribute("message", "일반 회원");
		return "list";  // forwarding
	}
	
	@GetMapping(value="kbs/login", params="!type")  // params의 타입이 없으면 아래 코드 만남
	public String sbs(Model model) {
		model.addAttribute("message", "type 값 없음");
		return "list";  // forwarding
	}
	
	@PostMapping(value="kbs/login", params="type=user")  // params의 타입이 user면 아래 코드 만남
	public String ytn(Model model) {
		model.addAttribute("message", "일반 회원입니다");
		return "list";
	}
	
	// action="mbc/정보1/정보2"   name="name"
	@GetMapping(value="mbc/{url}")
	public String aaa(@RequestParam("name")String name,
			@PathVariable String url,  // {url}과 이름일치
			Model model) {
		model.addAttribute("message", "이름은 : " + name + ", 국적은 " + url);
		return "list";  // forwarding
	}
	
	// action="mbc/정보1/정보2"   name="name"
	@GetMapping(value="ent/{co}/singer/{singer}")
	public String aaa(@RequestParam("title")String title,
			@PathVariable String co,
			@PathVariable String singer,
			Model model) {
		String ss = "소속사 : " + co + ", 가수 : " + singer + ", 타이틀 송 : " + title;
		model.addAttribute("message", ss);
		return "list";  // forwarding
	}
}
