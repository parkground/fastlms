package com.zerobase.fastlms.admin.model;

import lombok.Data;

@Data
public class BannerInput {

    long id;

    String bannerName;
    String urlAddr;
    String targetOpen;
    int alignValue;
    boolean publicYn;

    String filename;
    String urlFilename;

    //삭제를 위한 속성
    String idList;


}
