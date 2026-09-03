class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totalSum = 0;
        int lSum=0;
        for (int j:nums){
            totalSum+=j;
        }
        int result[] = new int[nums.length]; 
        for (int i =0;i<nums.length;i++){
            result[i] = Math.abs(totalSum - nums[i] - lSum);
            totalSum -= nums[i];
            lSum+=nums[i];
        }
        return result;
    }
}