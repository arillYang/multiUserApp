package com.xuyang.service;

import com.github.pagehelper.PageInfo;
import com.xuyang.model.Tgoods;
import com.xuyang.model.Tuser;

import java.util.List;

public interface TgoodsService {
    /**
     * 功能描述: <br>
     * 〈查询世界的新品推荐〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    List<Tgoods> newGlobalGoods();
    /**
     * 功能描述: <br>
     * 〈查询世界的精品推荐〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    List<Tgoods> bestGlobalGoods();

    /**
     * 功能描述: <br>
     * 〈分页查询〉
     * @since: 1.0.0
     * @Author: PanYin
     */
    PageInfo<Tgoods> pagingQueryGoods(int pageNum, int pageSize,String sale);
}
