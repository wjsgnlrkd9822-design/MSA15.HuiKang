package day04.Ex02_생성자;

import java.util.Iterator;

// 학생
// - 변수 : 이름, 나이, 학번, 전공
// - 메소드 : 공부하기, 성적 평균 구하기
public class Student {

	// 변수
	String name;
	int age;
	String stdNo;
	String major;
	
	// 생성자
	// * 단축키 : alt + shift + S -> 0
	// TODO : 기본 생성자 
	public Student() {
		this("이름없음", 0);
//	    this.name = "이름없음";
//	    this.age = 0;
//	    this.stdNo = "0000000";
//	    this.major = "전공없음"; 
	}
	
	public Student(String name, int age) {
		this( name, age, "00000000", "전공없음");
//	    this.name = "이름없음";
//	    this.age = 0;
//	    this.stdNo = "0000000";
//	    this.major = "전공없음"; 		
	}
	
    // * 오버로딩 
	// TODO : 		매개변수가 있는 생성자
	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}
	
	// 메소드 * 접근지정자 반환타입 메소드명( 매개변수 ) { }
	// - 공부하기
	// * void : 반환타입 없음 (return 생략가능)
	// - void 로 지정해도 return 을 메소드를 종료시키는 용도로 사용 할 수있다.
	public void study(String subject) {
		System.out.println( subject + "(을/를) 공부합니다.");
		
		
	
	}
	
	// 성적 평균 구하기
	// * 메소드 오버로딩
	public double getAverage(int score1, int score2) {
		double average = 0.0;
		average = (double) (score1 + score2) / 2;
		return average;
	}
	
	public double getAverage(int score1, int score2, int score3) {
		double average = 0.0;
		average = (double) (score1 + score2 + score3) / 3;
		return average;
    }


	public double getAverage(int[] scores) {
	     int sum = 0;
	     
	     //합계
	     // 최종합계 = 이전합계 + 배열요소
	     for (int score : scores) {
	    	 sum += score;
	     }
			
		// 평균 = 합계 / 개수
     	double average = (double) sum / scores.length;
     	return average;
	}
    
    
}
















