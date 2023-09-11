package pack.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pack.model.DataDao;
import pack.model.JikwonDto;

@Controller
public class TestController {
	@Autowired
	private DataDao dataDao;  // 클래스의 포함관계로 가져옴
	
	@GetMapping("testdb")
	public String listProcess(Model model) {
		ArrayList<JikwonDto> slist = (ArrayList<JikwonDto>)dataDao.getDataAll();
		model.addAttribute("datas", slist);  // datas라는 키에 slist를 넘김
		return "list";
	}

	@GetMapping("search") public String searchProcess(FormBean fbean, Model model) {
		ArrayList<JikwonDto> slist = (ArrayList<JikwonDto>)dataDao.getDataSearch(fbean.getSearchValue());
	    model.addAttribute("datas", slist);
	    return "list";
	}	 
}
