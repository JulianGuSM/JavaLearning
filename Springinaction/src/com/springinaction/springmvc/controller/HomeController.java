package com.springinaction.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author : Julian
 * @date : 2019/3/4 14:59
 *
 * 假设控制器要处理对“/”的请求，并渲染应用的首页
 * HomeController可能是最 简单的Spring MVC控制器类
 *
 * HomeController是一个构造型（stereotype）的注解，它基于 @Component注解。
 */

@Controller // 声明为一个控制器
public class HomeController {

    @RequestMapping(value = "/", method = GET) //处理对“/”的GET请求
    public String home(){
        return "home"; //视图名为home
    }
}
