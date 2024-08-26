package com.sayan97_saha.demo.myspringapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@RequestMapping("/test_api")
public class FunRestController {

    @GetMapping("/test_endpoint")
    public static String say_hello(){
        return "Hi everyone!";
    }

    @GetMapping("/greet_user")
    public static String greet_user(@RequestParam(value = "name") String name){
        return "Hi " + name + "!";
    }

}
