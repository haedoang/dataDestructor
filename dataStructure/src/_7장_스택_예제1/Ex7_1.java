package _7장_스택_예제1;

/**
 * 		p.269 예제1
 * 		순차 자료구조 방식을 이용한 스택 구현하기
 * */
public class Ex7_1 {
	
	public static void main(String[] args) {
		int stackSize= 5;
		char deletedItem;
		ArrayStack s = new ArrayStack(stackSize);
		
		s.push('A');
		s.printStack();
		
		s.push('B');
		s.printStack();
		
		s.push('C');
		s.printStack();
		
		deletedItem = s.pop();
		if(deletedItem != 0) {
			System.out.println("deleted Item: "+ deletedItem);
			s.printStack();
		}
		
	}
}
