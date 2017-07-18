package com.gt.eat.controller;

import com.gt.eat.base.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

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

    @ResponseBody
    @GetMapping( { "", "/" } )
    public String hello() {

	return "你好..";
    }

}
