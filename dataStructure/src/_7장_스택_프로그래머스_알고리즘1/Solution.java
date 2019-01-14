package _7장_스택_프로그래머스_알고리즘1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 	프로그래머스 스택/큐 : 쇠막대기
 *  링크 : https://programmers.co.kr/learn/courses/30/lessons/42585
 *   
 * 
 * */
public class Solution {
	static private Scanner scan = new Scanner(System.in);
	
	public int solution(String arrangement) {
        int answer = 0;
        List<Character> list = new ArrayList<>();

     
        for(int i=0;i<arrangement.length();i++) {
        	System.out.println("index:"+arrangement.charAt(i));
        	switch(arrangement.charAt(i)) {
        		case '(' : 	
        			list.add(arrangement.charAt(i)); break; 	
        		case ')' : 
        				if(arrangement.charAt(i-1)=='(') {
        					list.remove(list.size()-1);
        					answer += list.size();
        				}
        				else {
        					list.remove(list.size()-1);
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
			Solution s = new Solution();
			int result = s.solution(input);
			System.out.println(result);
		} else return;
		
	}
}