package top.hyt.mybatistest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.hyt.mybatistest.mapper.StudentMapper;
import top.hyt.mybatistest.module.Student;
import org.junit.runner.RunWith;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatistestApplication.class)
class MybatistestApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    void contextLoads() {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "张三", 21, "浙江"));
        list.add(new Student(1, "张三2", null, "浙江2"));

        studentMapper.insertOrUpdateBath(list);
    }

}
