import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GugudanController {

    @GetMapping("/gugudan")
    public String inputForm() {
        return "input.html"; // 변경된 부분: "input.html"로 반환
    }

    @PostMapping("/insdata")
    public String calculateGugudan(@RequestParam int gugudan) {
        // 구구단 계산

        return "result";
    }
}