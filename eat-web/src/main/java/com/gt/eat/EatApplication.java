package com.gt.eat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 酒店ERP 程序入口
 *
 * @author zhangmz
 * @create 2017/7/8
 */
@MapperScan( "com.gt.eat.dao" )
@ServletComponentScan
@SpringBootApplication
public class EatApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure( SpringApplicationBuilder application ) {
	return application.sources( EatApplication.class );
    }

    public static void main( String[] args ) {
	SpringApplication.run( EatApplication.class, args );
    }
}
