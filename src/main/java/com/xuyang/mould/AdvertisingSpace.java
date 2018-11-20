/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: AdvertisingSpace
 * Author:   PanYin
 * Date:     2018/11/19 11:14
 * Description: 轮播图和类型实体类
 */
package com.xuyang.mould;

/**
 * 〈一句话功能简述〉<br> 
 * 〈轮播图和类型实体类〉
 * @author PanYin
 * @create 2018/11/19
 * @since 1.0.0
 */
public class AdvertisingSpace {
    private Integer adverId;        //主键自动增长

    private String adverHeader;     //广告标题

    private String adverDesc;       //描述推广语

    private String adverImage;      //广告图片

    private String adverLink;       //广告链接

    private Integer spaceId;        //广告位置ID

    private String adverSwitch;     //广告开关

    private String spaceSeat;       //显示位置

    private String spaceSwitch;     //该位置是否开启

    public AdvertisingSpace(Integer adverId, String adverHeader, String adverDesc, String adverImage, String adverLink, Integer spaceId, String adverSwitch, String spaceSeat, String spaceSwitch) {
        this.adverId = adverId;
        this.adverHeader = adverHeader;
        this.adverDesc = adverDesc;
        this.adverImage = adverImage;
        this.adverLink = adverLink;
        this.spaceId = spaceId;
        this.adverSwitch = adverSwitch;
        this.spaceSeat = spaceSeat;
        this.spaceSwitch = spaceSwitch;
    }

    public AdvertisingSpace() {
    }

    public Integer getAdverId() {
        return adverId;
    }

    public void setAdverId(Integer adverId) {
        this.adverId = adverId;
    }

    public String getAdverHeader() {
        return adverHeader;
    }

    public void setAdverHeader(String adverHeader) {
        this.adverHeader = adverHeader;
    }

    public String getAdverDesc() {
        return adverDesc;
    }

    public void setAdverDesc(String adverDesc) {
        this.adverDesc = adverDesc;
    }

    public String getAdverImage() {
        return adverImage;
    }

    public void setAdverImage(String adverImage) {
        this.adverImage = adverImage;
    }

    public String getAdverLink() {
        return adverLink;
    }

    public void setAdverLink(String adverLink) {
        this.adverLink = adverLink;
    }

    public Integer getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(Integer spaceId) {
        this.spaceId = spaceId;
    }

    public String getAdverSwitch() {
        return adverSwitch;
    }

    public void setAdverSwitch(String adverSwitch) {
        this.adverSwitch = adverSwitch;
    }

    public String getSpaceSeat() {
        return spaceSeat;
    }

    public void setSpaceSeat(String spaceSeat) {
        this.spaceSeat = spaceSeat;
    }

    public String getSpaceSwitch() {
        return spaceSwitch;
    }

    public void setSpaceSwitch(String spaceSwitch) {
        this.spaceSwitch = spaceSwitch;
    }
}
