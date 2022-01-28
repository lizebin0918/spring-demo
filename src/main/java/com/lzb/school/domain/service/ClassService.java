package com.lzb.school.domain.service;

import com.lzb.school.entity.Class;
import com.lzb.school.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <br/>
 * Created on : 2022-01-27 18:59
 *
 * @author lizebin
 */
@Service
public class ClassService {

    @Autowired
    private IClassService classService;

    /**
     * 读已提交:如果切面抛异常，也会回滚!!!!
     */
    @Transactional(rollbackFor = Exception.class, isolation = Isolation.READ_COMMITTED)
    public int save(int studentId) {

        Class klass = new Class();
        klass.setName("1班");
        classService.saveOrUpdate(klass);
        return klass.getId();

    }

    /**
     * 读已提交:如果切面抛异常，并不会回滚!!!!
     */
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public int save1(int studentId) {

        Class klass = new Class();
        klass.setName("2班");
        classService.saveOrUpdate(klass);

        return klass.getId();

    }

}
