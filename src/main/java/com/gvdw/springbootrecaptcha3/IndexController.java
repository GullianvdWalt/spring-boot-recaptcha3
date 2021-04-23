package com.gvdw.springbootrecaptcha3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created By Gullian Van Der Walt at 07:53 on Apr, 2021
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String getHome(){
        return "Welcome to Spring Boot with Google reCAPTCHA v3!";
    }
}
