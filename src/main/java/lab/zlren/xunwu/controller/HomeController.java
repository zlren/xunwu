package lab.zlren.xunwu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zlren
 * @date 2018-01-07
 */
@Controller
public class HomeController {

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("name", "参数传递修改");
        return "index";
    }
}
