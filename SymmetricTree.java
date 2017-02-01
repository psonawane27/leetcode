/*
Space complexity: O(n)
Time Complexity: O(n)
*/
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root==null) return true;
        queue.offer(root.left);
        queue.offer(root.right);
        while(!queue.isEmpty()){
            TreeNode left=queue.poll();
            TreeNode right=queue.poll();
            if(left==null && right==null) 
                continue;
            if(left==null ^ right==null)
                return false;
            if(left.val != right.val)
                return false;
            if(left.left!=null && right.right!=null){
                queue.offer(left.left);
                queue.offer(right.right);
            }else if(left.left==null ^ right.right==null)
                return false;
            if(left.right!=null && right.left!=null){
                queue.offer(left.right);
                queue.offer(right.left);
            }else if(left.right==null ^ right.left==null)
                return false;
        }
        return true;
    }
}
/*
public boolean isSymmetric(TreeNode root) {
	if(root==null) return true;
	return check(root.left, root.right);
}
public boolean check(TreeNode left, TreeNode right){
	if(left==null || right==null) 
		return left==right;
	return left.val==right.val && check(left.left, right.right) && check(left.right, right.left);
}
*/