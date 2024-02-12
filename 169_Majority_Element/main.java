class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int count =0;
        int temp =nums[0];
        for(int i=0;i<n;i++){
            if(temp==nums[i]){
                count++;
            }
            else{
                temp=nums[i];
                count = 1;
            }
            if(count>n/2){
                return temp;
            }
        }
        return 0;
    }
}
