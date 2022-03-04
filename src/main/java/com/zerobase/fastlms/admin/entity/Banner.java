package com.zerobase.fastlms.admin.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Banner implements BannerCode {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Long id;

    String bannerName;
    String imgPath;

    LocalDateTime regDt;
    LocalDateTime udtDt;

    int alignValue;
    boolean publicYn;

    String targetOpen;

    String filename;
    String urlFilename;
    String urlAddr;
}