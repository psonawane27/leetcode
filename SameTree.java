/*
Space complexity: min(O(m),O(n))
Time Complexity: min(O(m),O(n))
*/
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        s1.push(p);
        s2.push(q);
        while(!s1.isEmpty() || !s2.isEmpty()){
            TreeNode t1 = s1.pop();
            TreeNode t2 = s2.pop();
            if(t1==null ^ t2==null) return false;
            if(t1==null && t2==null) continue;
            if(t1.val != t2.val) return false;
            s1.push(t1.left);
            s1.push(t1.right);
            s2.push(t2.left);
            s2.push(t2.right);
        }
        return true;
    }

}

/*
Recursive:
public boolean isSameTree(TreeNode p, TreeNode q) {
	if(p==null && q==null) return true;
	if(p==null || q==null) return false;
	return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right) && p.val==q.val);
}
*/