package _8장_큐_예제1;

public interface Queue {
	boolean isEmpty();
	void enQueue(char item);
	char deQueue();
	void delete(); 
	char peek(); // front data 검색하기
}
