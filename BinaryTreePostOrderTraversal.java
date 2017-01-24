/*
Space complexity: O(n)
Time Complexity: O(n)
*/
public class BinaryTreePostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curr=root, prev=null;
        List<Integer> result = new ArrayList<Integer>();
        while(curr!=null || !stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.peek();
            if(curr.right!=null && prev!=curr.right){
                curr=curr.right;
            }else{
                prev=curr;
                result.add(curr.val);
                stack.pop();
                curr=null;
            }
        }
        return result;
    }
}

/*
Reverse preorder:
public List<Integer> postorderTraversal(TreeNode root) {
	LinkedList<Integer> ans = new LinkedList<>();
	Stack<TreeNode> stack = new Stack<>();
	if (root == null) return ans;
	
	stack.push(root);
	while (!stack.isEmpty()) {
		TreeNode cur = stack.pop();
		ans.addFirst(cur.val);
		if (cur.left != null) {
			stack.push(cur.left);
		}
		if (cur.right != null) {
			stack.push(cur.right);
		} 
	}
	return ans;
}
*/