
package com.slk.dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//java 8 code to convert file to list object. 
//3/12/2017 idea after an interview ;)
public class TestReadFile2 {

	
	//file content, seperated with tab 
   /*Name	Dept	mark
	justin	bca	12
	jeryl	mca	33
	sasi	bbba	99*/
	
	public static void main(String args[]) {
		Function<String[],Myclass>mapperFun=s->{
			String[]splited=s[0].split("	");
				return new Myclass(splited[0],splited[1],splited[2]);
		};
		String fileName = "d://list.txt";
		List<String> list = new ArrayList<>();
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			list = stream
					.filter(line -> !line.startsWith("Name"))
					.map(String::toUpperCase)
					.collect(Collectors.toList());
 		} catch (IOException e) {
			e.printStackTrace();
		}
	 List<Myclass>employeeDetails=list.parallelStream()
	 .map(e->e.split(","))
	 .map(mapperFun)
	 .collect(Collectors.toList());
	 
 System.out.println(employeeDetails);
	}

}

class Myclass{
	private String s1;
	private String s2;
	private String s3;
	public String getS1() {
		return s1;
	}
	public void setS1(String s1) {
		this.s1 = s1;
	}
	public String getS2() {
		return s2;
	}
	public void setS2(String s2) {
		this.s2 = s2;
	}
	public String getS3() {
		return s3;
	}
	public void setS3(String s3) {
		this.s3 = s3;
	}
	public Myclass(String s1, String s2, String s3) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	public Myclass(String s1) {
		super();
		this.s1 = s1;
	}
	@Override
	public String toString() {
		return "{\"" + (s1 != null ? "s1\":\"" + s1 + "\",\"" : "")
				+ (s2 != null ? "s2\":\"" + s2 + "\",\"" : "")
				+ (s3 != null ? "s3\":\"" + s3 : "") + "\"} ";
	}
}
 
