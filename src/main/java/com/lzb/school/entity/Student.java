package com.lzb.school.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.lzb.school.entity.enums.TYPE_ENUM;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

/**
 * <p>
 * 学生表
 * </p>
 *
 * @author lizebin
 * @since 2021-08-24
 */
@Data
public class Student {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 姓名
     */
    // @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private String name;

    /**
     * 生日
     */
    private LocalDate birthday;

    /**
     * 班级id
     */
    private Integer classId;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createDateTime;

    /**
     * 更新时间 插入和更新时填充字段
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateDateTime;

    /**
     * 删除标识
     */
    @TableField(fill = FieldFill.INSERT)
    private Boolean deleteFlag;

    /**
     * 类型
     */
    private TYPE_ENUM type;

    /**
     * 注册时间（带时区）
     * 这个才是带上当前时区的时间：
     * registerDateTime.atZoneSameInstant(ZoneId.systemDefault()).toLocalDateTime()
     */
    private OffsetDateTime registerDateTime;

    /**
     * 年龄
     */
    // 默认插入非空字段，加上注解表示忽略
    @TableField(insertStrategy = FieldStrategy.IGNORED, updateStrategy = FieldStrategy.IGNORED)
    private Integer age;

}
