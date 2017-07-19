package com.gt.eat.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * <p>
 * Lombok
 * </p>
 *
 * @author qushengkang
 * @since 2017-07-18
 */
@Data
@Accessors( chain = true )
@TableName( "t_eat_evaluate_img" )
public class EatEvaluateImg extends Model< EatEvaluateImg > {

    private static final long serialVersionUID = 1L;

    @TableId( value = "id", type = IdType.AUTO )
    private Integer id;
    /**
     * 评价主表主键
     */
    @TableField( "eva_id" )
    private Integer evaId;
    /**
     * 图片地址
     */
    private String  url;

    @Override
    protected Serializable pkVal() {
	return this.id;
    }

    @Override
    public String toString() {
	return "EatEvaluateImg{" + "id=" + id + ", evaId=" + evaId + ", url=" + url + "}";
    }
}
