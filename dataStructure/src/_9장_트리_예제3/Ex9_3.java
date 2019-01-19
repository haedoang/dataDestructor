package _9장_트리_예제3;
/**
 * 
 * 	9장 트리 예제3 p.395
 *  heap구현(순차자료구조방식)
 * */
public class Ex9_3 {
	public static void main(String[] args) {
		int n,item;
		Heap h = new Heap();
		
		
		h.insertHeap(13);
		h.insertHeap(8);
		h.insertHeap(10);
		h.insertHeap(15);
		h.insertHeap(20);
		h.insertHeap(19);
		
		h.printHeap();
		
		n = h.getHeapSize();
		for(int i=1; i<=n;i++) {
			item = h.deleteHeap();
			System.out.printf("\n deleted Item: [%d]",item);
		}
	}
}
