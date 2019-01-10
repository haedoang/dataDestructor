package 연습4;

import java.util.Scanner;

//메뉴 클래스
public class Menu {
	private Scanner scan = new Scanner(System.in);
	
	//메뉴선택
	public int selectMenu() {
		System.out.println("[[[[[[[메뉴]]]]]]]");
		System.out.println("1. 주소록 조회하기");
		System.out.println("2. 주소록 추가하기 ");
		System.out.println("3. 주소록 삭제하기 ");
		System.out.println("4. 종료");
		System.out.println("----------------");
		System.out.print("번호를 선택하세요:");
		
		return Integer.parseInt((scan.nextLine()));
	}
	
	//1. 주소록 조회
	public void contactList(LinkedList L) {
		//linkedList.head != null ? System.out.println("주소록이 존재하지 않습니다."); : linkedList.printList();
		if(L.head == null) {
			System.out.println("주소록이 존재하지 않습니다.");
		} else {
			L.printList();
		}
	}
	
	//2. 주소록 추가
	public void addContact(LinkedList L) {
		Address addr = new Address();

		System.out.print("Name:");
		addr.setName(scan.nextLine());
		System.out.print("Contact:");
		addr.setContact(scan.nextLine());
		System.out.println("Mail:");
		addr.setMail(scan.nextLine());
		
		L.insertLastNode(addr);
		System.out.println("주소록 추가 성공!");
	}
	
	//3. 주소록 이름 검색해서 삭제
	
	//3.1 이름 검색
	public void deleteContact(LinkedList L) {
		//이름 찾기 
		System.out.print("주소록에서 삭제할 이름을 입력해주세요:");
		ListNode temp = L.searchNode(scan.nextLine());
		
		
		if(temp==null) {
			System.out.println("검색실패::주소록에 존재하지 않습니다.");
		} else {
			L.deleteNode(temp);
		}
	
	}

	//4. 메뉴 종료
	public void closeMenu() {
		System.exit(0);
	}
	
	
	
}
