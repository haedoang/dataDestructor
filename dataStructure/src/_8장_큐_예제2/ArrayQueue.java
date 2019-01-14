package _8장_큐_예제2;

public class ArrayQueue implements Queue {
	private int front;
	private int rear;
	private int queueSize;
	private char itemArray[];
	
	public ArrayQueue(int queueSize) {
		front = 0;
		rear = 0;
		this.queueSize = queueSize;
		itemArray = new char[queueSize];
	}
	
	
	@Override
	public boolean isEmpty() {
		return (front == rear);
	}
	
	
	//원형 큐의 경우 빈공간인지 여부를 판단하기 위해 한 공간은 비워둔다
	public boolean isFull() {
		return (((rear +1) % this.queueSize) == front);
	}

	@Override
	public void enQueue(char item) {
		if(isFull()) {
			System.out.println("Insert fail::circular queue is full");
		} else {
			rear = (rear+1) % this.queueSize;
			itemArray[rear] = item;
			System.out.println("inserted item:"+ item);
		}
	}

	@Override
	public char deQueue() {
		if(isEmpty()) {
			System.out.println("delete error:: circular queue is empty");
			return 0;
		} else {
			front = (front+1) % this.queueSize;
			return itemArray[front];
		}
	}

	@Override
	public void delete() {
		if(isEmpty()) {
			System.out.println("delete error:: circular queue is empty");
		} else {
			front = (front+1) % this.queueSize;
		}
	}

	@Override
	public char peek() {
		if(isEmpty()) {
			System.out.println("peek error:: circular queue is empty");
			return 0;
		} else {
			return itemArray[(front+1) % this.queueSize];
		}
	}
	
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("circular queue is empty");
		} else {
			System.out.printf("circular queue >> ");
			for(int i=(front+1)%this.queueSize;i!=(rear+1)%this.queueSize; i=++i % this.queueSize) {
				System.out.printf("%c",itemArray[i]);
			}
			System.out.println();
			System.out.println();
		}
	}
}
