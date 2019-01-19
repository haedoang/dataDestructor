package _9장_트리_예제1;
/**
 * 	9장 트리 예제1 	p.370
 * 	
 * 	이진트리 만들기(전위,중위,후위)
 * 
 * */
public class Ex9_1 {
	public static void main(String[] args) {
		LinkedTree T = new LinkedTree();
		
		TreeNode n7 = T.MakeBT(null, 'D', null);
		TreeNode n6 = T.MakeBT(null, 'C', null);
		TreeNode n5 = T.MakeBT(null, 'B', null);
		TreeNode n4 = T.MakeBT(null, 'A', null);
		TreeNode n3 = T.MakeBT(n6, '/', n7);
		TreeNode n2 = T.MakeBT(n4, '*', n5);
		TreeNode n1 = T.MakeBT(n2, '-', n3);
		
		System.out.printf("\n Preorder : ");
		T.preorder(n1);
		
		System.out.printf("\n Inorder : ");
		T.inorder(n1);
		
		System.out.printf("\n Postorder : ");
		T.postorder(n1);
		
	}
}
