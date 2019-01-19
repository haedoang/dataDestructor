package _9장_트리_예제2;

/**
 * 
 * 	9장 트리 예제2 p.383
 * 
 *  이진트리 탐색
 * */
public class Ex9_2 {
	public static void main(String[] args) {
		BinarySearchTree bsT = new BinarySearchTree();
		bsT.insertBST('G');
		bsT.insertBST('I');
		bsT.insertBST('H');
		bsT.insertBST('D');
		bsT.insertBST('B');
		bsT.insertBST('M');
		bsT.insertBST('N');
		bsT.insertBST('A');
		bsT.insertBST('J');
		bsT.insertBST('E');
		bsT.insertBST('Q');
		
		System.out.printf("\nBinary Tree >>> ");
		bsT.printBST();
		
		System.out.printf("Is there \"A\" ? >>>");
		TreeNode p1 = bsT.searchBST('A');
		if(p1 != null) System.out.printf("Searching success! searched key : %c \n",p1.data);
		
		else System.out.printf("Searching fail! thire is no %c \n",p1.data);
		
		System.out.printf("Is there \"Z\" ? >>>");
		TreeNode p2 = bsT.searchBST('Z');
		if(p2 != null) System.out.printf("Searching success! searched key : %c \n",p2.data);
		
		else System.out.printf("Searching fail! \n");
		
		
	}
}
