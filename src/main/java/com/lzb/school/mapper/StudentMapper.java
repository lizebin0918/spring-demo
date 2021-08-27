package com.lzb.school.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lzb.school.entity.Student;

import java.util.Map;

/**
 * <p>
 * 学生表 Mapper 接口
 * </p>
 *
 * @author lizebin
 * @since 2021-08-24
 */
public interface StudentMapper extends BaseMapper<Student> {

    Map<String, Object> selectMultipleTime();

    int updateMultiple();

    void testDeadLock1();
    void testDeadLock2();

}
