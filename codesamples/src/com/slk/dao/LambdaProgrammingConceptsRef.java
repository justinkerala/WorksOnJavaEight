package com.slk.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;
/**
 * @author     Justin Mathew
 * @copyright   
 * @date       Apr 14, 2016
 * 
 */
public class LambdaProgrammingConceptsRef {

	
	public static void main(String[] args) {

		LambdaProgrammingConceptsRef ref=new LambdaProgrammingConceptsRef();
//		ref.addAll();
//		ref.numberOperations();
		ref.collectDemo();
	}
	
	//Methode references. Example
	public void addAll()
	{		
		List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);

		
		System.out.println(numbers.stream()
                //.reduce(0,(total,e)->Integer.sum(total, e)));
	            .reduce(0,Integer::sum));
		
		
		System.out.println(
		numbers.stream().map(String::valueOf)
		//.reduce("",(carry,str)->carry.concat(str)));
		.reduce("",String::concat));
	}
	
	//____Function Composition.or pipelining.
	public void numberOperations()
	{
		//given the valus, double the even numbers and total
		//___________________________________________________
		//imperative methode
		List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);

		int result=0;
		for(int e:numbers)
		{
			if(e%2==0)
			{
				result+=e*2;
			}
		}
		
		System.out.println(result);
		//____________________________________________________
		//first way
		//stram is a fancy iterator, 
		//
		//filter just like a grep , smaall tool
		System.out.println(
		numbers.stream()
		    .filter(e->e%2==0)//filter
		    .map(e->e*2)//double them
		    .reduce(0,Integer::sum));//reduce it
		    
		
		//____________________________________________________
		//second way
		System.out.println(
				     numbers.stream()
				    .filter(e->e%2==0)//filter
				    .mapToInt(e->e*2)//double them
				    .sum());//reduce it

		
		
	}

/*
 * filter filters
 * 
 * map transforms the value,
 * input and output may vary
 * eg,
 *  parameter:Stram<T> map takes Function<T,R> to return Stram<R>
 *  
 *  both filter and map stay withing thers swimlanes
 *  
 *  reduce cuts across the swimlanes
 *  reduce on Stream<T> takes two parameter is type of T
 *  secont parameter is of type BiFunction<R,T,R> to produce a result of R
 *      filter      map			reduce
 *      						0.0	
 *  x1    |						 \
 *  ___________________			  \
 *  x2	  ->        x2'    ->      +
 *  ___________________				\
 *  x3	  |							 \
 *  ___________________				  \
 *  x4	  ->		x4'			->     +
 *  									\
 *  
 *  
 *  reduce expl
 *     1     2     3      4  	
 *     |	 |     |	  |
 *  1->*->1->*->2->*->6 ->*->24
 *  
 */


//________
//Understanding the Collect

public void collectDemo()
{
	//double the even calue and put that into a list
	List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);
  	
	//wrong way to do this.
	List<Integer> doubleOfEven=new ArrayList<Integer>();
	
	numbers.stream()
			.filter(e->e%2==0)
			.map(e->e*2)
			.forEach(e->doubleOfEven.add(e));
	System.out.println(doubleOfEven);
	//shared mutability is devils work
	//dont do this.
	
	//Better way is collectors.
	
	List<Integer> doubleOfEven2=new ArrayList<Integer>();
	
	doubleOfEven2=
     numbers.stream()
	.filter(e->e%2==0)
	.map(e->e*2)
	.collect(toList());
	
System.out.println(doubleOfEven2);
}
}