package com.lithan;

public class Name 
{
	private String name;

	
	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Name(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hello, " + name;
	}
	
}
