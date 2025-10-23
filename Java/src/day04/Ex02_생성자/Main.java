package day04.Ex02_생성자;

public class Main {
	
	public static void main(String[] args) {
		// student 객체 생성
		Student student = new Student();
		
		System.out.println(":::::::::: 학생1 ::::::::::");
		System.out.println("학생1 - 이름 : " + student.name);
		System.out.println("학생1 - 이름 : " + student.age);
		System.out.println("학생1 - 이름 : " + student.major);
		System.out.println("학생1 - 이름 : " + student.stdNo);
		
		Student student2 = new Student("김조은", 22);
		student2.major = "스포츠마케팅";
		student2.stdNo = "17-777777";
		
		System.out.println(":::::::::: 학생2 ::::::::::");
		System.out.println("학생2 - 이름 : " + student2.name);
		System.out.println("학생2 - 이름 : " + student2.age);
		System.out.println("학생2 - 이름 : " + student2.major);
		System.out.println("학생2 - 이름 : " + student2.stdNo);
		
		Student student3 = new Student("배은주", 46, "교육학과", "955001");
		
		System.out.println(":::::::::: 학생3 ::::::::::");
		System.out.println("학생3 - 이름 : " + student3.name);
		System.out.println("학생3 - 이름 : " + student3.age);
		System.out.println("학생3 - 이름 : " + student3.major);
		System.out.println("학생3 - 이름 : " + student3.stdNo);
		student3.study("교육학 개론");
		
		
		// (숫자) + (숫자)   : 산술 연산자
		// (문자열) + (?)   : 문자열 연결 연산자
		System.out.println("학생3 - 중간고사 점수 : " + student3.getAverage(100, 90));
		System.out.println("학생3 - 기말고사 점수 : " + student3.getAverage(100, 90, 70));
		int scores[] = {100, 80, 70, 65, 50, 100};
		System.out.println("학생3 - 최종 점수 : " + student3.getAverage(scores));
	}

}