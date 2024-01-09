package com.javaex.ex05;

public class Depart extends Employee {

	 //코드작성
	
	// 필드
	private String department;

	// 생성자
	public Depart() {
		super();
	}

	public Depart(String department) {
		super();
		this.department = department;
	}
	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	@Override
	public String toString() {
		return "Depart [department=" + department + ", getName()=" + getName() + ", getSalary()=" + getSalary() + "]";
	}
	
	public void showInformation() {
        System.out.println("이름:" + getName() + "  연봉:" + getSalary() + "  부서:" + department);
    }
	
	
	
}
