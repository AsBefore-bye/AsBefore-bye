package com.example.controller;

import com.example.listener.TestEvent;
import com.example.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
public class MainController {
    @Resource
    TestService service;
    @Resource
    ApplicationContext context;
    @RequestMapping("/login")
//        @ResponseBody
    public String login(HttpServletRequest request){
        MDC.put("reqId", request.getSession().getId());
        service.test();
        System.out.println("我是同步方法");
        log.info("有人访问登录页面");
        return "login";
    }
        @RequestMapping("/index")
//        @ResponseBody
    public String index(HttpServletRequest request){
        MDC.put("reqId", request.getSession().getId());
        context.publishEvent(new TestEvent("有人访问系统"));
        log.info("有人访问系统");
        return "index";
    }
}
//    @RequestMapping("/student")
//    @ResponseBody
//    public StudentTest student() {
//        StudentTest student = new StudentTest();
//        student.setName("小明");
//        student.setSex("男");
//        student.setSid(10);
//        return student;

