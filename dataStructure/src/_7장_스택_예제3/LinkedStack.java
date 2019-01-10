package _7장_스택_예제3;

public class LinkedStack implements Stack{
	private StackNode top;
	
	@Override
	public boolean isEmpty() {
		return (top == null);
	}

	@Override
	public void push(char item) {
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top =newNode;
		//System.out.println("Insert item: "+ item );
	}

	@Override
	public char pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return 0;
		} else {
			char item = top.data;
			top = top.link;
			
			return item;
		}
	}
	
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("stack is empty");
		} else {
			StackNode temp = top;
			System.out.println("Linked Stack >> ");
			while(temp != null) {
				System.out.printf("\t %c \n", temp.data);
				temp = temp.link;
			}
			System.out.println();
		}
	}
}
