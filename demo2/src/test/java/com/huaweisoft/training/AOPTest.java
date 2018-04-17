package com.huaweisoft.training;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.huaweisoft.training.entity.Employee;
import com.huaweisoft.training.service.EmployeeService;

public class AOPTest {

	@Test
	public void test1() {
		// 根据applicationContext.xml配置文件初始化spring容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		// 从容器中获得实体（bean）
		EmployeeService employeeService = ctx.getBean(EmployeeService.class);
		List<Employee> list = employeeService.getPage(1, 10);
		System.out.println(JSON.toJSONString(list));
	}
}
