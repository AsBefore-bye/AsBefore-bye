package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
public class MainController {
    @RequestMapping("/login")
//        @ResponseBody
    public String login(HttpServletRequest request){
        MDC.put("reqId", request.getSession().getId());
        log.info("有人访问登录页面");
        return "login";
    }
        @RequestMapping("/index")
//        @ResponseBody
        public String index(HttpServletRequest request){
            MDC.put("reqId", request.getSession().getId());
            log.info("有人访问图片");
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

