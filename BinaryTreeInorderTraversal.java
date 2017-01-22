/*
Morris Traversal[create links to inorder successor]
Space complexity: O(1)
Time Complexity: O(N)
*/
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<Integer>();
        TreeNode curr = root;
        while(curr != null){
            if(curr.left == null){
                result.add(curr.val);
                curr=curr.right;
            }
            else{
                TreeNode pre = curr.left;
                while(pre.right != null && pre.right != curr)
                    pre=pre.right;
                if(pre.right == null){
                    pre.right=curr;
                    curr=curr.left;
                } else{
                    pre.right=null;
                    result.add(curr.val);
                    curr=curr.right;
                }
            }
        }
        return result;
    }
}
/*
Space Complexity: O(n)
	List<Integer> list = new ArrayList<Integer>();

    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode cur = root;

    while(cur!=null || !stack.empty()){
        while(cur!=null){
            stack.add(cur);
            cur = cur.left;
        }
        cur = stack.pop();
        list.add(cur.val);
        cur = cur.right;
    }

    return list;
*/