package _7장_스택_알고리즘;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**	
 * 			list 사용해서 풀기 
 * */
public class Main2 {
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
		List<Character> stackArray = new ArrayList<>();
		int top = -1;
		for(int i=0;i<bracket.length();i++) {
			char testCh = bracket.charAt(i);
			
			switch(testCh) {
				case '(' : 
				case '{' :
				case '[' :
					stackArray.add(++top, testCh); break;
				case ')' :
				case '}' :
				case ']' : 
					if(
						
						stackArray.get(top) == '(' && testCh ==')' ||
						stackArray.get(top) == '{' && testCh =='}' ||
						stackArray.get(top) == '[' && testCh ==']') {
						stackArray.remove(top--);
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
