package _8장_큐_예제1;
/**
 * 	8장 예제  p.313 
 *  선형 큐 만들기 
 * */
public class Ex8_1 {
	public static void main(String[] args) {
		int queueSize = 3;
		char deletedItem;
		ArrayQueue Q = new ArrayQueue(queueSize);
		
		
		Q.enQueue('A');
		Q.printQueue();
		
		Q.enQueue('B');
		Q.printQueue();
		
		
		
		deletedItem = Q.deQueue();  //'A'
		if(deletedItem != 0) {
			System.out.println("deleted Item : " + deletedItem);  // Queue 데이터 없으면 0 return 하기 떄문에
			Q.printQueue();
		}
		
		Q.enQueue('C');
		Q.printQueue();
		
		
		deletedItem= Q.deQueue(); //'B'
		if(deletedItem != 0) {
			System.out.println("deleted Item: "+ deletedItem);
			Q.printQueue();
		}
		
		deletedItem= Q.deQueue(); //'C'
		if(deletedItem != 0) {
			System.out.println("deleted Item: "+ deletedItem);
			Q.printQueue();
		}
		
		deletedItem= Q.deQueue(); //'empty'
		if(deletedItem != 0) {
			System.out.println("deleted Item: "+ deletedItem);
			Q.printQueue();
		}
	}
}
