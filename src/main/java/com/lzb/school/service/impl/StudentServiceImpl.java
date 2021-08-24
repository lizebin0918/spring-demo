package com.lzb.school.service.impl;

import com.lzb.school.entity.Student;
import com.lzb.school.mapper.StudentMapper;
import com.lzb.school.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学生表 服务实现类
 * </p>
 *
 * @author lizebin
 * @since 2021-08-24
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
