class Solution {
    public int minimumLength(String s) {
        int res = s.length();
        char[] arr = s.toCharArray();
        for(int start = 0,end = arr.length-1;start < end;){
            if(arr[start] == arr[end]){
                char c = arr[start];
             while(start < end && arr[start] == c ){
                    start++;
                    res--;
                }
                while (end >= start && arr[end] == c){
                    end--;
                    res--;

                }
            }else {
                break;
            }
        }
        return res;
    }
}
