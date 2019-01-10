package 스택예제2;

public class LinkedStack implements Stack {
	private StackNode top; //처음은 null
	
	
	@Override
	public boolean isEmpty() {
		return (top == null);
	}

	@Override
	public void push(char item) {
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
		System.out.println("insert Item : "+item);
	}

	@Override
	public char pop() {
		if(isEmpty()) {
			System.out.println("error:: stack is empty");
			return 0;
		} else {
			char item = top.data;
			top = top.link;
			return item;
		}
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("LinkedStack is empty:)");
		} else {
			StackNode temp = top;
			System.out.println("Linked Stack>>");
			while(temp != null) {
				System.out.printf("\t %c \n", temp.data);
				temp = temp.link;
			}
		}
	}
}
