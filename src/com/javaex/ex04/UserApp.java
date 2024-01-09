package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] user = new User[3];
		User u1 = new Customer("jws", "j1234", "정우성", 1000);
		User u2 = new Customer("yjs", "y2345", "이효리", 2000);
		User u3 = new Employee("master", "m7788", "운영자", 5000000);
		
		user[0] = u1;
		user[1] = u2;
		user[2] = u3;
		
		for (int i = 0; i < user.length; i++) {
			user[i].showInfo();
		}
		
		
	}

}
