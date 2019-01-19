package _9장_트리_프로그래머스_알고리즘1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 	문제 : 매운 것을 좋아하는 Leo는 모든 음식의 스코빌 지수를 K 이상으로 만들고 싶습니다. 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 Leo는 스코빌 지수가 가장 낮은 두 개의 음식을 아래와 같이 특별한 방법으로 섞어 새로운 음식을 만듭니다.

	섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
	Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞습니다.
	Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때, 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.
	
	제한 사항
	scoville의 길이는 1 이상 1,000,000 이하입니다.
	K는 0 이상 1,000,000,000 이하입니다.
	scoville의 원소는 각각 0 이상 1,000,000 이하입니다.
	모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return 합니다.
	입출력 예
	scoville	K	return
	[1, 2, 3, 9, 10, 12]	7	2
	입출력 예 설명
	스코빌 지수가 1인 음식과 2인 음식을 섞으면 음식의 스코빌 지수가 아래와 같이 됩니다.
	새로운 음식의 스코빌 지수 = 1 + (2 * 2) = 5
	가진 음식의 스코빌 지수 = [5, 3, 9, 10, 12]
	
	스코빌 지수가 3인 음식과 5인 음식을 섞으면 음식의 스코빌 지수가 아래와 같이 됩니다.
	새로운 음식의 스코빌 지수 = 3 + (5 * 2) = 13
	가진 음식의 스코빌 지수 = [13, 9, 10, 12]
	
	모든 음식의 스코빌 지수가 7 이상이 되었고 이때 섞은 횟수는 2회입니다.
 * 
 *  출처: https://programmers.co.kr/learn/courses/30/lessons/42626?language=java
 * */
public class Solution {
	
	public int solution(int[] scoville, int K) {
        int answer = 0;
        
        while(scoville.length!=1) {
        	Arrays.sort(scoville);  //[1,2,3,9,10,12]  7 
     
        	//K보다 다 클 경우가 아니면 
        	if(isBig(scoville,K) != scoville.length) {
        		if(scoville.length== 1) {
        			answer=-1 ;break;
        		}
        		scoville = shakeScoville(scoville);
        		answer++;	
        	} 
        	else {
        		break;
        	}
        }
        
        return answer;
    }
	
	public int[] shakeScoville(int[] scoville) {
		int result = scoville[0] + scoville[1]*2;
		scoville = Arrays.copyOfRange(scoville, 1, scoville.length);
		scoville[0] = result;
		
		return scoville;
	}
	
	public int isBig(int[] scoville,int K) {
		int result=0;
		for(int s : scoville) {
			if(s > K) {
				result++;
			} 
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String command = scan.nextLine();
		
		//String com = command.substring(command.indexOf("[")+1, command.indexOf("]"));
		int kIndex = command.lastIndexOf(",");
		
		int K = Integer.parseInt(command.substring(kIndex+1));

		//K 0이상 1000000000이하
		if(K < 0 && K >1000000000) return;
		
	//	String[] comArr = com.split(",");
		String[] comArr =  command.substring(command.indexOf("[")+1, command.indexOf("]")).split(",");
		
		int[] scoville = new int[comArr.length];
		
		//scoville 1~ 1,000,000이하 
		if(scoville.length < 1 && scoville.length > 1000000) return;
		
		for(int i=0; i<scoville.length;i++) {
			if(scoville[i]<0 && scoville[i]>1000000) return;
			scoville[i] = Integer.parseInt(comArr[i]);
		}
		
		Solution S = new Solution();
		System.out.println(S.solution(scoville, K));
	}
}
