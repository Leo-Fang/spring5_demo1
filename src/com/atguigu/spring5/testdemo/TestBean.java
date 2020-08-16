package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.bean.Dept;
import com.atguigu.spring5.bean.Emp;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Leo
 * @date 2020/7/25 - 14:13
 */

public class TestBean {

    @Test
    public void testAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        UserService userService = context.getBean("userService",UserService.class);
        userService.add();
    }

    @Test
    public void testBean2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }

}
