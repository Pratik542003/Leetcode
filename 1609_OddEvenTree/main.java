class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        if(root ==null){
            return true;
        }
        Queue<TreeNode> q = new LinkedList<>();
        boolean flag = true;
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            int prev = 0;
            if(flag){
                prev = Integer.MIN_VALUE;
            }
            else{
                prev =Integer.MAX_VALUE;
            }
            for(int i=0;i<n;i++){
                TreeNode BTNode = q.poll();
                
                if(flag){
                    if(BTNode.val%2==0||BTNode.val<=prev){
                        return false;
                    }
                }
                else{
                    if(BTNode.val%2!=0|| BTNode.val>=prev){
                        return false;
                    }
                }
                if(BTNode.left!=null){
                    q.offer(BTNode.left);
                }
                if(BTNode.right!=null){
                    q.offer(BTNode.right);
                }
                prev = BTNode.val;
            }
            flag =!flag;
        }
        return true;
    }
}
