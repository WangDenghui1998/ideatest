package com.example.springboot0227.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class culControler {

    @RequestMapping("/test")
    public String test(){
        return "test success!";
    }


    public void add(){
        System.out.println("增加测试");
    }
    
    public void del() {
        System.out.println("github增加测试");
        System.out.println("gou test");
    }


}
