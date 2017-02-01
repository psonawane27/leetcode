/*
Space complexity: O(n)
Time Complexity: O(n)
*/
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode prev=null, curr=root;
        List<String> result = new LinkedList<String>();
        StringBuilder path = new StringBuilder();
        while(curr!=null || !stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                if(curr!=null)
                path.append(Integer.toString(curr.val)+"->");
                curr=curr.left;
            }
            curr=stack.peek();
            if(curr.left==null && curr.right==null){
                path.delete(path.length()-2, path.length());
                result.add(new String(path));
            }
            if(curr.right!=null && curr.right!=prev)
                curr=curr.right;
            else{
                prev=curr;
                stack.pop();
                curr=null;
                if(path.charAt(path.length()-1)=='>')
                    path.delete(path.length()-2, path.length());
                int i=path.length()-1;
                while(path.charAt(i)!='>' && path.length()!=1){
                    path.deleteCharAt(i);
                    i--;
                }
            }
        }
        return result;
    }
}
/*
public List<String> binaryTreePaths(TreeNode root) {
    List<String> answer = new ArrayList<String>();
    if (root != null) searchBT(root, "", answer);
    return answer;
}
private void searchBT(TreeNode root, String path, List<String> answer) {
    if (root.left == null && root.right == null) answer.add(path + root.val);
    if (root.left != null) searchBT(root.left, path + root.val + "->", answer);
    if (root.right != null) searchBT(root.right, path + root.val + "->", answer);
}
*/