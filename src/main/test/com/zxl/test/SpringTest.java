package com.zxl.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.
        ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author ElijahZheng
 * @date 2019/9/5
 */

@Service
public class SpringTest {

    @Test
    public void testSpring(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringTest springTest = (SpringTest) applicationContext.getBean("springTest");
        springTest.sayHello();

    }

    public void sayHello(){
        System.out.println("hello ay");
    }

}