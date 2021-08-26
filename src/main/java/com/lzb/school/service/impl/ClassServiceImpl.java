package com.lzb.school.service.impl;

import com.lzb.school.entity.Class;
import com.lzb.school.mapper.ClassMapper;
import com.lzb.school.service.IClassService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 班级表 服务实现类
 * </p>
 *
 * @author lizebin
 * @since 2021-08-26
 */
@Service
public class ClassServiceImpl extends ServiceImpl<ClassMapper, Class> implements IClassService {

}
