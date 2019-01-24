package _11장_정렬_프로그래머스_알고리즘2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제 : 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

	예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
	
	array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
	1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
	2에서 나온 배열의 3번째 숫자는 5입니다.
	배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
	
	제한사항
	array의 길이는 1 이상 100 이하입니다.     O 
	array의 각 원소는 1 이상 100 이하입니다.   O
	commands의 길이는 1 이상 50 이하입니다.   O
	commands의 각 원소는 길이가 3입니다.      O
	입출력 예
	array	commands	return
	[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
	입출력 예 설명
	[1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
	[1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
	[1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.
 * 
 * 출처 : https://programmers.co.kr/learn/courses/30/lessons/42748
 * */
public class Solution {
	 
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        for(int i=0;i<commands.length;i++) {
        	answer[i]=cut(array,commands,i);
        }        
        return answer;
    }
	
	public int cut(int[]array, int[][] commands, int index) {
		int start=0,end=0,k=0,min,temp;
		
		start = commands[index][0];
		end = commands[index][1];
		k =commands[index][2]-1;  //index니까 1빼기
		
		int[] newArray = Arrays.copyOfRange(array, start-1, end);
		
		//System.out.println(Arrays.toString(newArray));
		//정렬하기
		
		for(int i=0;i<newArray.length-1;i++) {
			min = i;
			for(int j=i+1;j<newArray.length;j++) {
				if(newArray[min] > newArray[j]) {
					temp = newArray[min];
					newArray[min] = newArray[j];
					newArray[j] = temp;
				}
			}
		}
		
		return newArray[k];
	}
	
	
	// 입력 	[1, 5, 2, 6, 3, 7, 4], [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String command = scan.nextLine();
		//배열 과 구할 값 자르기 
		int arrEnd = command.indexOf("]");
		int findStart = command.indexOf("[[");

		//array 만들기 
		String arr= command.substring(0,arrEnd+1); //[1, 5, 2, 6, 3, 7, 4]
		//[ ] 제거 , 제거 
		String[] stringArr = arr.substring(arr.indexOf("[")+1,arr.indexOf("]")).split(","); //[1,  5,  2,  6,  3,  7,  4]
		
		int[] array = new int[stringArr.length];
		//array 조건  1)
		if(array.length < 1 || array.length > 100) return;
		
		for(int i=0;i<array.length;i++) {
			//array 조건2) 
			if(Integer.parseInt(stringArr[i].trim()) < 1 || Integer.parseInt(stringArr[i].trim()) > 100 ) {
				return;
			}
			else{
				array[i] = Integer.parseInt(stringArr[i].trim());
			}
		}

		
		String com = command.substring(findStart,command.length()); //[[2, 5, 3], [4, 4, 1], [1, 7, 3]]
		//command 조건1)
		if(com.length() < 1 || com.length() > 50) return;
		
		//[ ] 제거
		com = com.substring(com.indexOf("[")+1,com.lastIndexOf("]")-1); //[2, 5, 3], [4, 4, 1], [1, 7, 3]
	
		//commands 배열별로 자르기
		String[] comArr= com.replace("[","").split("],"); // [ 2, 5, 3,  4, 4, 1,  1, 7, 3] comArr length :3 
	
		//command 조건2)
		for(String s : comArr) {
			String[] countArr = s.split(",");
			if(countArr.length!=3) return;
		}

		//commands 2차원배열 만들기
		int[][] commands = new int[comArr.length][3];
		
		for(int i=0;i<commands.length;i++) {
			String[] comArr2 = comArr[i].split(",");
			for(int j=0;j<commands[0].length;j++) {
				commands[i][j] = Integer.parseInt(comArr2[j].trim());
			}
		}
		
		
		//print
//		for(int i=0;i<commands.length;i++) {
//			for(int j=0;j<commands[0].length;j++) {
//				System.out.println("commands["+i+"]["+j+"]:"+commands[i][j]);
//			}
//		}
		
		Solution S = new Solution();
		System.out.println(Arrays.toString(S.solution(array, commands)));
		
	}
}
