package _5장_순차자료구조_퀴즈;

/**
 * 			p.196 연습문제 6번
 * 			희소행렬의 전치 연산을 수행하는 코드를 작성하라.
 * */

class EX6 {
	public static void main(String[] args) {
		//희소배열 선언하기
		int arr[][] = new int[][] {
									{0,0,0,9},
									{0,1,0,0},
									{0,0,0,0},
									{0,0,7,0},
									{0,0,0,0},
									{3,0,0,0},
									{0,0,0,0}
 								  };
			
		
		//0의 개수 체크하는 메서드
		int num = notZero(arr);
		
		//2차원 배열로 변경하기 
		int parseMatrix[][] = new int[num+1][3];  //0아닌개수+1 : 행/열/0아닌개수 + 0아닌개수 행 개수 	
		setTranspose(setParseMatrix(parseMatrix,num,arr),num,arr);
			
	}
	
	//0의개수를 체크하는 메서드
	static int notZero(int[][] arr) {
		int num =0;
		for(int x=0;x<arr.length;x++) {
			for(int y=0;y<arr[0].length;y++) {
				if(arr[x][y]!=0) {
					num++;
				}
			}//inner for
		}//outer for
		return num;
	}
	
	//2차원배열로 변경하는 메서드
	static int[][] setParseMatrix(int[][] parseMatrix,int notZero,int[][] arr) {
		//1행에 행/열/0아닌 개수넣기 
		parseMatrix[0][0] = arr.length;
		parseMatrix[0][1] = arr[0].length;
		parseMatrix[0][2] = notZero;
		int index = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]!=0) {
					parseMatrix[++index][0] = i; 
					parseMatrix[index][1] = j;
					parseMatrix[index][2] = arr[i][j];
				}
			}//inner for
		}//outer for
		
		
		//print
		System.out.println("print::parseMatrix::");
		for(int i=0;i<parseMatrix.length;i++) {
			System.out.print("[");
			for(int j=0;j<parseMatrix[0].length;j++) {
				System.out.print(parseMatrix[i][j]);
			}
			System.out.println("]");
		}

		return parseMatrix;
	}
	
	//희소행렬만드는 메서드
	static int[][] setTranspose(int[][] parseMatrix,int notZero,int[][] arr){
		//transpose 배열 선언
		int[][] transposeArr = new int[3][parseMatrix.length]; 
		
		//1열에 
		transposeArr[0][0] = parseMatrix[0][0];
		transposeArr[1][0] = parseMatrix[0][1];
		transposeArr[2][0] = parseMatrix[0][2];
		int index = 0;
		
		for(int i=0;i<arr.length;i++) {//5
	
			for(int j=0;j<arr[0].length;j++) {//3
				if(arr[i][j]!=0) {			
					transposeArr[0][++index] = i;
					transposeArr[1][index] = j;
					transposeArr[2][index] = arr[i][j];
				}
			}
		}
		
		//print 
		System.out.println("print::Transpose::");
		for(int i=0;i<transposeArr.length;i++) {
			System.out.print("[");
			for(int j=0;j<transposeArr[0].length;j++) {
				System.out.print(transposeArr[i][j]);
			}
			System.out.println("]");
		}
		
		return transposeArr;
	}
	
}


