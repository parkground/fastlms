package com.zerobase.fastlms.member.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Member implements MemberCode {

    @Id
    private String userId;

    private String userName;
    private String phone;
    private String password;
    private LocalDateTime regDt;
    private LocalDateTime udtDt; //회원정보 수정일

    private boolean emailAuthYn;
    private LocalDateTime emailAuthDt;
    private String emailAuthKey;

    private String resetPasswordKey;
    private LocalDateTime resetPasswordLimitDt;

    /*
     case 1 관리자 여부를 지정할 것인가?
     case 2 회원에 따른 ROLE을 지정할 것인가?
     case 2-(1) 준회원, 정회원, 특별회원, 관리자
     ROLE_SEMI_USER, ROLE_USER, ROLE_SPECIAL_USER, ROLE_ADMIN
     case 2-(2) 준회원, 정회원, 특별회원
     관리자 여부 별도
    */
    private boolean adminYn;

    /* 이용가능상태, 정지상태 */
    private String userStatus;

    private String zipcode;
    private String addr;
    private String addrDetail;
}