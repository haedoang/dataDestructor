package _10장_그래프_예제1;

/**
 * 	10장 그래프 p.411
 *  그래프의 인접 행렬과 인접리스트 표현
 * */
public class AdjMatrix {
	private int matrix[][] = new int[10][10]; // 인접 행렬 
	private int totalV=0; //정점의 수 
	
	//정점 추가
	public void insertVertex(int v) {
		totalV++;
	}
	
	//간선 추가 , 파라미터 정점1 정점2
	public void insertEdge(int v1, int v2) {
		if(v1>=totalV || v2>=totalV) {
			System.out.println("그래프에 없는 정점입니다.");
		} else {
			matrix[v1][v2] = 1; // 정점을 연결한 경우 1 없는 경우 0(default)
		}
	}
	
	public void printMatrix() {
		for(int i=0; i<totalV; i++) {
			System.out.printf("\n\t\t");
			for(int j=0; j<totalV; j++) {
				System.out.printf("%2d", matrix[i][j]);
			}
		}
	}
}
