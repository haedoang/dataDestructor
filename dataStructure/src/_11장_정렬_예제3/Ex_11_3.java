package _11장_정렬_예제3;

/**
 * 
 * 	11장 정렬 예제3 p 475
 *  
 *  퀵 정렬
 * */
public class Ex_11_3 {
	public static void main(String[] args) {
		int a[] = {69,10,30,2,16,8,31,22};
		Sort S = new Sort();
		System.out.printf("\n정렬할 원소 : ");
		for(int i=0; i<a.length;i++) {
			System.out.printf("%3d",a[i]);
		}
		System.out.println();
		
		S.quickSort(a,0,7);
		
	}
}	
