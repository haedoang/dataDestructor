package _10장_그래프_예제2;

public class LinkedQueue {
	QNode front;
	QNode rear;
	
	public LinkedQueue() {
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {
		return (front == null);
	}
	
	public void enQueue(int item) {
		QNode newNode = new QNode();
		newNode.data = item;
		newNode.link = null;
		
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.link = newNode;
			rear = newNode;
		}
	}
	
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("delete error:: linked queue is empty");
			return 0;
		} else {
			int item = front.data;
			front = front.link;
			if(front == null) { //삭제하고 linked queue가 1개남아있을 경우 rear설정해주기 
				rear = null;
			}
			
			return item;
		}
		
		
	}
}
