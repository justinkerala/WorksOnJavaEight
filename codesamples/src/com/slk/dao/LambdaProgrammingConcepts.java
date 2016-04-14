package com.slk.dao;

import java.util.Arrays;
import java.util.List;

/**
 * @author     Justin Mathew
 * @copyright  
 * @date       Apr 14, 2016
 * 
 */
public class LambdaProgrammingConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaProgrammingConcepts conceptsObj=new LambdaProgrammingConcepts();
		
//		conceptsObj.printAlist();
//		conceptsObj.addAlist();
//		conceptsObj.printAlist2();
//		conceptsObj.startThread();
	}

public void printAlist()
{
	//Without the help of loop printing the contents.
	List<Integer> integrs=Arrays.asList(1,2,3,4,5,6,7);
	integrs.forEach(
			x->System.out.println(x)
			);
}

public void printAlist2()
{
	//No logic is applied to the list just take the val
	//and pass to sysout. 
	List<Integer> integrs=Arrays.asList(1,2,3,4,5,6,7);
	integrs.forEach(System.out::println);
}
 
public void addAlist()
{
	 //Multiline Lambda Expression
	//Multiple lines of logic inside the lambda
	List<Integer> integrs=Arrays.asList(1,2,3,4,5,6,7);
 
	integrs.forEach(x->{
		x=x+10;
		System.out.println(x);
 	});
}

public void startThread()
{
	//Thread constructor
Thread th=new Thread(()->{
System.out.print("in another thread");
});	
th.start();
}


}