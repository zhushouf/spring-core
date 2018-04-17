package com.huaweisoft.training.dao;

/**
 * 基类接口
 */
public interface BaseDao<T> {

	void insert(T object);

	int update(T object);

	int deleteById(Object id);
}
