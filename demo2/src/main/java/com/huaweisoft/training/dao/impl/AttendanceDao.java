package com.huaweisoft.training.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.huaweisoft.training.dao.BaseDao;
import com.huaweisoft.training.entity.Attendance;

/**
 * 考勤
 */
@Repository
public class AttendanceDao implements BaseDao<Attendance> {

	@Override
	public Attendance getOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Attendance> getAll() {
		List<Attendance> list = new ArrayList<Attendance>();
		list.add(new Attendance(1, 1, new Date(), new Date(), new Date()));
		return list;
	}

	@Override
	public void insert(Attendance entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Attendance entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

}