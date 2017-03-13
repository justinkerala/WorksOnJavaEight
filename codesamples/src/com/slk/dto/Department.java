package com.slk.dto;
/**
 * @author    Justin Mathew
 *
 * @copyright 2016 Silverlake information systems pvt ltd. All rights reserved
 *
 * @date      Jul 15, 2016 
 */
public class Department {

	
	public Department(String dept) {
		super();
		this.dept = dept;
	}

	String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}
