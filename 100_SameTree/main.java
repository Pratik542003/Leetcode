class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p!=null&&q!=null&&p.val==q.val){
            boolean t=isSameTree(p.left,q.left);
            boolean r=isSameTree(p.right,q.right);
            
            return (t&&r);
        }
        if(p==null&&q==null){
        return true;
        }
        else
        {
            return false;
        }
        
    }
}
