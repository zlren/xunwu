package lab.zlren.xunwu.controller;

import lab.zlren.xunwu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zlren
 * @date 2018-01-07
 */
@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("hello")
    public String hello() {
        userService.testTx();
        return "hello";
    }
}
