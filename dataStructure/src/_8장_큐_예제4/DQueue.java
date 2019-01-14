package _8장_큐_예제4;

public class DQueue {
	private DQNode front;
	private DQNode rear;
	
	public DQueue() {
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {
		return (front== null);
	}
	
	public void insertFront(char item) {
		DQNode newNode = new DQNode();
		newNode.setData(item);
		
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
			newNode.setLlink(null);
			newNode.setRlink(null);			
		} else {
			front.setLlink(newNode);
			newNode.setRlink(front);
			newNode.setLlink(null);
			front = newNode;
		}
		
		System.out.println("Front insert item: "+ item);
	}
	
	
	public void insertRear(char item) {
		DQNode newNode = new DQNode();
		newNode.setData(item);
		
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
			newNode.setLlink(null);
			newNode.setRlink(null);
		} else {
			rear.setRlink(newNode);
			newNode.setLlink(rear);
			newNode.setRlink(null);
			rear = newNode;	
		}
		
		System.out.println("Rear insert Item : "+ item);
	}
	
	public char deleteFront() {
		if(isEmpty()) {
			System.out.println("delete error:: queue is empty");
			return 0;
		} else {
			char item = front.data;
			//마지막자리라면
			if(front.getRlink()==null) {
				front = null;
				rear = null;
			} else {
				front =front.getRlink();
				front.setLlink(null);
			}
			return item;
		}
	}
	
	public char deleteRear() {
		if(isEmpty()) {
			System.out.println("delete error:: queue is empty");
			return 0;
		} else {
			char item = rear.data;
			//맨앞이면?
			if(rear.getLlink()==null) {
				front = null;
				rear = null;
			} else {
				rear = rear.getLlink();
				rear.setRlink(null);
			}
			return item;
		}
	}
	
	public void removeFront() {
		if(isEmpty()) {
			System.out.println("front remove err::dq is empty");
		} else {
			//마지막이라면
			if(front.getRlink()==null) {
				front = null;
				rear = null;
			} else {
				front =front.getRlink();
				front.setLlink(null);
			}
		}
	}
	
	public void removeRear() {
		if(isEmpty()) {
			System.out.println("rear remove err::dq is empty");
		} else {
			//마지막이라면
			if(rear.getLlink()==null) {
				front = null;
				rear = null;
			} else {
				rear =rear.getLlink();
				rear.setRlink(null);
			}
		}
	}
	
	public char peekFront() {
		if(isEmpty()) {
			System.out.println("front peeking fail:: dqEmpty");
			return 0;
		} else {
			return front.getData();
		}
	}
	
	public char peekRear() {
		if(isEmpty()) {
			System.out.println("rear peeking fail:: dqEmpty");
			return 0;
		} else {
			return rear.getData();
		}
	}
	
	public void printDQueue() {
		if(isEmpty()) {
			System.out.printf("DQueue is Empty! %n %n");
		} else {
			DQNode temp = front;
			System.out.printf("DQueue>>");
			while(temp!= null) {
				System.out.printf("%c",temp.getData());
				temp = temp.getRlink();
			}
			
			System.out.println();
			System.out.println();
		}
	}
}
