class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for (int i: nums){
            map.merge(i,1, (o,n)->o+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for (int key: map.keySet()){
            int freq = map.get(key);
            if (bucket[freq]==null) bucket[freq] = new ArrayList<Integer>();
            bucket[freq].add(key);
        }
        int count =0;
        int[] res = new int[k];
        for (int i= nums.length;i>=0 && count<k;i--){
            if (bucket[i]!=null){
                for (int j: bucket[i]){
                    res[count++] = j;
                }
            }
        }
        return res;


    }
}