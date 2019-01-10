package 연결자료구조;

public class LinkedList {
	private ListNode head;
	
	public LinkedList() {
		head = null;
	}

	//중간 삽입 
	public void insertMiddleNode(ListNode pre, String data) {
		ListNode newNode = new ListNode(data);
		newNode.link = pre.link;
		pre.link = newNode;
		
	}
	//마지막 삽입
	public void insertLastNode(String data) {
		ListNode newNode = new ListNode(data);
		if(head == null){
			this.head = newNode; //시작 정하기 .
		} else {
			ListNode temp = head;
			
			while(temp.link != null) {
				temp = temp.link;
			}
			temp.link = newNode;
		}
	}
	
	//마지막 삭제
	public void deleteLastNode() {
		ListNode pre, temp;
		if(head == null) return;
		if(head.link == null) {
			head = null; 
		} else {
			pre = head;
			temp = head.link;
			while(temp.link != null) {
				pre = temp;
				temp = temp.link;
			}
			pre.link = null;
		}
	}
	
	//노드 검색 
	public ListNode searchNode(String data) {
		ListNode temp = this.head;
		while(temp != null) {
			if(data == temp.getData()) {
				return temp;
			} else {
				temp = temp.link;
			}
		}
		return temp;
	}
	
	public void reverseList() {
		ListNode next = head;
		ListNode current = null;
		ListNode pre= null;
		while(next != null) {
			pre = current;
			current = next;
			next = next.link;
			current.link = pre;
		}
		head = current;
	}
	
	public void printList() {
		ListNode temp = this.head;
		System.out.printf("L = (");
		
		while(temp != null) {
			System.out.printf(temp.getData());
			temp = temp.link;
			if(temp != null) {
				System.out.printf(",");
			}
		}
		System.out.println(")");
		
	}
	
	
}
