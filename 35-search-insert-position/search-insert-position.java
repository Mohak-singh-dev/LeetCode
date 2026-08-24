class Solution {
    public int bin(int[] nums,int low,int high,int key){
        int mid = 1;
        while(low<=high){
            mid = low +(high-low)/2;
            if (nums[mid]==key){
                return mid;
            }
            else if (nums[mid]>key){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public int searchInsert(int[] nums, int target) {
        int result = bin(nums,0,nums.length-1,target);
        // if (nums[result]<target){
        //     return result+1;
        // }
        return result;
    }
}