package ycyz.demo.SpringDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/index")
    public String index() {
        return "你好，张三。"; // 如果你叫其他名字，请相应地修改这里
    }
}