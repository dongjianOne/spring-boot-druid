package com.dong.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author DongJian
 * @Date Created in 2020/3/15 16:50
 * Utils: Intellij Idea
 * @Description:
 * @Version:1.0
 */
@RestController
public class HelloController {
    /**
     * 测试请求监控
     * @param str
     * @return
     */
    @GetMapping("/hello")
    public String hello(String str){
        return str;
    }
}
