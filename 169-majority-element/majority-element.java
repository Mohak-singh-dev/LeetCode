class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length,max=0;
        for(int i =0;i<n;i++){
            int count = 0;
            for (int j=i;j<n;j++){
                if (nums[i]==nums[j]){
                    count++;
                }
            }
            if(n==1){
                max = nums[0];
            }
            else if (count>n/2){
                max = nums[i];
            }
        }
        return max;
    }
}