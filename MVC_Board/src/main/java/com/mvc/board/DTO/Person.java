package com.mvc.board.DTO;

import java.util.ArrayList;

public class Person {
	
	private String name;
	private int age;
	private ArrayList<String> list;

	public Person()
	{
		super();
	}
	
	public String getName() {
		return name;
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public Person(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
		list = new ArrayList<String>(1);
		
		list.add("홍길동");
		list.add("강감찬");
	}
}
