package com.example.controller;

import com.example.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    //表示这是一个get请求的接口
    @GetMapping("/hello")//全局唯一
    public Result hello() {
        return Result.success("hello world");
    }
}
