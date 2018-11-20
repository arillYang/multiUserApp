/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: DynamicToGlobal
 * Author:   PanYin
 * Date:     2018/11/20 14:23
 * Description: 全球内容和点赞以及评论
 */
package com.xuyang.mould;

/**
 * 〈一句话功能简述〉<br> 
 * 〈全球内容和点赞以及评论〉
 * @author PanYin
 * @create 2018/11/20
 * @since 1.0.0
 */
public class DynamicToGlobal {

    private Integer dyId;       //内容ID

    private Integer userId;     //用户ID

    private String dyTitle;     //标题

    private String dyImage;     //动态插图

    private Integer globalId;   //类型ID

    private Integer dyStatus;   //逻辑删除状态

    private String dyCont;      //内容

    private Integer countLike;  //点赞总数
    private Integer likeId;     //点赞表ID

    private Integer recId;      //评论ID
    private Integer countRec;   //评论总数

    public DynamicToGlobal(Integer dyId, Integer userId, String dyTitle, String dyImage, Integer globalId, Integer dyStatus, String dyCont, Integer countLike, Integer likeId, Integer recId, Integer countRec) {
        this.dyId = dyId;
        this.userId = userId;
        this.dyTitle = dyTitle;
        this.dyImage = dyImage;
        this.globalId = globalId;
        this.dyStatus = dyStatus;
        this.dyCont = dyCont;
        this.countLike = countLike;
        this.likeId = likeId;
        this.recId = recId;
        this.countRec = countRec;
    }

    public DynamicToGlobal() {
    }

    public Integer getDyId() {
        return dyId;
    }

    public void setDyId(Integer dyId) {
        this.dyId = dyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDyTitle() {
        return dyTitle;
    }

    public void setDyTitle(String dyTitle) {
        this.dyTitle = dyTitle;
    }

    public String getDyImage() {
        return dyImage;
    }

    public void setDyImage(String dyImage) {
        this.dyImage = dyImage;
    }

    public Integer getGlobalId() {
        return globalId;
    }

    public void setGlobalId(Integer globalId) {
        this.globalId = globalId;
    }

    public Integer getDyStatus() {
        return dyStatus;
    }

    public void setDyStatus(Integer dyStatus) {
        this.dyStatus = dyStatus;
    }

    public String getDyCont() {
        return dyCont;
    }

    public void setDyCont(String dyCont) {
        this.dyCont = dyCont;
    }

    public Integer getCountLike() {
        return countLike;
    }

    public void setCountLike(Integer countLike) {
        this.countLike = countLike;
    }

    public Integer getLikeId() {
        return likeId;
    }

    public void setLikeId(Integer likeId) {
        this.likeId = likeId;
    }

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public Integer getCountRec() {
        return countRec;
    }

    public void setCountRec(Integer countRec) {
        this.countRec = countRec;
    }
}
