/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: TadverServiceImpl
 * Author:   Administrator
 * Date:     2018/10/31 15:04
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xuyang.service.Impl;

import com.xuyang.mapper.TadvertisingMapper;
import com.xuyang.model.Tadvertising;
import com.xuyang.service.TadverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * reate 2018/10/31
 * @since 1.0.0
 */
@Service
public class TadverServiceImpl implements TadverService {

    @Autowired
    private TadvertisingMapper tadvertisingMapper;
    @Override
    public List<Tadvertising> queryBroadcast() {
        return tadvertisingMapper.queryBroadcast();
    }
}
