package com.slk.dao;

import java.util.ArrayList;

import com.slk.dto.Person;

import static java.util.stream.Collectors.*;


/**
 * @author    Justin Mathew
 *
 * @copyright 
 *
 * @date      Jul 15, 2016 
 */
public class LambdasWithDto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> pr=new ArrayList<Person>();
		
		pr.add(new Person("Justin","BE"));
		pr.add(new Person("Prakash","MA"));
		pr.add(new Person("Julie","BA"));
		pr.add(new Person("Vella","BA"));
		pr.add(new Person("Lude","DV"));
		pr.add(new Person("Bedak","BC"));

		LambdasWithDto ldto=new LambdasWithDto();
		ldto.filterWithdept(pr,"BA");
	}
	public void filterWithdept(ArrayList<Person> pr,String dept)
	{
		/*System.out.println(
				numbers.stream()
				    .filter(e->e%2==0)//filter
				    .map(e->e*2)//double them
				    .reduce(0,Integer::sum));//reduce it
*/
		ArrayList<Person> filterd=(ArrayList<Person>) pr.stream().filter(e->e.getDept().equals(dept)).collect(toList());
//		integrs.forEach(System.out::println);
		filterd.forEach(System.out::println);
//		System.out.println(pr.stream().forEach(print));
	
	}
	
	
	
	

}
