/*
Space complexity: max number of nodes at any level
Time Complexity: O(N)
*/
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root == null) 
            return result;
        queue.offer(root);
        while(!queue.isEmpty()){
            int lsize = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0; i<lsize; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            result.add(0, subList);
        }
        return result;
    }
}