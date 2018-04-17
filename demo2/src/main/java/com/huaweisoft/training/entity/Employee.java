package com.huaweisoft.training.entity;

/**
 * 员工
 */
public class Employee {

	private Integer id; // 员工ID
	private String name; // 员工姓名
	private Integer gender; // 性别：1-男、2-女
	private String phone; // 联系电话
	private String birthday; // 出生日期

	public Employee() {
		super();
	}

	public Employee(Integer id, String name, Integer gender, String phone, String birthday) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.birthday = birthday;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
}
