package 스택예제1;

public class ArrayStack implements Stack{

	private int top;
	private int stackSize;
	private char itemArray[];
	
	public ArrayStack(int stackSize) {
		top = -1;
		this.stackSize = stackSize;
		itemArray = new char[this.stackSize];
	}
	
	
	@Override
	public boolean isEmpty() {
		return (top == -1); // top이 -1이면 true; 아니면 false..
	}
	public boolean isFull() {
		return (top == stackSize-1);
	}

	@Override
	public void push(char item) {
		if(isFull()) {
			System.out.println("insert fail! Array Stack is full!!");
		} else {
			itemArray[++top] = item;
			System.out.println("Insert Item! "+ item);
			
		}
	}

	@Override
	public char pop() {
		if(isEmpty()) {
			System.out.println("Delete fail!! Array Stack is empty!!");
			return 0;
		} else {
			return itemArray[top--];
		}
	}

	@Override
	public void delete() {
		
	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.printf("Array Stack is Empty ^^ ");
		} else {
			System.out.printf("Array Stack>> ");
			for(int i=0; i<=top; i++) {
				System.out.printf("%c", itemArray[i]);
			}
			System.out.println();
		}
			
	}
}
