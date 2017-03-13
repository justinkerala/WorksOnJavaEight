package com.slk.dao;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

import com.slk.dto.Department;
import com.slk.dto.Person;

/**
 * @author    Justin Mathew
 *
 * @copyright  
 *
 * @date      Jul 15, 2016 
 */
public class LambdaDtoComparison {

public static  void LambdaDtoComparis() {
ArrayList<Person> pr=new ArrayList<Person>();
		pr.add(new Person("Justin","BE"));
		pr.add(new Person("Prakash","MA"));
		pr.add(new Person("Julie","BA"));
		pr.add(new Person("Vella","BA"));
		pr.add(new Person("Lude","DV"));
		pr.add(new Person("Bedak","MA"));
ArrayList<Department> dept=new ArrayList<Department>();
dept.add(new Department("BA"));
dept.add(new Department("CA"));

//		 pr.stream().
//		 filter(e->e.getDept().equals(arg0))

/*ArrayList<Person>filterdPerson=new ArrayList<>();
	for (Person person : pr) {
		for (Department department : dept) {
			if(person.getDept().equals(department.getDept()))
			{
				filterdPerson.add(person);
			}
		}
	}	 
filterdPerson.forEach(System.out::println);*/
ArrayList<Person>filterdPerson=new ArrayList<>(); 
dept.forEach(e->{
	pr.forEach(p->{
			if(e.getDept().equals(p.getDept()))
					{
					filterdPerson.add(p);
					}
				});
 	});

filterdPerson.forEach(System.out::println);
 
//		pr.forEach(System.out::println);
//		ArrayList<Person> filterd=(ArrayList<Person>) pr.stream().filter(e->e.getDept().equals(dept)).collect(toList());
//		integrs.forEach(System.out::println);
//		filterd.forEach(System.out::println);
		
	}



	
	public static void main(String[] args) {
		
	/*	List<Integer> l1 = new ArrayList<Integer>();

		l1.add(1);
		l1.add(2);
		l1.add(3);

		List<Integer> l2= new ArrayList<Integer>();
		l2.add(4);
		l2.add(2);
		l2.add(3);

		List<Integer> l3 = new ArrayList<Integer>(l2);
		l3.retainAll(l1);
		
		l3.forEach(System.out::println);*/
		LambdaDtoComparis();
		
		
	}
}
