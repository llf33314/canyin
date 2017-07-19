package com.gt.eat.web.service.impl;

import com.gt.eat.base.BaseServiceImpl;
import com.gt.eat.dao.EatEvaluateImgDAO;
import com.gt.eat.entity.EatEvaluateImg;
import com.gt.eat.exception.BusinessException;
import com.gt.eat.web.service.EatEvaluateImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author qushengkang
 * @since 2017-07-18
 */
@Service
public class EatEvaluateImgServiceImpl extends BaseServiceImpl< EatEvaluateImgDAO,EatEvaluateImg > implements EatEvaluateImgService {

    @Autowired
    private EatEvaluateImgDAO eatEvaluateImgDAO;

    @Override
    public List< EatEvaluateImg > queryList( Object o ) {
	List< EatEvaluateImg > imgList = this.eatEvaluateImgDAO.selectList( null );
	return imgList;
    }

    /**
     * Spring事务
     * 1. RuntimeException 默认异常 这种才会回滚
     * 2. Exception 默认：这种不回滚
     *
     * @param eatEvaluateImg
     */
    @Transactional
    public void save( EatEvaluateImg eatEvaluateImg ) throws BusinessException {
	if ( this.eatEvaluateImgDAO.insert( eatEvaluateImg ) == 0 ) {
	    throw new BusinessException( "插入失败" );
	}
    }
}
