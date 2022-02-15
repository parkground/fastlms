package com.zerobase.fastlms;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class MainPage {

    @RequestMapping("/")
    public String index() {

        return "Index Page";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response) {

        String msg = "<html>" +
                "<head>" +
                "</head>" +
                "<body>" +
                "<p>hello</p> <p>fastlms website!!!</p>" +
                "</body>" +
                "<html>";

        return msg;
    }

}
