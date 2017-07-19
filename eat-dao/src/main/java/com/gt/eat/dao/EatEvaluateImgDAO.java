package com.gt.eat.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.gt.eat.entity.EatEvaluateImg;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author qushengkang
 * @since 2017-07-18
 */
public interface EatEvaluateImgDAO extends BaseMapper< EatEvaluateImg > {

    EatEvaluateImg queryT( Integer id );

    EatEvaluateImg queryTTT();

}