package ZigZagHW;

public class Main {
	 public static void main(String[] args) {
	 Tree tree = new Tree();
     
     TreeNode node5 = new TreeNode(5);
     TreeNode node20 = new TreeNode(20);
     TreeNode node10 = new TreeNode(10);
     TreeNode node25 = new TreeNode(25);
     TreeNode node15 = new TreeNode(15);
     TreeNode node12 = new TreeNode(12);
     TreeNode node30 = new TreeNode(30);
     TreeNode node9 = new TreeNode(9);
     
     tree.root = node5;
     node5.left = node20;
     node5.right = node10;
     node20.right = node25;
     node10.left = node15;
     node10.right = node12;
     node15.right = node30;
     node30.left = node9;
     
     // Now your tree is built exactly as specified
     System.out.println(ZigZagSolution.Solution(tree.root));
 }
}


