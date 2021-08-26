package com.lzb.school.service.impl;

import com.lzb.school.entity.Score;
import com.lzb.school.mapper.ScoreMapper;
import com.lzb.school.service.IScoreService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 成绩表 服务实现类
 * </p>
 *
 * @author lizebin
 * @since 2021-08-26
 */
@Service
public class ScoreServiceImpl extends ServiceImpl<ScoreMapper, Score> implements IScoreService {

}
