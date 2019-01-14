package _8장_큐_예제2;
/**
 * 	 8장 큐 예제 2 p.322
 *   원형 큐 구현하기
 * */
public class Ex8_2 {
	public static void main(String[] args) {
		int queueSize = 4;
		char deletedItem;
		ArrayQueue Q = new ArrayQueue(queueSize);
		
		Q.enQueue('A');
		Q.printQueue();
		
		Q.enQueue('B');
		Q.printQueue();
		
		deletedItem = Q.deQueue();
		if(deletedItem != 0) {
			System.out.println("deleted Item: "+deletedItem);
		}
		Q.printQueue();
		
		
		Q.enQueue('C');
		Q.printQueue();
		
		Q.enQueue('D');
		Q.printQueue();
		
		Q.enQueue('E');
		Q.printQueue();
		
		
	}
}
