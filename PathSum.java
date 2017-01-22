/*
Space complexity: O(n)
Time Complexity: O(n)
*/
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        Queue<TreeNode> nodeQ = new LinkedList<TreeNode>();
        Queue<Integer> sumQ = new LinkedList<Integer>();
        int s;
        if(root==null) return false;
        nodeQ.offer(root);
        sumQ.offer(root.val);
        while(!nodeQ.isEmpty()){
            TreeNode curr = nodeQ.poll();
            int ancSum = sumQ.poll();
            if(curr.left==null && curr.right==null && ancSum==sum) return true;
            if(curr.left!=null){
                s = ancSum + curr.left.val;
                nodeQ.offer(curr.left);
                sumQ.offer(s);
            }
            if(curr.right!=null){
                s = ancSum + curr.right.val;
                nodeQ.offer(curr.right);
                sumQ.offer(s);
            }
        }
        return false;
    }
}

/*
public boolean hasPathSum(TreeNode root, int sum) {
   if(root == null){
     return false;
   }
   if(root.left == null && root.right == null){
      return (root.val == sum);
   }
   return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
   	   
}
*/