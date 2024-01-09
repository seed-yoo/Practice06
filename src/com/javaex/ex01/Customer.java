package com.javaex.ex01;

public class Customer extends Person{
	
	// 필드
	private int cNo;
	private int point;
	
	// 생성자
	public Customer() {
		super();
	}

	public Customer(int cNo, int point) {
		super();
		this.cNo = cNo;
		this.point = point;
	}
	
	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}

	// 메소드 - getter/setter
	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	// 메소드 - 일반
	@Override
	public String toString() {
		return "Customer [cNo=" + cNo + ", point=" + point + ", getName()=" + getName() + ", getHp()=" + getHp() + "]";
	}
	
	public void showInfo() {
		System.out.println("#이름: " + getName() + ", #핸드폰: " + getHp() + ", # 고객번호: " + cNo + ", #포인트점수: " + point);
	}
	
	
	
	
	
	
	
}
