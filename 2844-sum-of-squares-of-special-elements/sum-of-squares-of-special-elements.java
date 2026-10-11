class Solution {
    public int sumOfSquares(int[] nums) {
        int result =0;
        int len = nums.length;
        for (int i=0;i<len;i++){
            int index = i+1;
            if (len%index==0){
                result += nums[i] * nums[i];
            }
        }
        return result;
        // return IntStream.range(1,len+1)
        //                 .filter(i-> len%i==0 )
        //                 .map(i-> nums[i-1]*nums[i-1])
        //                 .sum();
    }
}