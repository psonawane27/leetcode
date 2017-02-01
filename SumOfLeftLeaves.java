/*
Space complexity: O(width)
Time Complexity: O(n)
*/
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null) return 0;
        queue.offer(root);
        while(queue.size() > 0){
            TreeNode curr = queue.poll();
            if(curr.left != null){
                if(curr.left.left == null && curr.left.right == null)
                    sum += curr.left.val;
                else
                    queue.offer(curr.left);
            }
            if(curr.right != null){
                queue.offer(curr.right);
            }
            
        }
        return sum;
    }
}
/*
public int sumOfLeftLeaves(TreeNode root) {
    if(root == null) return 0;
    int ans = 0;
    if(root.left != null) {
        if(root.left.left == null && root.left.right == null) ans += root.left.val;
        else ans += sumOfLeftLeaves(root.left);
    }
    ans += sumOfLeftLeaves(root.right);
    
    return ans;
}
*/