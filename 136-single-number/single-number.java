class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res=0;
        for (int i: nums){
            map.merge(i,1,(o,n)->o+n);
        }
        for (int j: map.keySet()){
            if (map.get(j)==1){
                res = j;
                break;
            }
        }
        return res;
    }
}