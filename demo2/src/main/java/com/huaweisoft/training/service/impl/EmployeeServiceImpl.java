package com.huaweisoft.training.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.huaweisoft.training.entity.Employee;
import com.huaweisoft.training.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public List<Employee> getPage(int pageNo, int pageSize) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "张三", 1, "13612345678", "1995-01-01"));
		return list;
	}

}
