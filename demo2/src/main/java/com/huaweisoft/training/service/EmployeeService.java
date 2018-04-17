package com.huaweisoft.training.service;

import java.util.List;

import com.huaweisoft.training.entity.Employee;

public interface EmployeeService {

	List<Employee> getPage(int pageNo, int pageSize);
}
