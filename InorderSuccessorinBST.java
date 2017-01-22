/*
Space complexity: O(1)
Time Complexity: O(h)
*/
public class InorderSuccessorinBST {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode succ = null;
        while (root != null) {
            if (p.val < root.val) {
                succ = root;
                root = root.left;
            }
            else
                root = root.right;
        }
        return succ;
    }
}
/*
Space Complexity: O(h)
	public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode result=null, curr=root, prev=null;
        while(curr!=p){
            if(curr.val<p.val) curr=curr.right;
            else {
                prev=curr;
                curr=curr.left;
            }
        }
        if(curr.right!=null){
            result=curr.right;
            while(result.left!=null)
                result=result.left;
        }else result=prev;
        return result;
    }
*/