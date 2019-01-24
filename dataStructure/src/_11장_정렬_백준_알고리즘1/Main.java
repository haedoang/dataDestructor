package _11장_정렬_백준_알고리즘1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * 문제 : 
 * 수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.

	산술평균 : N개의 수들의 합을 N으로 나눈 값
	중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
	최빈값 : N개의 수들 중 가장 많이 나타나는 값
	범위 : N개의 수들 중 최댓값과 최솟값의 차이
	N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.
	
	입력
	첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 그 다음 N개의 줄에는 정수들이 주어진다. 입력되는 정수의 절댓값은 4,000을 넘지 않는다.
	
	출력
	첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
	
	둘째 줄에는 중앙값을 출력한다.
	
	셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
	
	넷째 줄에는 범위를 출력한다.
	
	예제 입력 1 
	5
	1
	3
	8
	-2
	2
	예제 출력 1 
	2
	2
	1
	10
	예제 입력 2 
	1
	4000
	예제 출력 2 
	4000
	4000
	4000
	0
	예제 입력 3 
	5
	-1
	-2
	-3
	-1
	-2
	예제 출력 3 
	-2
	-2
	-1
	2

	출처 : https://www.acmicpc.net/problem/2108
 * */
public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String ...args) {
				
		int numCnt = scan.nextInt();
				
		if(numCnt <1 && numCnt > 500000) return;
		int[] array = new int[numCnt];
		
		for(int i=0;i<numCnt;i++) {
			int num = input();
			if(Math.abs(num) > 4000) return;
			else {
				array[i] = num;
			}
		}
	
		int arithemetic = arithmetic(array);
		//System.out.println(arithemetic);
		
		int median = median(array);
		//System.out.println(median);
		
		int mode = mode(array);
		System.out.println(mode);
		
		int range = range(array);
		//System.out.println(range);
		
	}
	//숫자 입력
	public static int input() {
		return scan.nextInt();
	}
	
	//산술평균
	public static int arithmetic(int[] array) {
		double result=0;
		for(int num : array) result += num;

		return (int)Math.round(result/array.length);
	}
	
	//중앙값
	public static int median(int[] array) {
		//정렬하기
		int min,temp;
		
		for(int i=0;i<array.length-1;i++) {
			min = i;
			for(int j=i+1;j<array.length;j++) {
				if(array[min] > array[j]) {
					temp = array[min];
					array[min] = array[j];
					array[j] = temp;
				}
			}
		}
		
		return array[array.length/2];
	}
	
	//최빈값
	public static int mode(int[] array) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<array.length; i++) {
			//map에 키가 없을 경우 map에 넣기
			if(!map.containsKey(array[i])) {
				map.put(array[i], 1);
			}
			//map에 키가 있을 경우 value++하기
			else {
				map.put(array[i],map.get(array[i])+1);	
			}
		}
		
		List<Integer> list = sortByValue(map);
		
		
		return 1110;
	}
	
	public static List sortByValue(final Map map) {
		List<Integer> list = new ArrayList<>();
		list.addAll(map.keySet());
		
		Collections.sort(list, new Comparator() {
		
			@Override
			public int compare(Object o1, Object o2) {
				Object v1 = map.get(o1);
				Object v2 = map.get(o2);
				
				return ((Comparable)v2).compareTo(v1);
			}
		});
		return list;
	}
	
	
	
	//범위
	public static int range(int[] array) {		
		return array[array.length-1] - array[0];
	}
}












