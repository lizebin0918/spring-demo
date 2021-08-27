package com.lzb;

import com.lzb.school.entity.Student;
import com.lzb.school.mapper.StudentMapper;
import com.lzb.school.service.IStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class AppTest 
{

    @Autowired
    private IStudentService studentService;

    @Autowired
    private StudentMapper studentMapper;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException {
        Student student = new Student();
        student.setId(8);
        student.setName("lizebin");
        // student.setRegisterDateTime(LocalDateTime.now());
        // boolean isSuccess = studentService.updateById(student);
        //System.out.println(isSuccess);
        System.out.println("---------");
        System.out.println(ZoneId.systemDefault());
        // 带上当前时区的时间
        OffsetDateTime time = studentService.getById(8).getRegisterDateTime();
        // atZoneSameInstant 这是算完之后的？？？
        System.out.println(time.atZoneSameInstant(ZoneId.systemDefault()));// 2021-08-25T14:41:17.601807+08:00[Asia/Shanghai]
        System.out.println(time.atZoneSimilarLocal(ZoneId.systemDefault()));// 2021-08-25T06:41:17.601807+08:00[Asia/Shanghai]

        // System.out.println(JSON.toJSONString(studentMapper.selectMultipleTime()));
        // System.out.println(JSON.toJSONString(studentMapper.updateMultiple()));
        CountDownLatch latch = new CountDownLatch(2);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(() -> {
            try {
                studentMapper.testDeadLock1();
            } finally {
                latch.countDown();
            }
        });
        executorService.execute(() -> {
            try {
                studentMapper.testDeadLock2();
            } finally {
                latch.countDown();
            }
        });
        latch.await();
        System.out.println("done");
    }
}
