package programmers;

import java.util.Stack;

public class Solution {

    public String solution(String my_string) {
        String answer = "";
        Stack<Character> stack = new Stack<Character>();   // ① 문자 저장용 스택 생성
        char[] chList = my_string.toCharArray();           // ② 문자열 → 문자 배열로 변환

        // ③ 문자 배열의 각 문자를 스택에 넣기 (push)
        for(char ch : chList) {
            stack.push(ch);
        }

        // ④ 스택에서 하나씩 꺼내서(answer 뒤에 더하기) 역순 문자열 만들기
        while(!stack.isEmpty()) {
            answer += stack.pop();
        }

        // ⑤ 결과 확인용 출력 (콘솔에 찍기)
        System.out.println(answer);

        // ⑥ 뒤집힌 문자열 반환
        return answer;
    }

    public static void main(String[] args) {
        new Solution().solution("안녕하세요");
    }
}
