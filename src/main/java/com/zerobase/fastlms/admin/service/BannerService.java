package com.zerobase.fastlms.admin.service;

import com.zerobase.fastlms.admin.dto.BannerDto;
import com.zerobase.fastlms.admin.model.BannerInput;
import com.zerobase.fastlms.admin.model.BannerParam;

import java.util.List;

public interface BannerService {

    List<BannerDto> list();

    /**
     * 배너 추가
     */
    boolean add(BannerInput parameter);

    /**
     * 배너 수정
     */
    boolean set(BannerInput parameter);

    /**
     * 배너 목록
     */
    List<BannerDto> list(BannerParam parameter);

    /**
     * 배너 목록 - 인덱스 페이지 노출
     */
    List<BannerDto> listIndex(BannerParam parameter);

    /**
     * 배너 상세정보
     */
    BannerDto getById(long id);

    /**
     * 배너 삭제
     */
    boolean del(String idList);
}
