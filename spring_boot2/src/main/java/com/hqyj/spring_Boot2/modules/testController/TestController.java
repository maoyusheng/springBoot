package com.hqyj.spring_Boot2.modules.testController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/test")
@Controller
public class TestController {

    @RequestMapping("/testDesc")
    @ResponseBody
    public String testDesc(){
        return "This is modules testDesc";
    }
}
