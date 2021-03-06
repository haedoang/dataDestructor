package _9장_트리_예제1;

public class LinkedTree {
	private TreeNode root;
	
	public TreeNode MakeBT(TreeNode bt1, Object data, TreeNode bt2) {
		TreeNode root = new TreeNode();
		root.data = data;
		root.left = bt1;
		root.right = bt2;
		
		return root;
	}
	
	//전위
	public void preorder(TreeNode root) {
		if(root != null) {
			System.out.printf("%c", root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	//중위
	public void inorder(TreeNode root) {
		if(root != null) {
			inorder(root.left);
			System.out.printf("%c", root.data);
			inorder(root.right);
		}
	}
	
	//후위
	public void postorder(TreeNode root) {
		if(root!=null) {
			postorder(root.left);
			postorder(root.right);
			System.out.printf("%c", root.data);
		}
	}
}
