package com.zhihua.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: zhihua
 * @Date: 2019/5/14
 */
@RestController
public class CustomerController {
    @RequestMapping("/hello")
    public String  index(){
        return "hello word";
    }

}