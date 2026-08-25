class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length, i;
        if (n>1){
            for (i =k;i<=k*n;i+=k){
            int flag =0;
            for (int j=0;j<n;j++){
                if (i==nums[j]){
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                return i;
            }
        }
        return i;
        }
        else{
            if (nums[0]==k){
                return k*2;
            }else{
                return k;
            }
        }
    }
}