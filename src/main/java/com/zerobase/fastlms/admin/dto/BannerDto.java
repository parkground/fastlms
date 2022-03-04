package com.zerobase.fastlms.admin.dto;
import com.zerobase.fastlms.admin.entity.Banner;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BannerDto {

    Long id;
    String targetOpen;
    String bannerName;
    String imgPath;
    LocalDateTime regDt;
    LocalDateTime udtDt;
    int alignValue;
    boolean publicYn;
    String filename;
    String urlFilename;
    String urlAddr;

    long totalCount;
    long seq;

    public static List<BannerDto> of (List<Banner> banners) {
        if (banners != null) {
            List<BannerDto> bannerList = new ArrayList<>();
            for (Banner x : banners) {
                bannerList.add(of(x));
            }
            return bannerList;
        }
        return null;
    }

    public static BannerDto of(Banner banner) {

        return BannerDto.builder()
                .id(banner.getId())
                .targetOpen(banner.getTargetOpen())
                .bannerName(banner.getBannerName())
                .imgPath(banner.getImgPath())
                .regDt(banner.getRegDt())
                .udtDt(banner.getUdtDt())
                .alignValue(banner.getAlignValue())
                .publicYn(banner.isPublicYn())
                .filename(banner.getFilename())
                .urlFilename(banner.getUrlFilename())
                .urlAddr(banner.getUrlAddr())
                .build();
    }

    public String getRegDtText() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
        return regDt != null ? regDt.format(formatter) : "";
    }
}
