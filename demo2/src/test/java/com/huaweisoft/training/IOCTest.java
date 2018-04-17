package com.huaweisoft.training;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.huaweisoft.training.dao.impl.AttendanceDao;
import com.huaweisoft.training.dao.impl.EmployeeDao;
import com.huaweisoft.training.entity.Attendance;
import com.huaweisoft.training.entity.Employee;

public class IOCTest {

	@Test
	public void test1() {
		EmployeeDao employeeDao = new EmployeeDao();
		Employee entity = new Employee();
		employeeDao.insert(entity);
	}

	@Test
	public void test2() {
		// 根据applicationContext.xml配置文件初始化spring容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		// 从容器中获得实体（bean）
		Employee employee = (Employee) ctx.getBean("zEmployee");
		System.out.println(JSON.toJSONString(employee));
	}

	@Test
	public void test3() {
		// 根据applicationContext.xml置文件初始化spring容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		// 从容器中获得实体（bean）
		Employee employee1 = (Employee) ctx.getBean("lEmployee");
		Employee employee2 = (Employee) ctx.getBean("lEmployee");
		System.out.println(JSON.toJSONString(employee1));
		System.out.println(JSON.toJSONString(employee2));
		System.out.println(employee1 == employee2);
	}

	@Test
	public void test4() {
		// 根据applicationContext.xml置文件初始化spring容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		// 从容器中获得实体（bean）
		AttendanceDao attendanceDao = ctx.getBean(AttendanceDao.class);
		List<Attendance> list = attendanceDao.getAll();
		System.out.println(JSON.toJSONString(list));
	}

}