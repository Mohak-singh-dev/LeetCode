class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        for (int n: nums){
            if(n>max){
                max = n;
            }
        }
        int res = 0;
        for (int r:nums){
            res += max-r;
        }
        return res;
    }
}