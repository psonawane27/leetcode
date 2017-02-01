/*
Space complexity: O(n)
Time Complexity: O(n)
*/
public class SumRoottoLeafNumbers {
    public int sumNumbers(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curr = root, prev = null;
        int sum = 0, num = 0;
        while(curr!=null || !stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                num = num * 10 + curr.val;
                curr = curr.left;
            }
            curr = stack.peek();
            if(curr.left == null && curr.right == null){
                sum += num;
            }
            if(curr.right != null && prev != curr.right){
                curr = curr.right;
            }else{
                prev = curr;
                stack.pop();
                num /= 10;
                curr = null;
            }
        }
        return sum;
    }
    
}
/*
public int sumNumbers(TreeNode root) {
	return DFS(root, 0);
}

public int DFS(TreeNode root, int sum){
	if(root == null) return 0;
	sum = sum*10 + root.val;
	if(root.left == null && root.right == null) return sum;
	return DFS(root.left, sum) + DFS(root.right, sum);
}
*/