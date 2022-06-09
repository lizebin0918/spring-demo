package com.lzb.school.service;

import com.lzb.school.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <br/>
 * Created on : 2021-09-13 16:14
 *
 * @author lizebin
 */
@Service
public class TestService {

    @Autowired
    private IStudentService studentService;

    /*----------------事务无效----------------*/
    public void test(Student s) {
        studentService.save(s);
        test1(s);
    }

    @Transactional
    public void test1(Student s1) {
        s1.setId(null);
        studentService.save(s1);
        int i = 1 / 0;
    }

    /*----------------事务无效----------------*/

    /*-----------------两个方法还是在同一个事务里面-----------------*/
    @Transactional(propagation = Propagation.REQUIRED)
    public void test2(Student s2) {
        studentService.save(s2);
        test1(s2);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void test3(Student s3) {
        s3.setId(null);
        studentService.save(s3);
        int i = 1 / 0;
    }
    /*-----------------两个方法还是在同一个事务里面-----------------*/

}
