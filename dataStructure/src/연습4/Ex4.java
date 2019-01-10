package 연습4;

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
