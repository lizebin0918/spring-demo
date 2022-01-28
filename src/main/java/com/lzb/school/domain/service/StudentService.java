package com.lzb.school.domain.service;

import com.lzb.school.entity.Student;
import com.lzb.school.entity.enums.TYPE_ENUM;
import com.lzb.school.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.OffsetDateTime;

/**
 * <br/>
 * Created on : 2022-01-27 18:59
 *
 * @author lizebin
 */
@Service
public class StudentService {

    @Autowired
    private IStudentService studentService;

    @Autowired
    private ClassService classService;

    /**
     * 可重复读
     */
    @Transactional(rollbackFor = Exception.class, isolation = Isolation.REPEATABLE_READ)
    public void save() {

        Student student = new Student();
        student.setName("lizebin");
        student.setRegisterDateTime(OffsetDateTime.now());
        student.setBirthday(LocalDate.now());
        student.setRegisterDateTime(OffsetDateTime.now());
        student.setAge(10);
        student.setClassId(1);
        student.setType(TYPE_ENUM.HIGH);
        studentService.saveOrUpdate(student);

        classService.save(student.getId());

    }

    /**
     * 可重复读
     */
    @Transactional(rollbackFor = Exception.class, isolation = Isolation.REPEATABLE_READ)
    public void save1() {

        Student student = new Student();
        student.setName("lizebin");
        student.setRegisterDateTime(OffsetDateTime.now());
        student.setBirthday(LocalDate.now());
        student.setRegisterDateTime(OffsetDateTime.now());
        student.setAge(10);
        student.setClassId(1);
        student.setType(TYPE_ENUM.HIGH);
        studentService.saveOrUpdate(student);

        classService.save1(student.getId());

    }

}
