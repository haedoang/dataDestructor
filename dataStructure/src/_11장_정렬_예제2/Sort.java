package _11장_정렬_예제2;

public class Sort {
	
	public void bubbleSort(int a[]) {
		int i,j, temp, size;
		size = a.length;
		for(i=size-1; i> 0 ; i--) {
			System.out.printf("\n버블 정렬 %d 단계 : ",size-i);
			for(j=0; j<i; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				System.out.printf("\n\t");
				for(int k=0;k<size;k++) {
					System.out.printf("%3d  ", a[k]);
				}
			}
		}
	}
}
