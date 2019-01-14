package _8장_큐_예제4;

public class Ex8_4 {
	public static void main(String[] args) {
		char deletedItem;
		DQueue DQ = new DQueue();
		
		DQ.insertFront('A');
		DQ.printDQueue();
		
		DQ.insertFront('B');
		DQ.printDQueue();
		
		DQ.insertRear('C');
		DQ.printDQueue();
		
		deletedItem = DQ.deleteFront();
		if(deletedItem != 0) {
			System.out.println("front deleted Item : "+ deletedItem);
			DQ.printDQueue();
		}
		
		deletedItem = DQ.deleteRear();
		if(deletedItem != 0) {
			System.out.println("rear deleted Item : "+ deletedItem);
			DQ.printDQueue();
		}
		
		
		DQ.insertRear('D');
		DQ.printDQueue();
		
		DQ.insertFront('E');
		DQ.printDQueue();
		
		DQ.insertFront('F');
		DQ.printDQueue();
		
		
	}
}
