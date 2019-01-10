package _6장_연결자료구조_퀴즈;


/**
 * 		p.257 연습4
 * 		주소록 프로그램 단순 연결리스트 만들기
 * 		조건1) 주소록은 이름 , 전화번호, 메일주소를 저장할수 있어야함.
 * 		조건2) 새로운 사람에 대한 주소록 삽입 연산하기
 * 		조건3) 새로운 노드는 항상 주소록 마지막에 삽입
 * 		조건4) 지정한 이름에 대한 노드를 주소록에서 검색하여 삭제할 수 있어야 함
 * */
public class Ex4 {
	public static void main(String[] args) {
		//자료구조 선언
		LinkedList L = new LinkedList();
		Menu menu = new Menu();
		
		while(true) {	
			switch(menu.selectMenu()) {
				case 1: menu.contactList(L); break;
				case 2: menu.addContact(L); break;
				case 3: menu.deleteContact(L); break;
				case 4: menu.closeMenu(); break;
			}//sw end
		}//while end
	}//main end 
}//class end 
