package programmers;

import java.util.Stack;

public class Solutions {

	public String solution(String my_string) {
		String answer = "";
		Stack<Character> stack = new Stack<Character>();
		char[] chList = my_string.toCharArray();
		for(char ch : chList) {
			stack.push(ch);
		}
		while( ! stack.isEmpty() ) {
			answer += stack.pop();
		}
		System.out.println(answer);
		return answer;
	}
	public static void main(String[] args) {
		new Solution().solution("안녕하세요");
	}
}
