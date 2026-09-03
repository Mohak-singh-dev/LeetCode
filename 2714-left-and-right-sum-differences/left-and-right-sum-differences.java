class Solution {
    private int sum(int[] arr,int low,int high){
        int sum=0;
        for (int i=low;i<high;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        for(int i=0;i<len;i++){
            int lSum = sum(nums,0,i);
            int rSum = sum(nums,i+1,len);
            result[i] = Math.abs(lSum-rSum);
        }
        return result;
    }
}