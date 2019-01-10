package _6장_연결자료구조_예제;

public class ListNode {

	private String data;
	public ListNode link;
	
	public ListNode() {
		this.data=null;	
		this.link=null;
	}
	
	//ref 없는 경우, 즉 마지막 원소
	public ListNode(String data) {
		this.data = data;
		this.link = null;
	}
	
	public ListNode(String data, ListNode link) {
		this.data = data;
		this.link = link;
	}
	
	public String getData() {
		return this.data;
	}

	
	
}
