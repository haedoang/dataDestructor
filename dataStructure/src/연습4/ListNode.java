package 연습4;

public class ListNode {
	public ListNode link;	
	private Address address = new Address();
	
	
	public ListNode() {
		this.address = null;
		this.link = null;
		
	}
	//마지막 원소 일때  
	public ListNode(Address addAddress) {
		address.setName(addAddress.getName());
		address.setContact(addAddress.getContact());
		address.setMail(addAddress.getMail());
		this.link =null;
		
	}
	
	public Address getAddress() {
		return address;
	}
	
	
	
	
	
	
}
