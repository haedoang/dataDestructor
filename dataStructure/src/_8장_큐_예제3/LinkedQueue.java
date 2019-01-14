package _8장_큐_예제3;

public class LinkedQueue implements Queue{
	private Qnode front;
	private Qnode rear;
	
	public LinkedQueue() {
		front = null;
		rear = null;
	}
	
	@Override
	public boolean isEmpty() {
		return (front == null);
	}

	@Override
	public void enQueue(char item) {
		Qnode newNode = new Qnode();
		newNode.data = item;
		newNode.link = null;
		
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.link = newNode;
			rear = newNode;
		}
		System.out.println("insert item: "+item);
	}

	@Override
	public char deQueue() {
		if(isEmpty()) {
			System.out.println("delete error:: queue is empty");
			return 0;
		} else {
			char item = front.data;
			front = front.link;
			if(front == null) 
				rear = null;
			return item;
		}
	}

	@Override
	public void delete() {
		if(isEmpty()) {
			System.out.println("delete fail:: queue is empty");
		} else {
			front = front.link;
			if(front == null)
				rear = null;
		}
	}

	@Override
	public char peek() {
		if(isEmpty()) {
			System.out.println("peak error:: queue is empty");
			return 0;
		} else {
			return front.data;				
		}
	}

	public void printQueue() {
		if(isEmpty()) {
			System.out.printf("Linked Queue is empty %n %n");
		} else {
			Qnode temp = front;
			System.out.printf("linked Queue>>");
			while(temp!= null) {
				System.out.printf("%c",temp.data);
				temp = temp.link;
			}//while
			System.out.println();
			System.out.println();
		}
	}
}
