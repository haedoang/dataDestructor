package _11장_정렬_프로그래머스_알고리즘1;

import java.util.Scanner;
//done
/**
 * 	문제 : 
 * 
 * 문제 설명
	함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
	
	제한 조건
	n은 1이상 8000000000 이하인 자연수입니다.
	입출력 예
	n	return
	118372	873211
 * */
class Solution {
	  public long solution(long n) {
	      long answer = 0;
	      
	      //배열로 받기
	      String command = n+"";
	      String[] comArr = command.split("");
	      
	      //큰 순으로 정렬하자..
	      String temp; 
	      int max;
	      for(int i=0;i<comArr.length-1;i++) {
	    	  max=i;
	    	  System.out.println("i:"+i);
	    	  for(int j=i+1;j<comArr.length;j++) {
	    		  if(Integer.parseInt(comArr[max]) < Integer.parseInt(comArr[j])) {
	    			  temp = comArr[max];
	    			  comArr[max] = comArr[j];
	    			  comArr[j] = temp;
	    		  }
	    	  }
	      }
	      
	      for(int i=0,j=comArr.length-1-i;i<comArr.length;i++,j--) {
	    	  answer += Integer.parseInt(comArr[i]) * Math.pow(10, j); 
		 }
	      return answer;
	  }
	  
	  
	  public static void main(String[] args) {
		  Scanner scan  = new Scanner(System.in);
		  String num = scan.nextLine(); 
		  
		  //변환하기 
		  String[] arr = num.split("");
		 
		  long n = 0;
		  for(int i=0,j=arr.length-1-i;i<arr.length;i++,j--) {
			n += Integer.parseInt(arr[i]) * Math.pow(10, j); 
		  }
		  if( n > 800000000L )  return;
	
		  Solution S = new Solution();
		  System.out.println(S.solution(n));
	  }
}