package pack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("test9")
public class TestController2 {
	//@RequestMapping(value = "test9", method=RequestMethod.GET)
	@RequestMapping(method=RequestMethod.GET)  //@RequestMapping("test9")을 적었을때
	public String def(Model model) {
		model.addAttribute("msg", "success get");
		return "list";   // 뷰파일은 list 한개임, forward 방식(서버에서 서버의 파일을 직접 부름)
	}
	//@RequestMapping(value = "test9", method=RequestMethod.POST)
	@RequestMapping(method=RequestMethod.POST)
	public String def2(Model model) {
		model.addAttribute("msg", "success post");
		return "list";   // 뷰파일은 list 한개임, forward 방식(서버에서 서버의 파일을 직접 부름)
	}
}
