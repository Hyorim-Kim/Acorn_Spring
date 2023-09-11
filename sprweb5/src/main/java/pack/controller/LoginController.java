package pack.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {  // controller 생성은 선택적(하나의 요청마다 매핑도O)
	// Logger란 프로그램 개발 중이나 완료 후 프로그램 상태를 모니터링하기 위해 필요한 정보(로그)를 기록하는 것
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("login")
	public String submitcall() {
		return "redirect:http://localhost/login.html";  // redirect 방식 (기본은 forward)
	}
	
	// 방법1 : 전통적 방법 사용하여 클라이언트 값 받기
	/*
	@GetMapping("loginget")
	public String submit(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		System.out.println("console로 출력" + id + " " + pwd);  // 프로그램 진행 중 값 확인하기
		logger.info("진행 도중 로그 정보를 출력" + id + " " + pwd);   // 로그 레벨 trace > info > warn > error : 우선순위 하위의 것도 모두 보임
		
		String data = "";
		if(id.equals("aa") && pwd.equals("11"))
			data = "로그인 성공";
		else
			data = "로그인 실패";
		
		model.addAttribute("data", data);
		return "result";  // forwarding (views에서 찾기(properties))
	}
	*/
	
	// 방법2 : spring 방법
	@GetMapping("loginget")
	public String submit(@RequestParam(value = "id")String id,
			 			 @RequestParam("pwd")String pwd,
			 			 Model model) {   // String - int로 처리 가능
		String data = "";
		if(id.equals("aa") && pwd.equals("11"))
			data = "와우 로그인 성공";
		else
			data = "ㅠㅠ 로그인 실패";
		
		model.addAttribute("data", data);  // data 키에 data 값 넘어옴
		return "result";   // forwarding
		
	}
}
