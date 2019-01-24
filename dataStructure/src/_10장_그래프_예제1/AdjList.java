package _10장_그래프_예제1;


/**
 * 
 * 	연결리스트로 그래프 표현하기
 *  정점이 추가될 경우 head[]에 추가가 된다. ex) 정점 A B C >> head[0] ==> A head[1] ==> B 
 *  head[n]에 추가된 정점으로부터 연결된 정점이 link에 추가된다. ex) A B 연결 : head[0].link = B   
 *  
 * */
public class AdjList {
	private GraphNode head[] = new GraphNode[10];
	private int totalV=0;
	
	public void insertVertex(int v) {
		totalV++;
	}
	
	public void insertEdge(int v1,int v2) {
		if(v1>=totalV || v2>=totalV) {
			System.out.println("그래프에 없는 정점입니다.");
		} else {
			GraphNode gNode = new GraphNode();
			gNode.vertex = v2;
			gNode.link = head[v1];
			head[v1] = gNode;            	                     
		}
	}
	
	public void printAdjList() {
		GraphNode gNode = new GraphNode();
		for(int i=0; i<totalV; i++) {
			System.out.printf("\n정점 %c의 인접리스트", i+65); //char type 출력하기 
			gNode = head[i];
			while(gNode != null) {
				System.out.printf("-> %c",gNode.vertex+65);
				gNode = gNode.link;
			}
		}
	}
	
}
