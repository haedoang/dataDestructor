package _조합탐색_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

/*
 *
 * 
 *  3
	3 2
	0 -1
	-1 2
	-1 5
	3 3
	0 -1 -1
	-1 2 -1
	-1 -1 8
	4 3
	0 1 2
	-1 -1 3
	-1 -1 -1
	-1 -1 11
*/
public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int count = Integer.parseInt(inputCount());
		for(int i = 0; i < count ; i++) {
			createRoom(); //방 개수만큼 함수 호출~~ 
		}
		
		
	}
	
	
	public static String inputCount() {
		return scan.nextLine();
	}
	
	public static void createRoom() {
		//필요 정보 방 크기 , x[0][0] 이 무조건 시작 , x[n][m]이 무조건 종료위치 
		String size = scan.nextLine(); // x y로 입력한다 가정하고 ㄱㄱ
		String[] roomSize = size.split(" ");
		int x = Integer.parseInt(roomSize[0]);
		int y = Integer.parseInt(roomSize[1]);
		
		int[][] roomArray = new int[x][y];
		System.out.println(Arrays.toString(roomSize));
			
		inputLocation(x,y,roomArray);
	
	}  
	
	public static void inputLocation(int x, int y, int[][] roomArray) {
		//입력받자;;
		for(int i=0;i<x;i++) {
			String row = scan.nextLine();
			String[] rowArray = row.split(" ");
			for(int j = 0; j < y; j++) {
				roomArray[i][j] = Integer.parseInt(rowArray[j]);
			}
		}
		
		//print test;
//		for(int i=0;i<x;i++) {
//			for(int j=0;j<y;j++) {
//				System.out.println("roomArray["+i+"]["+j+"] = "+roomArray[i][j]);
//			}
//		}
		
		checkLocation(roomArray,x,y);
	}
	
	public static void checkLocation(int[][] roomArray,int row,int col) {
		//0,0 ~ n,m 으로가야죵
		System.out.println("왔어?");
		//좌표지정 
		int x = 0, y = 0;
		
		//이동한 거리 
		int index = 0; // 0~ n*m-1까지
		
		//도착한 곳을 표시하기 위한 배열 선언
		int[][] destination = new int[row][col];
		
		destination[x][y] = roomArray[x][y];

		for(int i=0; i<(row*col-1); i++) {		
			//System.out.println("i:"+i);
			//direction(row,col,roomArray,destination);
	
		}	
//				//아래로이동
//				if(x!=row-1 && roomArray[x+1][y] == index+1 && destination[x+1][y]==0) {
//					System.out.println("roomArray[x+1][y] == index+1");
//					destination[++x][y] = ++index;
//				} 
//				//오른쪽으로 이동
//				if(y!= col-1 && roomArray[x][y+1] == index+1 && destination[x][y+1]==0) {
//					destination[x][++y] = ++index;
//					System.out.println("destination["+x+"]["+y+"]:"+destination[x][y]);
//				} 
//				//좌로 이동
//				if(y!=0 && roomArray[x][y-1] == index+1 && destination[x][y-1]==0) {
//					destination[x][--y] = ++index;
//					System.out.println("destination["+x+"]["+y+"]:"+destination[x][y]);
//				}
//				//위로 이동
//				if(x!=0 && roomArray[x-1][y] == index+1 && destination[x-1][y]==0) {
//					destination[--x][y] = ++index;
//					System.out.println("destination["+x+"]["+y+"]:"+destination[x][y]);
//				}
//				
//				else {
//					//아래로 이동
//					if(x!= row-1 && roomArray[x+1][y] == -1 && destination[x+1][y]==0) {
//						destination[++x][y] = ++index;
//						System.out.println("destination["+x+"]["+y+"]:"+destination[x][y]);
//	
//					} 
//					//우로 이동
//					if(y!=col-1 && roomArray[x][y+1] == -1 && destination[x][y+1]==0) {
//						destination[x][++y] = ++index;
//						System.out.println("destination["+x+"]["+y+"]:"+destination[x][y]);
//					}
//					//좌로 이동
//					if(y!=0 && roomArray[x][y-1] == -1 && destination[x][y-1]==0) {
//						destination[x][--y] = ++index;
//						System.out.println("destination["+x+"]["+y+"]:"+destination[x][y]);
//					}
//					//위로 이동
//					if(x!=0 && roomArray[x-1][y] == -1 && destination[x-1][y]==0) {
//						destination[--x][y] = ++index;
//						System.out.println("destination["+x+"]["+y+"]:"+destination[x][y]);
//					}
//					
//					
//					else {
//						System.out.println("실패"); 
//					}
//				
//				}//outer else 
//				
//			}
//		
//		
//		if(index==(row*col-1)) {
//			System.out.println("index"+ index);
//			System.out.println("성공");
//		}
//		else {
//			System.out.println("index:"+index);
//			System.out.println("실패");
//		}
		
	}
	
	public static boolean left(int x, int y, int[][]roomArray, int index) {
		if(y!=0 && roomArray[x][y-1] == index+1) return true;
		else if(x!=0 && roomArray[x][y-1] == -1) {
			return true;
		}
		else return false;
	}
	
	public static boolean right(int x, int y, int[][]roomArray, int index) {
		if(y!=roomArray[0].length && roomArray[x][y+1] == index+1) return true;
		else if(x!=0 && roomArray[x][y+1] == -1) {
			return true;
		}
		else return false;
	}
	
	public static boolean up(int x, int y, int[][]roomArray, int index) {
		if(x!=0 && roomArray[x-1][y] == index+1) return true;
		else if(x!=0 && roomArray[x-1][y] == -1) {
			return true;
		}
		else return false;
	}
	
	public static boolean down(int x, int y, int[][]roomArray, int index) {
		if(x!=roomArray.length && roomArray[x+1][y] == index+1) return true;
		else if(x!=0 && roomArray[x+1][y] == -1) {
			return true;
		}
		else return false;
	}
	
}
