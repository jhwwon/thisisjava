package ch12.exercise.problem05;

import java.util.HashSet;

public class StudentExample {

	public static void main(String[] args) {
		HashSet<Student> hashSet = new HashSet<Student>();
		
		hashSet.add(new Student("1"));
		hashSet.add(new Student("1"));  // add 실패됨
		hashSet.add(new Student("2"));
		
		System.out.println("저장된 Student 수: " + hashSet.size());
	}

}
