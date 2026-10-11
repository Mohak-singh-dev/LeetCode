class Solution {
    public int countDigitOccurrences(int[] nums, int target) {
        int count =0;
        for (int i=0;i<nums.length;i++){
            int n = nums[i];
            while (n!=0){
                int digit = n%10;
                if (digit == target) count++;
                n/=10;
            }
        }
        return count;
    }
}