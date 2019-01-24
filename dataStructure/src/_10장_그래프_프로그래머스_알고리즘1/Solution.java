package _10장_그래프_프로그래머스_알고리즘1;

import java.util.Scanner;

/**
 * 
 * 
 * n개의 노드가 있는 그래프가 있습니다. 각 노드는 1부터 n까지 번호가 적혀있습니다. 1번 노드에서 가장 멀리 떨어진 노드의 갯수를 구하려고 합니다. 가장 멀리 떨어진 노드란 최단경로로 이동했을 때 간선의 개수가 가장 많은 노드들을 의미합니다.

	노드의 개수 n, 간선에 대한 정보가 담긴 2차원 배열 vertex가 매개변수로 주어질 때, 1번 노드로부터 가장 멀리 떨어진 노드가 몇 개인지를 return 하도록 solution 함수를 작성해주세요.
	
	제한사항
	노드의 개수 n은 2 이상 20,000 이하입니다.
	간선은 양방향이며 총 1개 이상 50,000개 이하의 간선이 있습니다.
	vertex 배열 각 행 [a, b]는 a번 노드와 b번 노드 사이에 간선이 있다는 의미입니다.
	입출력 예
	n	vertex	return
	6	[[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]]	3
	입출력 예 설명
	예제의 그래프를 표현하면 아래 그림과 같고, 1번 노드에서 가장 멀리 떨어진 노드는 4,5,6번 노드입니다.
 * 
 * */
public class Solution {
	
	public int solution(int n, int[][] edge) {
        int answer = 0;
        
     
        //인접행렬의 탐색 
//        for(int i=0; i<edge.length;i++) {
//        	for(int j=i; j<edge.length;j++) {
//        		System.out.println("i:j::"+i+","+j);
//        	}
//        }
      
        for(int i=1;i<edge.length;i++) {
        	if(edge[0][i]==0) answer++;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String command = scan.nextLine();
		
		//6, [[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]]
		int n = Integer.parseInt(command.substring(0,command.indexOf(",")));
		if(n < 2 && n > 20000) return;
		
		command = command.substring(command.indexOf("[")+1,command.lastIndexOf("]")).replace(" ", "");
		
		//홀[n 짝 n]
		String[] comArr=command.split(",");
		
		if(comArr.length < 2 && comArr.length > 100000) return;
		
		int[][] edge = new int[n][n];

		for(int i=1; i<comArr.length;i+=2) {
			int a = Integer.parseInt(comArr[i-1].replace("[", ""));
			int b = Integer.parseInt(comArr[i].replace("]", ""));
			edge[a-1][b-1] = 1;
			edge[b-1][a-1] = 1;
		}

		Solution S = new Solution();
		System.out.println(S.solution(n, edge));
		
	}
}
