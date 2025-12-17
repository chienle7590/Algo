package ZigZagHW;

public class ZigZagSolution {
    
    public static int Solution(TreeNode root) {
        
        if (root == null) return 0;
        
        int largestZigZag = 0;
        
        if (root.left != null) largestZigZag = Math.max(largestZigZag, makeTurn(root.left, "Left"));
        
        if (root.right != null) largestZigZag = Math.max(largestZigZag, makeTurn(root.right, "Right"));
        
        return largestZigZag;
    }
    
    public static int makeTurn(TreeNode node, String prevDirection) {
        
        int largestZigZag = 0;
        
        if (node == null) return 0;
        
        if (node.left != null) {
            int countTurn = (prevDirection.equals("Right")) ? 1 : 0;
            int totalTurn = countTurn + makeTurn(node.left, "Left");
            largestZigZag = Math.max(largestZigZag, totalTurn);
        }
        
        if (node.right != null) {    
            int countTurn = (prevDirection.equals("Left")) ? 1 : 0;  
            int totalTurn = countTurn + makeTurn(node.right, "Right");
            largestZigZag = Math.max(largestZigZag, totalTurn);
        }
        
        return largestZigZag;
    }
}
