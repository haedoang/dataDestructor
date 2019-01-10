package _7장_스택_예제2;

/**
 * 		p.274 예제2
 * 		연결 자료구조 방식을 이용한 스택 구현하기
 * */
public class Ex7_2 {
	public static void main(String[] args) {
		char deletedItem;
		LinkedStack LS = new LinkedStack();
		
		
		LS.push('A');
		LS.printStack();
		
		LS.push('B');
		LS.printStack();
		
		LS.push('C');
		LS.printStack();
		
		deletedItem = LS.pop();
		if(deletedItem != 0) {
			System.out.println("deleted Item :" + deletedItem);
		}
		
		LS.printStack();
	}
}
