package com.huaweisoft.training.dao;

import java.util.List;

/**
 * 基类接口
 */
public interface BaseDao<T> {

	T getOne(int id);

	List<T> getAll();

	void insert(T entity);

	void update(T entity);

	void deleteById(int id);
}
