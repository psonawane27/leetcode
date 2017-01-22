/*
Space complexity: max depth of right subtree O(n)
Time Complexity: O(n)
*/
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curr = root;
        if(root == null) return root;
        while(curr!=null){
            TreeNode temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;
            if(curr.right!=null && (curr.right.left != null || curr.right.right != null)) stack.push(curr.right);
            if(curr.left != null){
                curr=curr.left;
            }else if(!stack.isEmpty()){
                curr=stack.pop();
            }else curr = null;
        }
        return root;
    }
}
/*
Space Complexity: O(h)
	public TreeNode invertTree(TreeNode root) {
        
        if (root == null) {
            return null;
        }

        final TreeNode left = root.left,
                right = root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);
        return root;
    }
	public TreeNode invertTree(TreeNode root) {
        
        if (root == null) {
            return null;
        }

        final Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        
        while(!stack.isEmpty()) {
            final TreeNode node = stack.pop();
            final TreeNode left = node.left;
            node.left = node.right;
            node.right = left;
            
            if(node.left != null) {
                stack.push(node.left);
            }
            if(node.right != null) {
                stack.push(node.right);
            }
        }
        return root;
    }
}
*/