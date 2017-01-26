/*
Space complexity: O(n)
Time Complexity: O(n)
*/
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return balanced(root) != -1;
    }
    public int balanced(TreeNode node){
        if(node == null) return 0;
        int lh = balanced(node.left);
        if(lh == -1) return -1;
        int rh = balanced(node.right);
        if(rh == -1) return -1;
        
        if(Math.abs(lh - rh) > 1)  return -1;
        return Math.max(lh, rh) + 1;
    }
}

/*
Recursive:

Space complexity: O(n)
Time Complexity: O(n^2)

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return Math.abs(getHeight(root.left)-getHeight(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right);
    }
    public int getHeight(TreeNode node){
        if(node==null) return 0;
        return (1+Math.max(getHeight(node.left), getHeight(node.right)));
    }
}
*/