package com.lzb.school.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lzb.school.entity.Student;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Select;

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

    /**
     * 查询所有
     * @return
     */
    @MapKey("id")
    @Select("select * from student;")
    Map<Integer, Student> listAll();

    Map<String, Object> selectMultipleTime();

    int updateMultiple();

    void testDeadLock1();
    void testDeadLock2();

}
