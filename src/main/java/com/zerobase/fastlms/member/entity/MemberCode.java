package com.zerobase.fastlms.member.entity;

public interface MemberCode {

    /**
     * 현재 가입 요청 상태
     */
    String MEMBER_STATUS_REQ = "REQ";

    /**
     * 현재 정상 이용 상태
     */
    String MEMBER_STATUS_ING = "ING";

    /**
     * 현재 정지 상태
     */
    String MEMBER_STATUS_STOP = "STOP";

    /**
     * 현재 탈퇴 상태
     */
    String MEMBER_STATUS_WITHDRAW = "WITHDRAW";
}