package _7장_스택_알고리즘;

import java.util.Scanner;
/**
 * 			1차원 배열 사용해서 풀기 
 * */
public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//start
		int count = Integer.parseInt(inputCount());
		String[] resultArray= new String[count];
		if(count >= 1 && count <= 100) {
			for(int i=0; i<count; i++) {
				resultArray[i] = inputBrackets();
			}		
		}
		
		for(String result : resultArray) {
			System.out.println(result);
		}
		
	}
	
	public static String inputCount() {
		return scan.nextLine();
	}
	
	public static String inputBrackets() {
		return checkValue(scan.nextLine());
	}
	
	public static String checkValue(String bracket) {
		//char 저장할 배열 선언 
		char[] stackArray = new char[bracket.length()/2];
		int top = -1;
		for(int i=0;i<bracket.length();i++) {
			char testCh = bracket.charAt(i);
			
			switch(testCh) {
				case '(' : 
				case '{' :
				case '[' :
					stackArray[++top] = bracket.charAt(i); break;
				case ')' :
				case '}' :
				case ']' : 
					if(
						stackArray[top] == '(' && testCh ==')' ||
						stackArray[top] == '{' && testCh =='}' ||
						stackArray[top] == '[' && testCh ==']') {
						top--;
						break;
					}
					else {
						return "NO";
					}
			}
		}
		
		return "YES";
		
	}
	
	
}
