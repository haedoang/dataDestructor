package _6장_연결자료구조_퀴즈;

public class LinkedList {
	public ListNode head;
	
	public LinkedList() {
		head = null;
	}
	
	
	//1. 주소록 조회하기	
	public void printList() {
		ListNode temp = this.head;
		System.out.println("<주소록>");
		System.out.println("----------------------------------------------");
		System.out.println("[이름]         [연락처]        [이메일]        [주소값]        [link]");
		while(temp != null) {
			System.out.printf("%s          %s   %s    %s   %s\n",temp.getAddress().getName(),temp.getAddress().getContact(),temp.getAddress().getMail(),temp,temp.link);
			temp = temp.link;
		}
		
		System.out.println("----------------------------------------------");
	}

	
	//2. 주소록 추가하기
	public void insertLastNode(Address address) {
		//head가 null인지 체크 
		ListNode newNode = new ListNode(address);
		if(head == null) {
			this.head = newNode;  //리스트 비었을 때
		} else {
			ListNode temp = head;
			while(temp.link != null) {
				//마지막노드로 이동
				temp = temp.link;		
			}
				temp.link = newNode;
			
		}//else end 
	}
	
	//3. 이름 검색 후 삭제 
	//3.1 이름검색
	public ListNode searchNode(String name) {
		ListNode temp = this.head;
		
		while(temp != null) {
			if(name.equals(temp.getAddress().getName())) { //String 비교 
				return temp;
			} else {
				temp = temp.link;							// 없으면 null처리
			}	
		}

		return temp;	
	}
	//3.2 주소록삭제 : 파라미터로 삭제할 node를 받는다. 
	public void deleteNode(ListNode target) {
		ListNode nodeList = this.head; 
		ListNode pre = this.head;
		
		//비어있을 경우
		if(head == null) {
			System.out.println("주소록이 존재하지 않습니다.");
			return; 
		}
		
		//첫번째 자리일 경우
		if(head == target) {
			head = target.link;
			System.out.println("주소록 삭제완료.");
			return;
		}
		
		//그 외 
		while(nodeList != null) {
			if(pre.link == target) {
				System.out.println("주소록 삭제완료.");
				pre.link = target.link;	
				return;
			} 
			else {
				pre = nodeList;
				nodeList = nodeList.link;
			}		
		}		
	}

	
}
