package com.xiangxue.jack.test;

import com.xiangxue.jack.bean.Stu;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 *
 * @program: spring
 *
 * @description:
 *
 * @author: hqf
 *
 * @create: 2021-03-28 20:19
 **/
public class MyTest {

	@Test
	public void test1() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Stu stu = (Stu) applicationContext.getBean("stu");
		System.out.println(stu.getUsername());
	}


}
