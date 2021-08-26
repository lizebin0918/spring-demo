package com.lzb.school.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 成绩表
 * </p>
 *
 * @author lizebin
 * @since 2021-08-26
 */
@Data
public class Score {

    private static final long serialVersionUID = 1L;

    /**
     * 学生id
     */
    private Integer studentId;

    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 分数表
     */
    private BigDecimal score;

    /**
     * 删除标识
     */
    private Boolean deleteFlag;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createDateTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateDateTime;


}
