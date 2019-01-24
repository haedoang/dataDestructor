package _10장_그래프_프로그래머스_알고리즘2;

import java.util.Scanner;

public class Solution {
	
	public int solution(int[] numbers, int target) {
	    int answer = 0;
	    int index=0;
	    
	    while(true) {
	    	if(sum(numbers,target)!=target) {
	    		numbers[index++]=-1;
	    		sum(numbers,target);
	    	}
	    	else {
	    		answer++;
	    	break;
	    	}
	    }
        	
	    return answer;
	}
	
	
	
	public int sum(int[] numbers, int target) {
		int result = 0;
		for(int n : numbers) result+=n;
		
	
		return result;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String command = scan.nextLine();
		
		//target 
		int target = Integer.parseInt(command.substring((command.lastIndexOf(",")+1)).trim());
		if(target<1 && target > 1000) return;

		//array 
		String[] comArr = command.substring(command.indexOf("[")+1, command.indexOf("]")).split(",");
		//2개이상 20개 이하
		if(comArr.length<2 && comArr.length > 20) return;
		
		int[] numbers = new int[comArr.length];
		
		for(int i =0; i<numbers.length;i++) {
			if(Integer.parseInt(comArr[i].trim()) < 1 && Integer.parseInt(comArr[i].trim()) > 50) return;
			else {
				numbers[i] = Integer.parseInt(comArr[i].trim());
			}
		}

		Solution S = new Solution();
		System.out.println(S.solution(numbers, target));
		
	}
}
