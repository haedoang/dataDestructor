package _8장_큐_예제1;


public class ArrayQueue implements Queue{

	private int front;
	private int rear;
	private int queueSize;
	private char itemArray[];
	
	//Constructor setting
	public ArrayQueue(int queueSize) {
		//Queue의 front rear를 -1 로 초기화 한다.
		front = -1;
		rear = -1;
		this.queueSize = queueSize;
		itemArray = new char[this.queueSize]; 	
	}
	
	public boolean isEmpty() {
		return (front == rear);
	}
	
	public boolean isFull() {
		return (rear == this.queueSize-1);
	}
	
	//Queue 는 rear 위치에 삽입한다.. 
	public void enQueue(char item) {
		if(isFull()) {
			System.out.println("Insert fail:: Queue is full");
		} else {
			itemArray[++rear] = item;
			System.out.println("Inserted Item : "+ item);
		}
		
	}
	
	//Queue는 top의 위치부터 삭제합니다요~ 
	public char deQueue() {
		if(isEmpty()) {
			System.out.println("delete fail:: Queue is Empty");
			return 0;
		} else {
			return itemArray[++front];
		}
	}
	
	
	@Override
	public void delete() {
		if(isEmpty()) {
			System.out.println("Delete fail:: Queue is Empty");
		} else {
			++front; // front를 증가시킨다.
		}
	}

	@Override
	public char peek() {
		if(isEmpty()) {
			System.out.println("peek fail:: queue is Empty");
			return 0;
		} else return itemArray[front+1];
		
	}
	
	public void printQueue() {
		if(isEmpty()) {
			System.out.printf("queue is empty!! %n %n");
		} else {
			System.out.printf("Array Queue >> ");
			for(int i = front+1;i<=rear; i++) {
				System.out.printf("%c",itemArray[i]);
			}
			System.out.println();
			System.out.println(); 
		
		}
	}
}
