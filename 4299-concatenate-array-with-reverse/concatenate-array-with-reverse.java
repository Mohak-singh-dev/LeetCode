class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length,i=0,j=0;
        int[] result = new int[2*n];
        for (i=0;i<n;i++){
            result[i] = nums[i];
        }
        for (j=0;j<n;j++){
            result[i+j] = nums[n-j-1];
        }
    return result;
    }
}