/**
 * Copyright (C), 2018-2018, 杭州旭阳科技有限公司
 * FileName: LevelLinkage
 * Author:   PanYin
 * Date:     2018/11/5 15:55
 * Description: 商品一级和二级的联动展示
 */
package com.xuyang.mould;

/**
 * 〈一句话功能简述〉<br> 
 * 〈商品一级和二级的联动展示〉
 * @author PanYin
 * @create 2018/11/5
 * @since 1.0.0
 */
public class LevelLinkage {
    private Integer wotId;  //一级ID
    private String wotName; //一级类型名称
    private String wotSwitch;   //一级类型状态
    private String wotTypename; //世界馆标识
    private Integer gtId;   //二级ID
    private String gtName;  //二级类型名称
    private String gtSwitch;    //二级类型状态
    private String gtTyptname;  //类型标识（标识为商品或者企业）

    public LevelLinkage() {
    }

    public LevelLinkage(Integer wotId, String wotName, String wotSwitch, String wotTypename, Integer gtId, String gtName, String gtSwitch, String gtTyptname) {
        this.wotId = wotId;
        this.wotName = wotName;
        this.wotSwitch = wotSwitch;
        this.wotTypename = wotTypename;
        this.gtId = gtId;
        this.gtName = gtName;
        this.gtSwitch = gtSwitch;
        this.gtTyptname = gtTyptname;
    }

    public Integer getWotId() {
        return wotId;
    }

    public void setWotId(Integer wotId) {
        this.wotId = wotId;
    }

    public String getWotName() {
        return wotName;
    }

    public void setWotName(String wotName) {
        this.wotName = wotName;
    }

    public String getWotSwitch() {
        return wotSwitch;
    }

    public void setWotSwitch(String wotSwitch) {
        this.wotSwitch = wotSwitch;
    }

    public String getWotTypename() {
        return wotTypename;
    }

    public void setWotTypename(String wotTypename) {
        this.wotTypename = wotTypename;
    }

    public Integer getGtId() {
        return gtId;
    }

    public void setGtId(Integer gtId) {
        this.gtId = gtId;
    }

    public String getGtName() {
        return gtName;
    }

    public void setGtName(String gtName) {
        this.gtName = gtName;
    }

    public String getGtSwitch() {
        return gtSwitch;
    }

    public void setGtSwitch(String gtSwitch) {
        this.gtSwitch = gtSwitch;
    }

    public String getGtTyptname() {
        return gtTyptname;
    }

    public void setGtTyptname(String gtTyptname) {
        this.gtTyptname = gtTyptname;
    }
}
