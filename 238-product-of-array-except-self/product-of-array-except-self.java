class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftArr = new int[n];
        int[] rightArr = new int[n];
        int[] res = new int[n];
        leftArr[0] = 1;
        rightArr[n-1] = 1;
        for (int i=1;i<n;i++){
            leftArr[i] = nums[i-1] * leftArr[i-1]; 
        }
        for (int i=0;i<n-1;i++){
            rightArr[n-i-2] = nums[n-i-1] * rightArr[n-i-1]; 
        }
        for (int i=0;i<n;i++){
            res[i] = rightArr[i] * leftArr[i];
        }
        return res;
    }
}