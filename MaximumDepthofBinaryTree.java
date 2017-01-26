/*
Space complexity: O(n)
Time Complexity: O(n)
*/
public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curr=root, prev=null;
        int depth=0, maxDepth=0;
        while(curr!=null || !stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
                depth++;
            }
            curr=stack.peek();
            if(curr.left==null && curr.right==null && depth>maxDepth)
                maxDepth=depth;
            if(curr.right!=null && curr.right!=prev)
                curr=curr.right;
            else{
                prev=curr;
                stack.pop();
                curr=null;
                depth--;
            }
        }
        return maxDepth;
    }

}

/*
Recursive:
	if(root==null) return 0;
    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
*/