package com.zerobase.fastlms.course.model;

import lombok.Data;

@Data
public class CourseInput {

    long id;
    long categoryId;
    String subject;
    String keyword;
    String summary;
    String contents;
    long price;
    long salePrice;
    String saleEndDtText;

    //for delete
//  List<String> ids;
    String idList;

    //file add
    String filename;
    String urlFilename;
}