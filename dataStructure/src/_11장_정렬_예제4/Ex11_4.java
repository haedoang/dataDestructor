package _11장_정렬_예제4;
/**
 * 	11장 정렬 예제4 p.481
 *  삽입정렬 이해하기 
 * 
 * */
public class Ex11_4 {
	public static void main(String[] args) {
		
		int[] a = {69,10,30,2,16,8,31,22};
		int size = a.length;
		Sort S = new Sort();
		System.out.printf("\n정렬할 원소 : ");
		for(int i=0; i<a.length; i++) {
			System.out.printf(" %d", a[i]);
		}
		System.out.println();
		S.insertionSort(a, size);
		
	}
}
