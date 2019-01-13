package _7장_스택_프로그래머스_알고리즘1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static Scanner scan = new Scanner(System.in);
//	private static List<Character,String> stack = new ArrayList<>();
	private static List<Stick> stack = new ArrayList<>();
	private static List<Integer> laser = new ArrayList<>();
	public static void main(String[] args) {
		String result = input();
		String[] stringArray = result.split("");
		//System.out.println(Arrays.toString(stringArray));
		
		//findLaser(stringArray);
		check(stringArray);
		
	}
	
	static String input() {
		return scan.nextLine();
	}
	
	static void check(String[] stringArray) {
		for(int i=0;i<stringArray.length; i++) {
			switch(stringArray[i].charAt(0)) {
				case '(':
					if(stringArray[i+1].charAt(0)=='(') {
						Stick stick = new Stick();
						stick.setStart(i);
						stack.add(stick);
					} else {
						laser.add(i);
					}
						
				case ')':
			}
		}
		
	}	
		
	
}
class Stick{
	private int start;
	private int end;
	
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	
}
