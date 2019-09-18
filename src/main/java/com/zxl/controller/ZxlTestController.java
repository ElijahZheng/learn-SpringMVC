package com.zxl.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *@author Ay
 * @date 2018/04/02
 */
@Controller
@RequestMapping("/test")
public class ZxlTestController {

    @GetMapping("/sayHello")
    public String sayHello(){
        return "hello";
    }
}