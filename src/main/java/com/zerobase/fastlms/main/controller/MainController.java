package com.zerobase.fastlms.main.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class MainController {

    @RequestMapping("/")
    public String index() {

        /*
        String email = "81scramble@gmail.com";

        String subject = " 안녕하세요. 제로베이스 입니다. ";
        String text = "<p>HTML TEXT</p><p>테스트</p>";

        mailComponents.sendMail(email, subject, text);
        */
        return "index";
    }

    @RequestMapping("/error/denied")
    public String errorDenied() {

        return "error/denied";
    }
}