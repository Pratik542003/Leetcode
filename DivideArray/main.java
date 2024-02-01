class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        List<int[]> result = new ArrayList<>();
        List<Integer> currentArray = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            currentArray.add(nums[i]);

            if (currentArray.size() == 3 || i == n - 1) {
                if (currentArray.size() == 3 && currentArray.get(2) - currentArray.get(0) <= k) {
                    result.add(currentArray.stream().mapToInt(Integer::intValue).toArray());
                    currentArray.clear();
                } else {
                    
                    result.clear();
                    currentArray.clear();
                    break;
                }
            }
        }

        if (result.size() == n / 3) {
            // Correct number of arrays formed
            return result.toArray(new int[0][]);
        } else {
            // Unable to satisfy conditions
            return new int[][]{};
        }
    }
}
