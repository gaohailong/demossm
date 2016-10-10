package com.mr.test;

import com.mr.bean.Title;
import com.mr.mapper.TitleMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by gaohailong on 2016/9/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration("/spring.xml")
public class TitleTest {
    @Autowired
    private TitleMapper titleMapper;

    @Test
    public void testSelect() {
        List<Title> title = titleMapper.findAll();
        System.out.print(title.size());
      /*  Title title = new Title();
        title.setTitle("test");
        title.setContent("testZ框架是否继承成功");
        title.setTag("1");
//        title.setDate(new Date());*/
    }
}
