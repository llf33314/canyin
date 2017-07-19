package com.gt.eat.web.service;

import com.gt.eat.base.BaseService;
import com.gt.eat.entity.EatEvaluateImg;
import com.gt.eat.exception.BusinessException;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author qushengkang
 * @since 2017-07-18
 */
public interface EatEvaluateImgService extends BaseService< EatEvaluateImg > {

    List< EatEvaluateImg > queryList( Object o );

    void save( EatEvaluateImg eatEvaluateImg ) throws BusinessException;
}
