package com.zerobase.fastlms.main.controller;

import com.zerobase.fastlms.admin.dto.BannerDto;
import com.zerobase.fastlms.admin.model.BannerInput;
import com.zerobase.fastlms.admin.model.BannerParam;
import com.zerobase.fastlms.admin.service.BannerService;
import com.zerobase.fastlms.course.controller.BaseController;
import com.zerobase.fastlms.course.dto.TakeCourseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class MainController extends BaseController {

    private final BannerService bannerService;

    @GetMapping("/")
    public String index(Model model, BannerParam parameter) {

        parameter.init();

        List<BannerDto> listIndex = bannerService.listIndex(parameter);

        long totalCount = 0;
        if (!CollectionUtils.isEmpty(listIndex)) {
            totalCount = listIndex.get(0).getTotalCount();
        }
        String queryString = parameter.getQueryString();
        String pagerHtml = super.getPagerHtml(totalCount, parameter.getPageSize(), parameter.getPageIndex(), queryString);

        model.addAttribute("listIndex", listIndex);
        model.addAttribute("totalCount", totalCount);
        model.addAttribute("pager", pagerHtml);

        return "index";
    }

    @RequestMapping("/error/denied")
    public String errorDenied() {

        return "error/denied";
    }
}
