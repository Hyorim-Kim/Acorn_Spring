package pack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

//import jakarta.servlet.http.HttpServletRequest;

//Controller : 주로 사용자의 요청을 처리(Model을 경유) 한 후 지정된 View에 모델 객체를 전달하는 역할. (인스턴스 생성 된다). 클라이언트와 데이터 입출력을 제어하는 클래스
@Controller  //Component라고 적어도 되지만 Controller를 어노테이션 함  
public class TestController {  // scan때문에 같은 pack 안에 클래스를 만들어줘야함
	@RequestMapping("test1")  // DispatcherServelet으로부터 위임받은 HandlerMapping에 의해 처리.. test1이 요청이 들어오면 abc()와 Mapping한다.
	public ModelAndView abc() {
		// BL처리 또는 모델 영역을 수행하는 역할
		System.out.println("abc 처리");
		
		// Model 인터페이스는 처리한 데이터를 뷰에 표시하기 위한 데이터를 전달. 내부적으로 HttpServletRequest 객체를 사용함		
		//HttpServletRequest request = new HttpServletRequest();
		//request.setAttribute("msg", "나이스");
		return new ModelAndView("list", "msg", "나이스");  // ModelAndView에서 View파일명 : list key : msg, value : 나이스 로 지정
		// DispatcherServelet으로부터 위임받은 ViewResolver에 의해 처리
	}
	@RequestMapping(value="test2", method=RequestMethod.GET)  //get,post 구분할때는 value를 적어야함  .. value={"test2","hi","hello"}
	public ModelAndView abc2() {
		return new ModelAndView("list", "msg", "나이스2");
	}
	@GetMapping("test3")   //get 요청 처리용 전용 annotation, @RequestMapping(value="test2", method=RequestMethod.GET)와 같음
	public ModelAndView abc3() {
		return new ModelAndView("list", "msg", "나이스3");
	}
	@GetMapping("test4")
	public String abc4(Model model) {
		model.addAttribute("msg", "나이스4");
		return "list";  // list:뷰파일명, 모델은 내부적으로 달고감
	}
	@RequestMapping(value="test5", method=RequestMethod.POST)  //get,post 구분할때는 value를 적어야함  ..
	public ModelAndView abc5() {
		return new ModelAndView("list", "msg", "post 요청 성공5");
	}
	@PostMapping("test6")   //post 요청 처리용 전용 annotation
	public ModelAndView abc6() {
		return new ModelAndView("list", "msg", "post 요청 성공6");
	}
	@PostMapping("test7")
	public String abc7(Model model) {
		model.addAttribute("msg", "post 요청 성공7");
		return "list";  // list:뷰파일명, 모델은 내부적으로 달고감
	}
	@GetMapping("test8")
	@ResponseBody  //** ajax 하려면 필수
	public String abc8(Model model) {
		String value = "일반적인 데이터(String, MAP, JSON 등을 전달)";
		return value;
	}
	@GetMapping("test8_1")
	@ResponseBody  //** ajax 하려면 필수
	public DataDto abc8_1(Model model) {
		DataDto dto = new DataDto();
		dto.setCode(5);
		dto.setName("신기해");
		return dto;   //JSON 형태로 반환(jackson 라이브러리가 자동 지원)
	}
}
