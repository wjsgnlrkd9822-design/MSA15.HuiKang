package day07.Ex12_접근지정자.B;

import day07.Ex12_접근지정자.A.Person;

public class Manager {

	public static void main(String[] args) {
		Student student = new Student();
		student.defaultSetting();
		System.out.println("name : " + student.name);
		System.out.println("age : " + student.getAge());
		// * 접근지정자는 선언한 클래스를 기준으로 적용된다
		// 같은 패키지인 Manager 클래스에서 Student 클래스의
		// age (protected), height(default) 를 접근할 수 없는 이유?
		// - 실질적으로 선언은 Person 클래스에서 했기 떄문에
		//   Person 과 다른 ㅐ키지인 Manager 에서 접근 불가
		System.out.println("height : " + student.getHeight());
		System.out.println("weight : " + student.getWeight());
		System.out.println();
		
		Person person = new Person();
		student.defaultSetting();
		System.out.println("name : " + student.name);
		System.out.println("age : " + student.getAge());
		System.out.println("height : " + student.getHeight());
		System.out.println("weight : " + student.getWeight());
		System.out.println();
	}
}