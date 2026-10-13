class Solution {
    public int countKDifference(int[] nums, int k) {
        int n=nums.length;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.merge(i,1,(O,N)->O+N);
        }
        for(int i=0;i<n;i++){
            int target = nums[i] + k;
            if (map.containsKey(target)) count+=map.get(target);
        }
        return count;
    }
}