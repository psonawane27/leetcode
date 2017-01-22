/*
Space complexity: O(n)
Time Complexity: O(n)
*/
public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int L = minDepth(root.left), R = minDepth(root.right);
        return 1 + (Math.min(L, R) > 0 ? Math.min(L, R) : Math.max(L, R));
    }
}

/*
public int minDepth(TreeNode root) {
	if (root == null)
		return 0;
	int depth = 1;
	Queue<TreeNode> queue = new LinkedList<TreeNode>();
	TreeNode temp,magic = new TreeNode(0);
	queue.add(root);
	queue.add(magic);
	while(!queue.isEmpty()){
		temp = queue.poll();
		if(temp.equals(magic)){
		    if(!queue.isEmpty()){
		        depth++;
			    queue.add(magic);
		    }
		    continue;
		}
		if(temp.left == null && temp.right == null)
			return depth;
		if(temp.left != null)
			queue.add(temp.left);
		if(temp.right != null)
			queue.add(temp.right);
	}
	return depth;
}
*/