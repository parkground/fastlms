package com.zerobase.fastlms.course.dto;

import lombok.Data;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

@Data
public class TakeCourseDto {

    Long id;
    long courseId;
    String userId;

    long payPrice;  //결제금액
    String status;  //상태(수강신청, 결제완료, 수강취소)

    LocalDateTime regDt;    //신청일

    //Join
    String userName;
    String phone;
    String subject;

    //Add column
    long totalCount;
    long seq;

    public String getRegDtText() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:m");
        return regDt != null ? regDt.format(formatter) : "";
    }
}
