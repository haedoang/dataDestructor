package _11장_정렬_예제1;
/**
 * 
 *	11장 정렬 p.460
 *  선택 정렬 : 처음 원소와 가장 작은 원소를 비교하여 자리를 바꾸며 진행..  
 */
 
public class Sort {
	public void selectionSort(int[] a) {
		int i,j,min;
		
		for(i=0;i<a.length-1;i++) {
			min=i;
			for(j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) min = j; //a[1] < a[0]
			}
			
			swap(a,min,i);
			System.out.printf("\n선택 정렬 %d 단계 : ",i+1);
			for(j=0;j<a.length;j++) {
				System.out.printf("%3d", a[j]);
			}
		}
	}
	
	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
