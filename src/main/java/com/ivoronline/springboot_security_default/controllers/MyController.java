package com.ivoronline.springboot_security_default.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/hello")
  public String sayHello() {
    return "Message from Controller";
  }

}



