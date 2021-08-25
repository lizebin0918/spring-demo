package com.lzb;

import com.alibaba.fastjson.JSON;
import com.lzb.school.entity.Student;
import com.lzb.school.service.IStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class AppTest 
{

    @Autowired
    private IStudentService studentService;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Student student = new Student();
        student.setId(8);
        student.setName("lizebin");
        // student.setRegisterDateTime(LocalDateTime.now());
        // boolean isSuccess = studentService.updateById(student);
        //System.out.println(isSuccess);
        System.out.println(JSON.toJSONString(studentService.list()));

    }
}
