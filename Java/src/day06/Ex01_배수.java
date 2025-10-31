package day06;

import java.util.Scanner;

public class Ex01_배수 {

    // main : ctrl + space
    // - 프로그램 실행 시, 가장 먼저 실행되는 메소드
    public static void main(String[] args) {

        // 정수 하나를 입력받아서
        // 입력받은 수가 3의 배수인지 아닌지 판단하고
        // 그 여부를 출력하는 프로그램

        Scanner sc = new Scanner(System.in);

        // 1. 정수 입력
        System.out.print("정수를 입력하세요: ");
        int N = sc.nextInt();

        // 2. 3의 배수인지 판단
        if (N != 0 && N % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else {
            System.out.println("3의 배수가 아닙니다.");
        }

        // 3. 삼항연산자로도 표현 가능
        String answer = (N != 0 && N % 3 == 0) ? "3의 배수입니다." : "3의 배수가 아닙니다.";
        System.out.println("결과(삼항연산자): " + answer);

        sc.close();
    }
}
