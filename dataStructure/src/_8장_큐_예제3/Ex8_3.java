package _8장_큐_예제3;
/**
 * 	8장 큐 예제3 p.333
 *  연결큐(Linked Queue) 구현하기
 * */
public class Ex8_3 {
	public static void main(String[] args) {
		char deletedItem;
		LinkedQueue LQ = new LinkedQueue();
		
		LQ.enQueue('A');
		LQ.printQueue();
		
		LQ.enQueue('B');
		LQ.printQueue();
		
		deletedItem = LQ.deQueue();
		if(deletedItem != 0) 
			System.out.println("deleted item:"+ deletedItem);
		LQ.printQueue();
		
		LQ.enQueue('C');
		LQ.printQueue();
		
		deletedItem = LQ.deQueue();
		if(deletedItem != 0) 
			System.out.println("deleted item:"+ deletedItem);
		LQ.printQueue();
		
		deletedItem = LQ.deQueue();
		if(deletedItem != 0) 
			System.out.println("deleted item:"+ deletedItem);
		LQ.printQueue();
		
		deletedItem = LQ.deQueue();
		if(deletedItem != 0) 
			System.out.println("deleted item:"+ deletedItem);
		LQ.printQueue();
		
		
		
		
	}
}
