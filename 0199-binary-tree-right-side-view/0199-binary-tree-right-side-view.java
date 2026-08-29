/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    void solve(List<Integer> him,TreeNode root,int l){
        if(root==null){
            return;
        }
        if(him.size()<l){
            him.add(root.val);
        }
        solve(him,root.right,l+1);
        solve(him,root.left,l+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
List<Integer> him=new ArrayList<>();
        solve(him,root,1);
        return him;
    }
}





// class Solution {
//     public List<Integer> rightSideView(TreeNode root) {
//         if(root==null){
//           return  new ArrayList<>();
//         }
//         List<Integer> ans=new ArrayList<>();
//         Queue<TreeNode> him=new LinkedList<>();
//         him.add(root);
//         while(!him.isEmpty()){
//             int n=him.size();
//             int last=-1;
//             while(n>0){
//             TreeNode p=him.poll();
//             last=p.val;
//             if(p.left!=null){
//                 him.add(p.left);
//             }
//             if(p.right!=null){
//                 him.add(p.right);
//             }
//             n--;
//             }

//       ans.add(last);
//         }
//         return ans;
//     }
// }