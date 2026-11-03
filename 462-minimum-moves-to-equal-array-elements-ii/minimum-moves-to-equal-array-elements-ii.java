class Solution {
    public int minMoves2(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        int avg = nums[nums.length/2];
        int  count = 0;
        for (int i:nums){
            count += Math.abs(avg-i);
        }
        return count;
    }
}