package cn.coolwind.ssmdemo.controller;

import cn.coolwind.ssmdemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public Object test() {
        return testService.getById(1);
    }
}
