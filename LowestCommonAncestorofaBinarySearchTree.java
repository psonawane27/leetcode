/*
Space complexity: O(1)
Time Complexity: O(n)
*/
public class LowestCommonAncestorofaBinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(true){
            if (root == null || root == p || root == q) 
                return root;
            if(root.val < p.val && root.val < q.val) 
                root=root.right;
            if(root.val > p.val && root.val > q.val) 
                root=root.left;
            else
                return root;
        }
    }
}
