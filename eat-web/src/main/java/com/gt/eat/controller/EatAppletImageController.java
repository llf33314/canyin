package com.gt.eat.controller;

import com.gt.eat.base.BaseController;
import com.gt.eat.dto.ServerResponse;
import com.gt.eat.entity.EatEvaluateImg;
import com.gt.eat.enums.ResponseEnums;
import com.gt.eat.exception.BusinessException;
import com.gt.eat.web.service.EatEvaluateImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * 小程序图片 前端控制器
 * </p>
 *
 * @author yangqian
 * @since 2017-07-17
 */
@Controller
@RequestMapping( "/" )
public class EatAppletImageController extends BaseController {

    @Autowired
    private EatEvaluateImgService eatEvaluateImgService;

    @ResponseBody
    @GetMapping( { "", "/" } )
    public ServerResponse hello() {
	List< EatEvaluateImg > imgList = this.eatEvaluateImgService.queryList( null );
	return ServerResponse.createBySuccess( imgList );
    }

    /**
     * 保存
     *
     * @return
     */
    @PostMapping( "/save" )
    public ServerResponse save() {
	EatEvaluateImg eatEvaluateImg = new EatEvaluateImg();
	eatEvaluateImg.setEvaId( 1 );
	eatEvaluateImg.setUrl( "http://" );
	try {
	    this.eatEvaluateImgService.save( eatEvaluateImg );
	} catch ( BusinessException ex ) {
	    this.logger.error( "失败啦！", ex );
	    return ServerResponse.createByErrorCodeMessage( ResponseEnums.ERROR.getCode(), ResponseEnums.ERROR.getDesc() );
	} catch ( Exception ex ) {
	    this.logger.error( "失败啦！", ex );
	    return ServerResponse.createByErrorCodeMessage( ResponseEnums.ERROR.getCode(), ResponseEnums.ERROR.getDesc() );
	}
	return ServerResponse.createBySuccess();
    }

}
