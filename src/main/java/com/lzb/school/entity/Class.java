package com.lzb.school.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 * 班级表
 * </p>
 *
 * @author lizebin
 * @since 2021-08-26
 */
@Data
public class Class {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 班级名称
     */
    private String name;

    /**
     * 0-未删除；1-已删除
     */
    private Boolean deleteFlag;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createDateTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateDateTime;


}
