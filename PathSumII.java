/*
Space complexity: O(n)
Time Complexity: O(n)
*/
public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curr = root, prev = null;
        int s = 0;
        List<Integer> subList = new ArrayList<Integer>();
        while(curr!=null || !stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                subList.add(curr.val);
                s+=curr.val;
                curr=curr.left;
            }
            curr=stack.peek();
            if(curr.left==null && curr.right==null && s==sum){
                result.add(new ArrayList<Integer>(subList));
            }
            if(curr.right!=null && prev!=curr.right){
                curr=curr.right;
            } else {
                prev=curr;
                stack.pop();
                subList.remove(subList.size()-1);
                s-=curr.val;
                curr=null;
            }
        }
        return result;
    }
}

/*
Recursive:
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList();
        if (root == null) return res;
        dfs(root, sum, res, new ArrayList());
        return res;
    }
    private void dfs(TreeNode root, int target, List<List<Integer>> res, List<Integer> list) {
        if (root == null) return;
        list.add(root.val);
        if (root.left == null && root.right == null && target == root.val)
            res.add(new ArrayList(list));
        dfs(root.left, target - root.val, res, list);
        dfs(root.right, target - root.val, res, list);
        list.remove(list.size() - 1);
    }
}
*/