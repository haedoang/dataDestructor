package _7장_스택_정올_알고리즘1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static Scanner scan = new Scanner(System.in);
	private static List<Integer> stack = new ArrayList<>();
	private static int top = -1;
	private static List<String> resultList = new ArrayList<>();
	
	public static void main(String [] args) {
		int count = Integer.parseInt(inputCount());
		if(count >= 1 && count <= 100) {
			for(int i=0; i<count; i++) {
				inputCommand();
			}
		} else return;
		
		//결과출력하기
		for(String result : resultList) {
			System.out.println(result);
		}
	}
	
	
	
	public static String inputCount() {
		return scan.nextLine();
	}
	
	public static void inputCommand() {
		String command = scan.nextLine();
		String[] commandArray = command.split(" ");
		
		switch(commandArray[0]) {
			case "i" : 
				if(
					Integer.parseInt(commandArray[commandArray.length-1])>=1 &&
					Integer.parseInt(commandArray[commandArray.length-1])<=10000	
				) {
					push(Integer.parseInt(commandArray[commandArray.length-1])); break;
				} else return;
			case "o" : resultList.add(pop()+""); break;
			case "c" : resultList.add(printStack()+""); break;
			default: return;
		}
		
		
	}
	
	public static Object pop() {
		if(top < 0) {
			return "empty";
		} else {
			int popData = stack.get(top--);
			stack.remove(stack.size()-1);
			return popData;
		}
		
	}
	public static void push(int item) {
		if(top>stack.size()) {
			System.out.println("overflow");
		} else {
			stack.add(item);
			top++;
		}
		
		
	}
	public static int printStack() {
		return stack.size();
	}
	
}
