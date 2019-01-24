package _11장_정렬_예제3;

public class Sort {
	int i = 0;
	
	public int partition(int[] a, int begin, int end) {
		int pivot,temp,L,R,t;
		
		L= begin;
		R= end;
		pivot = (begin+end)/2;
		System.out.printf("\n [퀵정렬 %d 단계 : pivot=%d ]\n",++i,a[pivot]);
		while(L<R) {
			while((a[L] <= a[pivot]) && (L < R)) L++;
			while((a[R] > a[pivot]) && (L < R)) R--;

			if(L<R) {
				temp = a[L];
				a[L] = a[R];
				a[R] = temp;
				
				if(L==pivot) {
					//L과 R 우너소를 교환하여, 피봇우너소의 위치가 변경된 경우
					for(t=0;t<a.length;t++) {
						System.out.printf("%3d ",a[t]);
					}
					System.out.println();
					return R;
				}//if
				
				
			}//outer if
		}//while
		
		//(L>R이된경우)
		temp = a[pivot];
		a[pivot] = a[R];
		a[R] = temp;
		for(t=0;t<a.length;t++) {
			System.out.printf("%3d  ", a[t]);
		}
		System.out.println();
		return R;
		
	}
	
	public void quickSort(int a[], int begin, int end) {
		if(begin < end) {
			int p;
			p = partition(a,begin,end);
	
			quickSort(a,begin,p-1);
			quickSort(a,p+1,end);
			
		}
	}
	
}
