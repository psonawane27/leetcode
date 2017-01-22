/*
Space complexity: O(log n)
Time Complexity: O(N)
*/
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> result = new LinkedList<Integer>();
        TreeNode curr = root;
        while(curr != null){
            result.add(curr.val);
            if(curr.right != null) 
                stack.push(curr.right);
            curr = curr.left;
            if(curr == null && !stack.isEmpty()) 
                curr = stack.pop();
        }
        return result;
    }
}