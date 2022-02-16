package com.zerobase.fastlms.member.controller;

import com.zerobase.fastlms.member.model.MemberInput;
import com.zerobase.fastlms.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@RequiredArgsConstructor
@Controller
public class MemberController {

    private final MemberService memberService;
/* @RequiredArgsConstructor 사용하여 아래를 대체 가능
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
*/
    @GetMapping("/member/register")
    public String register() {

        return "member/register";
    }

    @PostMapping("/member/register")
    public String registerSubmit(Model model,
                                 HttpServletRequest request,
                                 MemberInput parameter) {

        boolean result = memberService.register(parameter);

        model.addAttribute("result", result);

        return "member/register_complete";
    }

/*
    http://www.naver.com:80/news/list.do?id=123&key=456&text=query
    https://
    protocol://domain(IP):port/sub-address/?queryString(parameter)
    - web port : 80 (default, 생략가능)
    - tomcat port : 8080 (test)

 */

    @GetMapping("/member/email-auth")
    public String emailAuth(Model model,
                            HttpServletRequest request) {

        String uuid = request.getParameter("id");
        System.out.println(uuid);

        boolean result = memberService.emailAuth(uuid);
        model.addAttribute("result", result);

        return "member/email_auth";
    }
}

