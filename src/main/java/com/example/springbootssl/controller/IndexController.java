package com.example.springbootssl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    //keytool -genkey -alias tomcat -keyalg RSA -keystore /Users/liuzhiyang/excise/keystore/tomcat.keystore
    //秘钥库口令与tomcat口令设置相同，为123456
    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }
}
