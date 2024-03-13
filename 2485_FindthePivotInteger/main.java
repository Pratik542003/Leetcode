class Solution {
    public int pivotInteger(int n) {
        int []prefixsum = new int[n+1];
        for(int i=1;i<=n;i++){
            prefixsum[i] = prefixsum[i-1]+i;
        }
        for(int x=1;x<=n;x++){
            int leftsum = prefixsum[x-1];
            int rightsum = prefixsum[n]-prefixsum[x];
            if(leftsum==rightsum){
                return x;
            }
        }
        return -1;
    }
}
