package _9장_트리_예제3;

public class Heap {
	private int heapSize;
	private int itemHeap[];
	
	public Heap() {
		heapSize = 0;
		itemHeap = new int[50];//임의크기선언
	}
	
	public void insertHeap(int item) {
		int i = ++heapSize;
		while((i != 1) && (item > itemHeap[i/2])) {
			itemHeap[i] = itemHeap[i/2];  //부모노드보다 클경우 부모노드를 자식노드에 넣는다.
			i/=2;  // 부모노드에 접근하기 위해 i = i /2 연산을 수행한다.
		}
		itemHeap[i] = item;  //while 문을 탔을 경우(item이 부모노드보다큰경우) 부모노드에 item을 넣어준다. 
	}
	
	public int getHeapSize() {
		return this.heapSize;
	}
	
	public int deleteHeap() {
		int parent, child;
		int item,temp;
		item = itemHeap[1];
		temp = itemHeap[heapSize--];
		parent = 1; child = 2;
		
		while(child <= heapSize) {
			if( (child < heapSize) && itemHeap[child] < itemHeap[child+1] ) child++;
			if(temp >= itemHeap[child]) break;
			
			itemHeap[parent] = itemHeap[child];
			parent = child;
			child *= 2;	
		}
		itemHeap[parent] = temp;
		return item;
	}
	
	public void printHeap() {
		System.out.printf("\nHeap >>> ");
		for(int i=1; i<=heapSize;i++) {
			System.out.printf("[%d] ",itemHeap[i]);
		}
	}
}
