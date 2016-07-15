package com.slk.dto;
/**
 * @author    Justin Mathew
 *
 * @copyright 2016 Silverlake information systems pvt ltd. All rights reserved
 *
 * @date      Jul 15, 2016 
 */
public class Person {
private String name;
private String dept;


public Person(String name, String dept) {
	super();
	this.name = name;
	this.dept = dept;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "Person [name=" + name + ", dept=" + dept + "]";
}

}
