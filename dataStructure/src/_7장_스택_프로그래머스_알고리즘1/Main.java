package _7장_스택_프로그래머스_알고리즘1;

import java.util.Scanner;
import java.util.Stack;
/**
 * 	프로그래머스 스택/큐 : 쇠막대기
 *  링크 : https://programmers.co.kr/learn/courses/30/lessons/42585
 *  java.util.Stack을 이용한 풀이 
 * 
 * */
public class Main {
	static private Scanner scan = new Scanner(System.in);
	
	public int solution(String arrangement) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<arrangement.length();i++) {
        	switch(arrangement.charAt(i)) {
        		case '(' : 	
        			stack.push(arrangement.charAt(i));
        			break; 	
        		case ')' : 
        				if(arrangement.charAt(i-1)=='(') {
        					stack.pop();
        					answer += stack.size();
        				}
        				else {
        					stack.pop();
        					answer++;
        				}
        				break;
        	}
        }
        return answer;
    }

	public static void main(String[] args) {
		String input = scan.nextLine();
		if(input.length() <= 100000) {
			Main s = new Main();
			int result = s.solution(input);
			System.out.println(result);
		} else return;
		
	}
}