package com.zerobase.fastlms.member.model;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@Data
public class MemberInput {

    private String userId;
    private String userName;
    private String phone;
    private String password;
    private LocalDateTime regDt;

    private String newPassword;

    private String zipcode;
    private String addr;
    private String addrDetail;
}